package lr3;
import java.util.Scanner;
import java.util.Arrays;
public class task6 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Сколько чисел будете заводить?");
        int sum = vvod.nextInt();
        int[] nums = new int[sum];
        System.out.println("Введите числа, которые делятся на 5 с остатком 2 ");
        for (int i = 0; i < sum; i++) {
            Scanner id = new Scanner(System.in);
            int one = id.nextInt();
            if (one % 5 == 2) {
                nums[i] = one;
                System.out.printf("Число № %d равно %d \n", i + 1, nums[i]);
            } else {
                System.out.println("Введенное вами число не соответствует условию");
                System.out.println("Введите новое число");
                --i;
            }
        }
        int i = 0;
        System.out.print("Вы ввели следующие числа соответствующие условию: ");
        do {
            System.out.print(+ nums[i] + "; ");
            i++;
        } while (i < sum);
    }
}
