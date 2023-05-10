package lr12.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Input2Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер для 2-х массивов ");
        int size = in.nextInt();
        int[] inputarray1 = new int[size];
        int[] inputarray2 = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            inputarray1[i] = random.nextInt(100);
            inputarray2[i] = random.nextInt(100);
        }
        System.out.println("Первый массив: ");
        System.out.println(Arrays.toString(inputarray1));
        System.out.println("Второй массив: ");
        System.out.println(Arrays.toString(inputarray2));

        int[] resultArray = findSameElements(inputarray1, inputarray2);
        System.out.println("Массив из общих элементов: ");
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] findSameElements (int[] arrone,int[] arrtwo){
        return Arrays.stream(arrone).filter(x -> Arrays.stream(arrtwo).anyMatch(y -> y == x)).toArray();
    }
}
