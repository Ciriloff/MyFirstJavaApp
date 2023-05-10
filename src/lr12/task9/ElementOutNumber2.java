package lr12.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ElementOutNumber2 {
    public static void main(String[] args) {
        List<String> lineofstr = new ArrayList<>(); //содаем массив для записи фраз
        Scanner vvodline = new Scanner(System.in);
        System.out.println("Сколько строк будут заданы? ");
        int quantline = vvodline.nextInt(); //задаем размер массива
        System.out.println("Введите строку и нажмите ввод");
        for (int i = 0; i <= quantline; i++){ //заполняем массив фразами
            lineofstr.add(vvodline.nextLine());
        }
        System.out.println("\n" + "Заданные строки: ");
        for (String e : lineofstr){
            System.out.println(e);
        }
        List<String> newlines = onlyWord((ArrayList<String>) lineofstr);
        System.out.println("\n" + "Строки без цифр: ");
        for (String e : newlines){
            System.out.println(e);
        }
    }
    public static List<String> onlyWord(ArrayList<String> lines) {
        return lines.stream().filter(s -> s.matches("\\p{L}+")).collect(Collectors.toList());
    }
}
