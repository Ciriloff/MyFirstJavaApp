package lr2;
import java.util.Scanner;
public class lr2_task1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = vvod.nextInt();
        if(num % 3 == 0) {
            System.out.println("Ваше число делится на 3 без остатка");
        } else {
            System.out.println("Ваше число не делится на 3");
        }
        vvod.close();
    }
}
