package lr3;
import java.util.Scanner;
import java.util.Arrays;
public class task4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = id.nextInt();
        Scanner it = new Scanner(System.in);
        System.out.println("Введите второе число ");
        int b = it.nextInt();
        System.out.printf("Вы ввели числа: %d и %d \n", a, b);
        int size = (a - b) + 1;
        int backsize = (b - a) + 1;
        if (size - 1 > 0) {
            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = b++;
                System.out.println("Целые числа " + nums[i]);
            }
        }
        else if (size - 1 < 0) {
            int[] nums = new int[backsize];
            for (int i = 0; i < backsize; i++) {
                nums[i] = a++;
                System.out.println("Целые числа " + nums[i]);
            }
        }
        else {
            System.out.println("Числа равны поэтому только одно целое число " + a);
        }
    }
}
