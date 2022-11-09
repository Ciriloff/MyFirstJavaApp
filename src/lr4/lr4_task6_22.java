package lr4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class lr4_task6_22 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите количество строк в массиве: ");
        int line = vvod1.nextInt();
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите количество колонок в массиве: ");
        int column = vvod2.nextInt();
        int[][] two = new int[line][column];
        int[][] newtwo = new int[line - 1][column - 1];
        for (int i = 0; i < two.length; i++) {
            System.out.print("строка " + (i + 1) + ":");
            for (int j = 0; j < two[0].length; j++) {
                two[i][j] = random.nextInt(1000);
                System.out.print(" " + two[i][j]);
            }
            System.out.println("");
        }
        int choice;
        do {
            System.out.print("Удалить из массива строку и колонку? Y/N: ");
            Scanner vvod3 = new Scanner(System.in);
            choice = vvod3.nextInt();
        }
        while (choice != 89 && choice != 78);
        Random random1 = new Random();
        int ex_line = random1.nextInt(two.length);
        System.out.println("Исключаемая строка " + (ex_line + 1));
        int ex_column = random1.nextInt(two[0].length);
        System.out.println("Исключаемая колонка " + (ex_column + 1));
        for (int i = 0; i < two.length; i++) {
            if (i == ex_line) {
                continue;
            }
            System.out.print("строка " + (i + 1) + ":");
            for (int j = 0; j < two[0].length; j++) {
                if (j == ex_column) {
                    continue;
                }
                System.out.print(" " + two[i][j]);
            }
            System.out.println("");
        }
        int k = 0;
        char[] letters = new char[26];
        for (char i = 'A'; i <= 'Z'; i++) {
            letters[k] = i;
            k++;
        }
        System.out.println("" + Arrays.toString(letters));
        int t = 0;
        int[] number = new int[26];
        for (int i = 'A'; i <= 'Z'; i++) {
            number[t] = i;
            t++;
        }
        System.out.println("" + Arrays.toString(number));
    }
}
