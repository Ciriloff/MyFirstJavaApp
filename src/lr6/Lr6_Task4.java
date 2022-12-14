package lr6;
import java.util.Scanner;
import java.util.Arrays;
class CheckFactorial{
    private static int n;
    public static void setFactorial (int w){//введенное пользователем число присваиваем переменной класса
        n = w;
    }
    public static void countFactorial () { //метод расчета факториала
        int x = n;
        int[] checkArray = new int[0];
        if (x % 2 == 0) {//определяем четное или нечетное число было введено
            checkArray = new int[x / 2];
            for (int i = 0; i < checkArray.length; i++) { //заполняем массив для перемножения
                checkArray[i] = n;
                n -= 2;
            }
        } else {
            checkArray = new int[(x + 1) / 2];
            //System.out.println("Размер массива " + checkArray.length);
            for (int i = 0; i < checkArray.length; i++) { //заполняем массив для перемножения
                checkArray[i] = n;
                n -= 2;
            }
        }
        int click = 1; // переменная для расчета произведения
        for (int q : checkArray){
           click *= q;
        }
        System.out.println("Двойной факториал = "+ click);
    }
}
public class Lr6_Task4 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите число для рассчета двойного факториала: ");
        int num = vvod1.nextInt();
        CheckFactorial.setFactorial(num); //присваиваем значение аргументу метода - введенное число
        CheckFactorial.countFactorial(); //рассчитываем значение факториала
    }
}
