package lr4;
import java.util.Scanner;
import java.util.Arrays;
public class lr4_task4_3 {
    public static void main(String[] args) {
        int[][] mas = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < mas.length; i++) {
            System.out.print("строка " + (i + 1) + ":");
            for (int j = 0; j < mas.length; j++) {
                System.out.print(" " + mas[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < mas.length / 2; i++) {
            int n = mas.length - 1;
            for (int j = i; j < mas.length - i - 1; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[n - j][i];
                mas[n - j][i] = mas[n - i][n - j];
                mas[n - i][n - j] = mas[j][n - i];
                mas[j][n - i] = temp;
                System.out.print(" " + mas[i][j]);
            }
        }
    }
}
