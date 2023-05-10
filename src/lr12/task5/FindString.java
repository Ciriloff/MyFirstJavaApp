package lr12.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindString {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>(); //содаем массив для записи фраз
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько строк будет? ");
        int size = in.nextInt(); //задаем размер массива
        for (int i = 0; i <= size; i++){ //заполняем массив фразами
            lines.add(in.nextLine());
        }
        System.out.println("\n" + "Заданные строки: ");
        for (String e : lines){
            System.out.println(e);
        }
        System.out.println("\n" + "Какое слово должна содержать искомая строка?");
        String word = in.nextLine(); //ввод с консоли искомого слова
        List<String> newlines = findWord((ArrayList<String>) lines,word);
        System.out.println("\n" + "Искомые строки: ");
        for (String e : newlines){
            System.out.println(e);
        }
    }

    public static List<String> findWord(ArrayList<String> lines, String word) {
        return lines.stream().filter(s -> s.contains(word)).collect(Collectors.toList());
    }
}
