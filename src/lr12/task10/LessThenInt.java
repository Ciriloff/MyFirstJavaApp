package lr12.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LessThenInt {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //содаем массив для записи чисел
        Random random = new Random();
        System.out.println("\n" + "Задайте размер списка: ");
        Scanner put = new Scanner(System.in);
        int zip = put.nextInt(); //задаем размер массива
        for (int i = 0; i < zip; i++){
            nums.add(random.nextInt(100));
            System.out.print(nums.get(i) + "; ");
        }
        System.out.println("\n" + "Задайте максимальное значение элементов нового списка: ");
        int edge = put.nextInt(); //ввод с консоли максимального порога для нового массива
        List<Integer> newnums = findNeedResult(nums,edge); //создаем список с числами меньше порога
        System.out.print("Числа, которые меньше " + edge + " следующие: ");
        for (Integer e : newnums){
            System.out.print(e + "; "); //печать полученного списка
        }
    }
    public static List<Integer> findNeedResult(List<Integer> numb, int edge){
        List<Integer> collect = numb.stream().filter(x -> x < edge).collect(Collectors.toList());
        return collect;
    }
}
