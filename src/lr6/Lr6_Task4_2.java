package lr6;
import java.util.Scanner;

class CheckDoubleFactor{
    private static int n;
    public static int countDoubleFactor (int i){ //рекурсивный метод расчета факториала
        int x;
        if (i <= 1){ return 1;} //двойной факториал нечетного числа проскакивает значение "1"
        x = countDoubleFactor(i - 2) * i; //отсчет каждого второго элемента
        return x;
    }
}
public class Lr6_Task4_2 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите число для расчета двойного факториала: ");
        int num = vvod1.nextInt();
        System.out.println("Двойной факториал числа " + num + " равен " + CheckDoubleFactor.countDoubleFactor(num));
    }
}
