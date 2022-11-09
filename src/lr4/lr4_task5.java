package lr4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class lr4_task5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int line = vvod1.nextInt();
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите количество колонок: ");
        int column = vvod2.nextInt();
        int[][] two = new int[line][column];
        int [][] backtwo = new int[column][line];
        for (int i = 0; i < two.length; i++) {
            System.out.print("строка " + (i + 1) + ":");
            for (int j = 0; j < two[0].length; j++) {
                two[i][j] = random.nextInt(1000);
                System.out.print(" " + two[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Массив после поворота следующий:");
        for (int i = 0; i < backtwo.length; i++) {
            System.out.print("строка # " + (i + 1) + ":");
            for (int j = 0; j < backtwo[0].length; j++) {
                backtwo[i][j] = two[j][i];
                System.out.print(" " + backtwo[i][j]);
            }
            System.out.println("");
        }
    }
}
