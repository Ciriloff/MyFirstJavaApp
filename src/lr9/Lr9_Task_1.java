package lr9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lr9_Task_1 {
    public static double toCount(int[] getArr){
        int k = getArr.length;
        int sum = 0;
        int count = 0;
        double averval;
        for (int j = 0; j < k; j++) {
            if (getArr[j] > 0) {
                sum += getArr[j];
                count++;
            }
        }
        if (count != 0) {
            averval = sum / count;
        } else {
            averval = sum;
        }
        return averval;
    }
    public static void main(String[] args) {
        int[] intArr = new int[0];
        try {
            Scanner bt = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");
            int nun = bt.nextInt();
            System.out.printf("Вы задали массив из %d элементов \n", nun);
            intArr = new int[nun];
            for (int i = 0; i < nun; i++) {
                intArr[i] = bt.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение " + "(" + e + ")");
        } catch (NegativeArraySizeException e){
            System.out.println("Недопустимое количество элементов массива ");
        }
        System.out.println("Введенный массив " + Arrays.toString(intArr));
        System.out.println("Среднее значение положительных элементов = " + toCount(intArr));
    }
}
