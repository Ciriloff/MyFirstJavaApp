package lr3;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String day = id.nextLine();
        System.out.println("Вы ввели " + day);
        switch (day){
            case "Понедельник":
                System.out.println("Это 1-й день недели");
                break;
            case "понедельник":
                System.out.println("Это 1-й день недели");
                break;
            case "Вторник":
                System.out.println("Это 2-й день недели");
                break;
            case "вторник":
                System.out.println("Это 2-й день недели");
                break;
            case "Среда":
                System.out.println("Это 3-й день недели");
                break;
            case "среда":
                System.out.println("Это 3-й день недели");
                break;
            case "Четверг":
                System.out.println("Это 4-й день недели");
                break;
            case "четверг":
                System.out.println("Это 4-й день недели");
                break;
            case "Пятница":
                System.out.println("Это 5-й день недели");
                break;
            case "пятница":
                System.out.println("Это 5-й день недели");
                break;
            case "Суббота":
                System.out.println("Это 6-й день недели");
                break;
            case "суббота":
                System.out.println("Это 6-й день недели");
                break;
            case "Воскресенье":
                System.out.println("Это 7-й день недели");
                break;
            case "воскресенье":
                System.out.println("Это 7-й день недели");
                break;
            default:
                System.out.println("Это не день недели");
        }

    }
}
