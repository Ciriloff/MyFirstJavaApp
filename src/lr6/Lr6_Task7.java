package lr6;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
class BigChar{
    private static int[] intarray; //новый массив
    public static void exArray (char[] inchararray){
        int length = inchararray.length;
        intarray = new int[length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = inchararray[i];
        }
        System.out.println("Итоговый целочисленный массив: " + Arrays.toString(intarray));
    }
}
public class Lr6_Task7 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Сколько символов в массиве: ");
        int quant = vvod1.nextInt(); // Ввод размера массива
        char[] vvodarray = new char[quant];
        int j = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            if (j < quant){
            vvodarray[j] = i;
            j++;
            }
        }
        System.out.println("Введенный символный массив:" + Arrays.toString(vvodarray));
        BigChar.exArray(vvodarray);
    }
}
