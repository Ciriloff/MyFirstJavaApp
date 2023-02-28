package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lr9_Task_3 {
    public static void main(String[] args) {
        byte[] myArr;
        Scanner v = new Scanner(System.in);
        try {
            System.out.println("Введите количество элементов массива: ");
            int line = v.nextInt();
            myArr = new byte[line];
            System.out.println("Введите значения типа byte для заполнения массива ");
            for (int i = 0; i < myArr.length; i++) {
                myArr[i] = v.nextByte();
            }
            for (byte j : myArr){
                System.out.print("" + j + "; ");
            }
        } catch (InputMismatchException e){
            System.out.println("Введено некорректное значение " + "(" + e + ")");
        }
    }
}
