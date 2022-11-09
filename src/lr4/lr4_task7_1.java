package lr4;
import java.util.Scanner;
import java.util.Random;
public class lr4_task7_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите количество строк в массиве: ");
        int line = vvod1.nextInt();
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите количество колонок в массиве: ");
        int column = vvod2.nextInt();
        int[][] two = new int[line][column]; // Создаем массив из заданного кол-ва строк и колонок
        int count = -1; // Создаём элементы массива по строкам начиная с первой
        int content = 1;
        for (int i = 0; i < two.length; i++) {
            count++;
            for (int j = 0; j < two[0].length - count; j++) {
                two[i][j] = content;
                content++;
            }
        }
        int count_one = 0; // Создаём элементы массива по колонкам начиная с последней
        for (int j = column-1; j > -1; j--) {
            count_one++;
            for (int i = line-1; i > -1+count_one; i--) {
                two[i][j] = content;
                content++;
            }
        }
        for (int i = 0; i < two.length; i++) { // Печать итогового массива
            for (int j = 0; j < two[0].length; j++) {
                System.out.print(" " + two[i][j]);
            }
            System.out.println(" ");
        }
    }
}
