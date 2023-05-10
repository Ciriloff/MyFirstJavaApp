package lr12.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindInteger {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); //содаем массив для записи чисел
        Random random = new Random();
        System.out.println("\n" + "Задайте размер списка: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(); //задаем размер массива
        for (int i = 0; i < size; i++){
            numbers.add(random.nextInt(100));
            System.out.print(numbers.get(i) + "; ");
        }
        System.out.println("\n" + "Введите значение делителя: ");
        int divide = in.nextInt(); //ввод с консоли делителя
        List<Integer> newnumbers = findResult(numbers,divide); //создаем список с числами делящимися без остатка
        System.out.print("Числа, которые делятся на " + divide + " без остатка: ");
        for (Integer e : newnumbers){
            System.out.print(e + "; "); //печать полученного списка
        }
    }
    public static List<Integer> findResult(List<Integer> numb, int divide){
        List<Integer> collect = numb.stream().filter(x -> x % divide == 0).collect(Collectors.toList());
        return collect;
    }
}
