package lr13.task_4;

public class TenThreadTwo {
    public static void main(String[] args)throws InterruptedException {
        for (int i = 0; i < 10; i++){
            new HelloThread().start();
        }
        System.out.println(Thread.currentThread().getName() + ": " + " Основной поток");
    }
    private static class HelloThread extends Thread{
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + ": " + toString(Thread.currentThread().getName()));
        }

        private char toString(String name) {
            return name.charAt(name.length() - 1);
        }
    }
}
