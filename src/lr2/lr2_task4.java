package lr2;
import java.util.Scanner;
public class lr2_task4 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите число в диапазоне от 5 до 10: ");
        int num = vvod.nextInt();
        if (num >= 5 & num <= 10 ){
            System.out.printf("Введенное число %d находится в заданном диапазоне", num);
        } else {
            System.out.print("Ваше число за пределами диапазона!");
        }
        vvod.close();
    }
}
