package lr11.task_3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayRecursion {
    static Random random = new Random();

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество чисел в массиве ");
            int y = sc.nextInt();
            System.out.print("\nПолученный массив из " + y + " элементов " + Arrays.toString(factor(y)));
        }catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение " + "(" + e + ")");
        }catch (NegativeArraySizeException e){
            System.out.println("Количество элементов в массиве не может быть отрицательным ");
        }
    }
    public static int[] factor(int n, int[] array) { // метод с 2-я параметрами с рекурсией
        if (n < 0) { // базовое условия
            return array;
        } else { // рекурсия
            array[n] = random.nextInt(100);;
            n--;
            return factor(n, array);
        }
    }
    public static int[] factor(int n){ // метод с 1-м параметром
        return factor(n-1, new int[n]);
    }
}
