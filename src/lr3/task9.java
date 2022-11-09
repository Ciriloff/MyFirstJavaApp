package lr3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class task9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int nun = input.nextInt();
        System.out.printf("Вы задали массив из %d элементов \n", nun);
        int[] intArr = new int[nun];
        for (int i = 0; i < nun; i++) {
            intArr[i] = random.nextInt(200);
        }
        System.out.println("Массив " + Arrays.toString(intArr));
        int sum = 200;
        int count = 0;
        for (int x : intArr){
            if (sum > x){
                sum = x;
            }
        }
        System.out.println("Минимальный элемент массива " + sum);
        for (int i = 0; i < nun; i++){
            if (intArr[i] == sum) {
                count = i;
                System.out.println("Индекс минимального элемента массива " + count);
            }
        }
    }
}
