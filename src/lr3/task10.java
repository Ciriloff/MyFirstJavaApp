package lr3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int inn = input.nextInt();
        System.out.printf("Массив размера %d \n", inn);
        Integer[] ranArr = new Integer[inn];
        for (int i = 0; i < inn; i++) {
            ranArr[i] = random.nextInt(300);
        }
        System.out.println("Массив " + Arrays.toString(ranArr));
        Arrays.sort(ranArr, Collections.reverseOrder());
        System.out.println("Массив в порядке убывания " + Arrays.toString(ranArr));
    }
}
