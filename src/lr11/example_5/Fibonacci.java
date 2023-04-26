package lr11.example_5;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fact(3));
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
            return x;
        }
    }
}
