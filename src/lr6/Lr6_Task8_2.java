package lr6;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
class Cheer{
    private static char[]chararray; //переменная класса - новый символьный массив
    public static char[] newArray (int[] inputarray){ //метод для заполнения массива символами
        int length = inputarray.length;
        chararray = new char[length]; // задаем длину нового массива
        for (int i = 0; i < chararray.length; i++) { //перебираем элементы нового массива
            chararray[i] = (char) inputarray[i]; // присваиваем символные значения элементам
        }
        return chararray; // возврат символного массива
    }
}
public class Lr6_Task8_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Сколько символов в массиве: ");
        int size = vvod1.nextInt(); // ввод размера целочисленного массива
        int[] simvolarray = new int[size]; // создаем целочисленный массив
        for (int i = 0; i < simvolarray.length; i++){ // заполняем целочисленный массив
            simvolarray[i] = random.nextInt(200) + 65; // увеличиваем случайное число на 65
        }
        System.out.println("Введенный целочисленный массив:" + Arrays.toString(simvolarray));
        System.out.println("Итоговый символьный массив: " + Arrays.toString(Cheer.newArray(simvolarray)));
    }
}
