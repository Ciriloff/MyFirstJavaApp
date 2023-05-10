package lr12.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LengthOfInt {
    public static void main(String[] args) {
        List<Integer> numbs = new ArrayList<>(); //содаем массив для записи чисел
        Random random = new Random();
        System.out.println("\n" + "Задайте размер списка: ");
        Scanner ph = new Scanner(System.in);
        int zip = ph.nextInt(); //задаем размер массива
        for (int i = 0; i < zip; i++){
            numbs.add(random.nextInt(100));
            System.out.print(numbs.get(i) + "; ");
        }
        System.out.println("\n" + "Задайте минимальное значение элементов нового списка: ");
        int edge = ph.nextInt(); //ввод с консоли минимального порога для нового массива
        List<Integer> newnumbs = findFitResult(numbs,edge); //создаем список с числами больше порога
        System.out.print("Числа, которые больше " + edge + " следующие: ");
        for (Integer e : newnumbs){
            System.out.print(e + "; "); //печать полученного списка
        }
    }
    public static List<Integer> findFitResult(List<Integer> numb, int edge){
        List<Integer> collect = numb.stream().filter(x -> x > edge).collect(Collectors.toList());
        return collect;
    }
}
