package lr3;
import java.util.Arrays;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите сколько чисел Фибоначчи показать: ");
        int size = id.nextInt();
        System.out.println("Вы ввели " + size);
        if (size < 1){
            System.out.println("В ряду Фибоначчи нет такого элемента ");
        }
        else if (size == 1){
            System.out.println("Число 1 является " + size + "-м в ряду Фибоначчи ");
        } else {
            int[] nums = new int[size];
            if (size > 1) {
                nums[0] = 1;
                nums[1] = 1;
                for (int i = 2; i < nums.length; i++) {
                    nums[i] = nums[i - 2] + nums[i - 1];
                }
                int b = nums.length - 1;
                System.out.println("Число " + nums[b] + " является " + size + "-м в ряду Фибоначчи ");
            }
        }
    }
}