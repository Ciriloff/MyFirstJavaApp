package lr12.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class IntArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        System.out.println("\n" + "Заданный список: ");
        for (int i = 0; i < 10; i++){
            numbers.add(random.nextInt(100));
            System.out.println(numbers.get(i));
        }
        List<Integer> numbersOut = squareTotal(numbers);
        System.out.println("\n" + "Список квадратов: ");
        for (Integer e : numbersOut){
            System.out.println(e);
        }
    }
    public static List<Integer> squareTotal(List<Integer> list){
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }
}
