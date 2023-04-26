package lr11.task_3;

import java.util.*;

public class BackArrayRecursion {
    static Random random = new Random();

    public static void main(String[] args) {
        try {
            ArrayList <Integer> myList = new ArrayList<Integer>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите целые числа для заполнения массива (окончание ввода - любой символ): ");
            while (sc.hasNextInt()) {
                int i = sc.nextInt();
                myList.add(i);
            }
            int y = myList.size();
            getList(y - 1, myList); //уменьшаем на 1, т.к. индекс массива начинается с 0
        }catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение " + "(" + e + ")");
        }
    }
    public static void getList(int n, ArrayList<Integer> array) { // метод с 2-я параметрами с рекурсией
        if (n < array.size() && n > -1) { // рекурсия
            //System.out.print(array.get(n) + "; "); //массив печатается в обратной последовательности
            getList(n - 1, array);
            System.out.print(array.get(n) + "; "); //массив печатается в прямой последовательности
        }
    }
}
