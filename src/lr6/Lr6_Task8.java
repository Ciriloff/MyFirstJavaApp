package lr6;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
class FirstCheer{
    private static int[]intcheckarray; //переменная класса - новый целочисленный массив
    private static float middle = 0;
    public static float newcheckArray (int[] inputcheckarray){ //метод для вычисления среднего значения
        int length = inputcheckarray.length;
        float summ = 0;
        intcheckarray = new int[length]; // задаем длину нового массива
        for (int i = 0; i < inputcheckarray.length; i++) { //перебираем элементы нового массива
            intcheckarray[i] = inputcheckarray[i]; // переносим значения элементов в новый массив
            summ += intcheckarray[i];
        }
        middle = summ / (float) length;
        return middle; // возврат среднего значения массива
    }
}
public class Lr6_Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Сколько чисел в массиве: ");
        int size = vvod1.nextInt(); // ввод размера целочисленного массива
        int[] intvvodarray = new int[size]; // создаем целочисленный массив
        for (int i = 0; i < intvvodarray.length; i++){ // заполняем целочисленный массив
            intvvodarray[i] = random.nextInt(200);
        }
        System.out.println("Введенный целочисленный массив:" + Arrays.toString(intvvodarray));
        System.out.println("Среднее значение введенного массива: " + FirstCheer.newcheckArray(intvvodarray));
    }
}
