package lr13.task_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxElement1 {
    public static void main(String[] args)throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер целочисленного массива ");
        int lent = in.nextInt();
        int[] intarray = new int[lent];
        Random random = new Random();
        for (int i = 0; i < lent; i++){
            intarray[i] = random.nextInt(200);
        }
        System.out.println("Входной массив: ");
        System.out.println(Arrays.toString(intarray));

        int[] maxArr = new int[4]; //массив для хранения max значений каждого потока
        int maxInArr; //итоговое max значение во всем массиве

        for (int i = 0; i < 4; i++){
            new FindMaxElement(intarray,(i * intarray.length) / 4,((i + 1) * intarray.length) / 4).start();
            int max = FindMaxElement.findMaxElement(intarray); //обращение к методу для поиска max значения
            System.out.println("Наибольшее значение " + i + "-й части массива: " + max);
            maxArr[i] = max;
        }
        //находим max значение из найденных каждым из 4-х потоков
        maxInArr = maxArr[0];
        for (int i = 1; i < 4; i++) {
            if (maxInArr < maxArr[i]) {
                maxInArr = maxArr[i];
            }
        }
        System.out.println("Максимальное значение массива: " + maxInArr); //Итоговое max значение
    }
    private static class FindMaxElement extends Thread{ //класс для создания потока
        private static int lo;
        private static int hi;
        private int[] arr;
        public FindMaxElement(int[] arr, int lo, int hi) {
            this.lo = lo;
            this.hi = hi;
            this.arr = arr;
        }
        //печатаем наименование потока и его номер
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + ": " + toString(Thread.currentThread().getName()));
        }
        private char toString(String name) {
            return name.charAt(name.length() - 1);
        }
        //метод для нахождения наибольшего значения в каждой части исходного массива
        public static int findMaxElement(int[] arr) {
            int max = arr[0];
            for (int i = lo; i < hi; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }
    }
}
