package lr3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class task0 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива " + Size);
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"]=" + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0;i < nums.length; i++){
            System.out.println("Элемент массива после сортировки ["+i+"] после сортировки =" +nums[i]);
        }
    }
}
