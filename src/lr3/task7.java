package lr3;
import java.util.Scanner;
import java.util.Arrays;
public class task7 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sum = vvod.nextInt();
        System.out.printf("Вы задали массив из %d элементов \n", sum);
        char[] letter = new char[sum];
        letter[0] = 'a';
        for (int i = 1; i < sum; i++) {
            letter[i] = (char)(letter[i-1] + 2);
        }
        System.out.println("Массив прямой порядок " + Arrays.toString(letter));
        char[] letterback = new char[sum];
        for (int i = 0; i < sum; i++) {
            letterback[i] = letter[sum - (i+1)];
        }
        System.out.println("Массив обратный порядок " + Arrays.toString(letterback));
    }
}
