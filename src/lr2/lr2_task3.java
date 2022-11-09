package lr2;
import java.util.Scanner;
public class lr2_task3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите число, которое делится на 4 и не меньше 10: ");
        int num = vvod.nextInt();
        if (num >= 10 & num % 4 == 0 ){
            System.out.printf("Введенное число %d делится на 4 и не меньше 10  ", num);
        } else {
            System.out.print("Ваше число не соответствует заданным параметрам");
        }
        vvod.close();
    }
}
