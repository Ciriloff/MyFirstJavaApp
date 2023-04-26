package lr11.task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите десятичное число ");
            int y = sc.nextInt();
            if (y == 0) {
                System.out.println("Число в двоичной системе счисления = 0");
            } else if (y < 0) {
                System.out.println("Введено число меньше нуля ");
            } else {
                fact(y);
            }
        }catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение " + "(" + e + ")");
        }
    }
    public static void fact(int n) {
        int rez = 0;
        if (n == 0) {
            System.out.println("Конвертирован ");
        } else {
            rez = n % 2;
            fact(n / 2);
            System.out.print(rez);
        }
    }
}
