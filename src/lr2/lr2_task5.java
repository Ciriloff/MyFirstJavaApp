package lr2;
import java.util.Scanner;
public class lr2_task5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int num = vvod.nextInt();
        int bob = num / 1000;
        if (bob >0){
            System.out.printf("В введенном вами числе %d тысяч", bob);
        } else {
            System.out.println("В введенном числе нет ни одной полной тысячи");
        }
        vvod.close();
    }
}
