package lr5;
import java.util.Arrays;
import java.util.Scanner;
class Letters {
char let1;
char let2;
    public Letters(char let1, char let2) {
        this.let1 = let1;
        this.let2 = let2;
    }
    public String getLet() {
    String xum;
    char[] ArrayChar; //Массив для сбора промежуточных символов
    ArrayChar = new char[(let2 - let1) + 1];
    int j = 0;
    for (char i = let1; i < (let2 + 1); i++) {
        ArrayChar[j] = i;
        j++;
    }
    xum = Arrays.toString(ArrayChar); //Преобразовали символы из массива с строку
    return xum; // возвращаем строку символов
}
}
public class Lr5_Task2 {
    public static void main(String[] args) {
        Letters myletter1 = new Letters('A', 'D');
        System.out.println("Символы в промежутке от "+myletter1.let1+ " до " +myletter1.let2+ " следующие: " +myletter1.getLet());
    }
}
