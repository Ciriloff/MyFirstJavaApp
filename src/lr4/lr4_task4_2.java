package lr4;
import java.util.Scanner;
import java.util.Arrays;
public class lr4_task4_2 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int line = vvod1.nextInt();
        //Scanner vvod2 = new Scanner(System.in);
        //System.out.print("Введите количество колонок: ");
        //int column = vvod2.nextInt();
        int[][] two = new int[line][line];
        for (int i = 0; i < two.length; i++){
            System.out.print("строка " + (i+1) + ":");
            for (int j = 0; j < i+1; j++){
                two[i][j] = 2;
                System.out.print(" "+ two[i][j]);
            }
            System.out.println("");
        }
    }
}
