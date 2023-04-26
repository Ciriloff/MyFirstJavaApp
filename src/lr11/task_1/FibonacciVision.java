package lr11.task_1;

public class FibonacciVision {
    private static int step = 0;
    public static void main(String[] args) {
        int y = 6;
        System.out.println("Значение " + y + "-го элемента равно " + fact(y));
    }
    public static int fact(int n){
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            int x = fact(n - 2) + fact(n - 1);
            step++;
            space();
            System.out.println("" + x + " <-");
            return x;
        }
    }
    public static void space() {
        for (int i = 0; i < step; i++){
            System.out.print(" ");
        }
    }
}
