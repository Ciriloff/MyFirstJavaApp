package lr3;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 7: ");
        int x = id.nextInt();
        System.out.println("Введенное вами число " + x);
        switch (x){
            case 1:
                System.out.println("Это понедельник");
                break;
            case 2:
                System.out.println("Это вторник");
                break;
            case 3:
                System.out.println("Это среда");
                break;
            case 4:
                System.out.println("Это четверг");
                break;
            case 5:
                System.out.println("Это пятница");
                break;
            case 6:
                System.out.println("Это суббота");
                break;
            case 7:
                System.out.println("Это воскресенье");
                break;
            default:
                System.out.println("Введенное вами число за пределами обозначенного диапозона");
        }

    }
}
