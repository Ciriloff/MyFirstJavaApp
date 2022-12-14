package lr6;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
class Exchange{
    private static char[]myexchange; //переменная класса - новый символьный массив
    public static char[] secondOne(char[] firstone){ //метод переворачивающий массив
        myexchange = new char[firstone.length]; // задаем длину нового массива
        int j = firstone.length - 1;
        for (int i = 0; i < myexchange.length; i++, j--){
            myexchange[i] = firstone[j]; // замена элементов массивов
        }
        return myexchange;
    }
}
public class Lr6_Task9 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Сколько символов в массиве: ");
        int hop = vvod1.nextInt(); // Ввод размера символьного массива
        char[] firstone = new char[hop];
        int j = 0;
        for (char i = 'A'; i <= 'Z'; i++) { // заполнение символьного массива
            if (j < hop){
                firstone[j] = i;
                j++;
            }
        }
        System.out.println("Введенный символный массив:" + Arrays.toString(firstone));
        System.out.println("Перевернутый символьный массив: " + Arrays.toString(Exchange.secondOne(firstone)));
    }
}
