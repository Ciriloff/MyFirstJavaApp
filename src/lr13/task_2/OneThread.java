package lr13.task_2;

public class OneThread {
    public static void main(String[] args)throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t5 = new Thread(() -> {
            for (int i = 1; i <= 10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t5.start();
        t5.join();

        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Время выполнения: " + time/1000 + " сек");
    }
}
