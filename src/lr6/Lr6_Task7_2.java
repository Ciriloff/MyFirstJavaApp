package lr6;
import java.util.Scanner;
import java.util.Arrays;
class LitChar{
    private static int[] intarraylit; //новый целочисленный массив
    public static int[] exlitArray (char[] incharlitarray){ //метод для заполнения массива числовыми кодами
        int length = incharlitarray.length;
        intarraylit = new int[length]; // задаем длину нового массива
        for (int i = 0; i < intarraylit.length; i++) { //перебираем элементы нового массива
            intarraylit[i] = incharlitarray[i]; // присваиваем числовые значения элементам
        }
        return intarraylit; // возврат целочисленного массива
    }
}
public class Lr6_Task7_2 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Сколько символов в массиве: ");
        int quantlit = vvod1.nextInt(); // Ввод размера символьного массива
        char[] vvodlitarray = new char[quantlit];
        int j = 0;
        for (char i = 'A'; i <= 'Z'; i++) { // заполнение символьного массива
            if (j < quantlit){
                vvodlitarray[j] = i;
                j++;
            }
        }
        System.out.println("Введенный символный массив:" + Arrays.toString(vvodlitarray));
        System.out.println("Итоговый целочисленный массив: " + Arrays.toString(LitChar.exlitArray(vvodlitarray)));
    }
}
