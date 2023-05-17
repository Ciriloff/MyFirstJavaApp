package lr13.task_1;

import java.time.LocalTime;

public class TwoTread {
    public static void main(String[] args)throws InterruptedException {
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t3.setName("Поток №1");
        t4.setName("Поток № 2");

        t3.start();
        t4.start();

        t3.join();
        t4.join();
    }
}
