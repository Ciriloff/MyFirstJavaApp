package lr6;
import  java.util.Scanner;
import  java.util.Arrays;
class Square {
    private static int n;
    public static int sumSquare (int m){
        n = m;
        int sum = 0;
        for (int i = 1; i < (n+1); i++){
            sum += Math.pow(i,2);
        }
        return sum;
    }
}
public class Lr6_Task5 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите число для расчета суммы квадратов чисел: ");
        int num = vvod1.nextInt();
        System.out.println("Сумма квадратов натуральных чисел до " + num + " включительно, равна " + Square.sumSquare(num));
    }
}
