package lr6;
import java.util.Scanner;
class RecSquare{
    private static int w;
    public static int countRecSquare (int l) {
        int summa;
        if (l <= 1) {
            return l;
        }
        summa = countRecSquare(l-1) + l*l;
        System.out.println("Сумма " + summa);
        return summa;
    }
}
public class Lr6_Task5_2 {
    public static void main(String[] args) {
        int prov = 0;
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите число для расчета суммы квадратов чисел: ");
        int num = vvod1.nextInt();
        System.out.println("Сумма квадратов натуральных чисел до " + num + " равна " + RecSquare.countRecSquare(num));
        prov = num * (num + 1) * (2 * num + 1) / 6;
        System.out.println("Проверка расчетного значения: " + prov);
    }
}
