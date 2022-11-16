package lr5;
import java.util.Scanner;
class Account {
    private static int max; //закрытое поле №1
    private static int min; //закрытое поле №2
    static int x;
    static int y;
    Account() { //конструктор без параметоров
        max = 5;
        min = 2;
    }
    public void getValue(int one) { //метод с 1-м параметором
        if (max < one) {
            max = one;
        } else if (min > one) {
            min = one;
        }
        System.out.printf("Метод с 1-м параметром: Макс.зн. %d, Мин.зн. %d", max, min);
    }
    public void getValue(int one, int two) { //метод с 2-я параметрами
        if (two > one) {
            if (max < two) {
                max = two;
            } else if (min > one) {
                min = one;
            }
        } else {
            if (max < one) {
                max = one;
            } else if (min > two) {
                min = two;
            }
        }
        System.out.println();
        System.out.printf("Метод с 2-мя параметрами: Макс.зн. %d, Мин.зн. %d", max, min);
    }
    public static int chekValuemax() { //метод для проверки значения max
        x = max;
        return x * 1;
    }
    public static int chekValuemin() { //метод для проверки значения min
        y = min;
        return y * 1;
    }
}
public class Lr5_Task6 {
    public static void main(String[] args) {
        int result;
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int shift1 = vvod1.nextInt();
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите второе целое число: ");
        int shift2 = vvod2.nextInt();
        Account mycount1 = new Account(); // конструктор без параметров присваивает начальные значения
        Account mycount2 = new Account();
        mycount1.getValue(shift1);
        mycount2.getValue(shift1, shift2);
        //result = mycount2.chekValuemax();
        System.out.println("");
        System.out.println("Текущее макс. значение числового поля " + Account.chekValuemax());
        System.out.println("Текущее мин. значение числового поля " + Account.chekValuemin());
    }
}
