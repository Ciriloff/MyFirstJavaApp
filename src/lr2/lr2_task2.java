package lr2;
import java.util.Scanner;
public class lr2_task2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите число, которое делится на 5 с остатком 2 или на 7 с остатком 1: ");
        int num = vvod.nextInt();
        if(num % 5 == 2) {
            System.out.println("Ваше число делится на 5 c остатком 2");
        }
        else if (num % 7 == 1) {
            System.out.println("Ваше число делится на 7 c остатком 1");
        }
       else {
           System.out.println("Ваше число не соответствует заданным критериям");
        }
        vvod.close();
    }
}
