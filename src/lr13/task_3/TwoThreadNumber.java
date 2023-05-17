package lr13.task_3;

public class TwoThreadNumber {
    private static final Object time = new Object();
    private static int number = 1;

    public static void main(String[] args) {
        Thread oneThread = new Thread(() -> {
            synchronized (time){
                while (number < 10){
                    if (number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            Thread.sleep(1000);
                            time.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    time.notifyAll();
                }
            }
        });
        Thread twoThread = new Thread(() -> {
            synchronized (time){
                while (number < 10){
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            Thread.sleep(1000);
                            time.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    time.notifyAll();
                }
            }
        });
        oneThread.setName("Первый поток");
        twoThread.setName("Второй поток");

        oneThread.start();
        twoThread.start();
    }
}
