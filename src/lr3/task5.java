package lr3;
import java.util.Scanner;
import java.util.Arrays;
public class task5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Сколько чисел будем суммировать?");
        int sum = vvod.nextInt();
        int[] nums = new int[sum];
        System.out.println("Введите числа, которые делятся на 5 с остатком 2 или делятся на 3 с остатком 1 ");
        for (int i = 0; i < sum; i++) {
            Scanner id = new Scanner(System.in);
            int one = id.nextInt();
            if (one % 5 == 2 || one % 3 == 1) {
                nums[i] = one;
                System.out.printf("Число № %d равно %d \n", i + 1, nums[i]);
            } else {
                System.out.println("Введенное вами число не подходит под критерии, поэтому");
                break;
            }
        }
        int allsum = 0;
        for (int i = 0; i < sum; i++) {
            allsum += nums[i];
        }
        System.out.printf("Сумма равна %d", allsum);
    }
}