package lr9;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Lr9_Task_2 {
    public static void main(String[] args) {
        int[][] isArr;
        Random random = new Random();
        Scanner l = new Scanner(System.in);
        try {
        System.out.println("Введите количество строк массива: ");
        int line = l.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int column = l.nextInt();
        System.out.printf("Задан массив из %d строк и %d столбцов \n", line, column);
        isArr = new int[line][column];
        for (int i = 0; i < line; i++){
            for (int j = 0; j < column; j++){
                isArr[i][j] = random.nextInt(200);
            }
        }
        for (int i = 0; i < line; i++){
            for (int j = 0; j < column; j++){
                System.out.print(" " + isArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите номер столбца для вывода на экран: ");
        int num = l.nextInt() - 1;
        for (int i = 0; i < line; i++){
            System.out.println(isArr[i][num]);
        }
        } catch (InputMismatchException e){
            System.out.println("Введено некорректное значение " + "(" + e + ")");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Номер столбца за пределами массива ");
        }
    }
}
