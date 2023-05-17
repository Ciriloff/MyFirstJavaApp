package lr13.task_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumElement1 {
    public static void main(String[] args)throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер целочисленного массива ");
        int lent = in.nextInt();
        int[] intarray = new int[lent];
        Random random = new Random();
        for (int i = 0; i < lent; i++){
            intarray[i] = random.nextInt(10);
        }
        System.out.println("Входной массив: ");
        System.out.println(Arrays.toString(intarray));

        int[] sumArr = new int[4]; //массив для хранения суммы каждого потока
        int sumInArr; //итоговая сумма всех элементов массива

        for (int i = 0; i < 4; i++){
            new FindSumElement(intarray,(i * intarray.length) / 4,((i + 1) * intarray.length) / 4).start();
            int summum = FindSumElement.findSumElement(intarray); //обращение к методу для поиска max значения
            System.out.println("Сумма значение " + i + "-й части массива: " + summum);
            sumArr[i] = summum;
        }
        //находим сумму значений из найденных в каждом из 4-х потоков
        sumInArr = sumArr[0];
        for (int i = 1; i < 4; i++) {
            sumInArr += sumArr[i];
        }
        System.out.println("Сумма всех значений массива: " + sumInArr); //Итоговая сумма элементов массива
    }
    private static class FindSumElement extends Thread{ //класс для создания потока
        private static int lo;
        private static int hi;
        private int[] arr;
        public FindSumElement(int[] arr, int lo, int hi) {
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
        public static int findSumElement(int[] arr) {
            int sum = 0;
            for (int i = lo; i < hi; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }
}
