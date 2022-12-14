package lr6;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
class CheckValue{
    public static void vvodValue (int ... v) { //метод работающий через аргумент переменной длины
        double summa = 0;
        int min = 0;
        int max = 0;
        int count = 0; //переменная нужна для присвоения переменным min и max значений первого элемента
        System.out.print("Например, при количестве аргументов равном " + v.length + ": ");
        for (int x : v) {
            System.out.print(x + "; ");
            if (count == 0){
                max = x;
                min = x;
                count++;
            }
            if (max < x) {
                max = x;
            } else if (min > x) {
                min = x;
            }
        }
        summa = Arrays.stream(v).sum(); //сумма всех элементов
        System.out.println("");
        System.out.print("Сумма элементов: " + summa + "; ");
        System.out.print("Среднее значение: " + summa / v.length + "; ");
        System.out.print("Максимальный элемент: " + max + "; ");
        System.out.println("Минимальный элемент: " + min);
    }
    public static void vvodValue2 (int[] v) { //метод работающий через массив
        double summa = 0;
        int min = 0;
        int max = 0;
        int count = 0; //переменная нужна для присвоения переменным min и max значений первого элемента массива
        System.out.println("Количество аргументов " + v.length + ". ");
        for (int x : v) {
            //System.out.print(x + "; ");
            if (count == 0){
                max = x;
                min = x;
                count++;
            }
            if (max < x) {
                max = x;
            } else if (min > x) {
                min = x;
            }
        }
        summa = Arrays.stream(v).sum(); //сумма всех элементов
        System.out.print("Сумма элементов: " + summa + "; ");
        System.out.print("Среднее значение: " + summa / v.length + "; ");
        System.out.print("Максимальный элемент: " + max + "; ");
        System.out.println("Минимальный элемент: " + min);
    }
}
public class Lr6_Task3 {
    public static void main(String[] args) {
        System.out.println("Есть возможность сравнить значения элементов.");
        CheckValue.vvodValue(10, 20, 30);
        System.out.print("Если работать через массив, то сколько аргументов будет? Введите: ");
        Scanner vvod1 = new Scanner(System.in);
        int mas = vvod1.nextInt();
        int[] myArray = new int[mas];
        int i = 0;
        do {
            Scanner vvod2 = new Scanner(System.in);
            myArray[i] = vvod2.nextInt();
            i++;
        } while (i != mas);
        System.out.println("Введенный массив: " + Arrays.toString(myArray));
        CheckValue.vvodValue2(myArray);
    }
}
