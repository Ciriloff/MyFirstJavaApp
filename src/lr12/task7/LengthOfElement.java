package lr12.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LengthOfElement {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>(); //содаем массив для записи фраз
        Scanner vvod = new Scanner(System.in);
        System.out.println("Сколько строк будут заданы? ");
        int quant = vvod.nextInt(); //задаем размер массива
        System.out.println("Введите строку и нажмите ввод");
        for (int i = 0; i <= quant; i++){ //заполняем массив фразами
            lines.add(vvod.nextLine());
        }
        System.out.println("\n" + "Заданные строки: ");
        for (String e : lines){
            System.out.println(e);
        }
        System.out.println("\n" + "Задайте длину выводимых строк?");
        int length = vvod.nextInt(); //ввод с консоли минимальной длины строки
        List<String> newlines = findFitLine((ArrayList<String>) lines,length);
        System.out.println("\n" + "Строки заданной длины: ");
        for (String e : newlines){
            System.out.println(e);
        }
    }
    public static List<String> findFitLine(ArrayList<String> lines, int length) {
        return lines.stream().filter(s -> s.length() > length).collect(Collectors.toList());
    }
}
