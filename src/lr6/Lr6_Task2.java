package lr6;
import java.util.Scanner;
class Rize{
    private static int rock = 0;
    static int n = 1;
public static void setRock (){
    System.out.println("Запрос " + n + " текущее значение поля: " + rock);
    rock++;
    n++;
}
}
public class Lr6_Task2 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите количество запросов: ");
        int count = vvod1.nextInt();
        for (int i = 1; i < count + 1; i++){
            Rize.setRock();
        }
    }
}
