package lr12.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер целочисленного массива ");
        int size = in.nextInt();
        int[] inputarray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            inputarray[i] = random.nextInt(200);
        }
        System.out.println("Входной массив: ");
        System.out.println(Arrays.toString(inputarray));

        int[] outputArray = evenNumbers(inputarray);
        System.out.println("Массив четных чисел: ");
        System.out.println(Arrays.toString(outputArray));
    }
    public static int[] evenNumbers (int[] arr){
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
