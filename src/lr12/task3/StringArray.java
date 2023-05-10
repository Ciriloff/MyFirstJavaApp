package lr12.task3;

import java.util.List;
import java.util.stream.Collectors;

public class StringArray {
    public static void main(String[] args) {
        String string = "Я могу тебя очень Ждать,"
                + " Долго-долго и Верно-верно,"
                + " И ночами могу не спать" + " Год, и два, И Всю Жизнь, наверно!";
        List<String> lines = List.of(string.split(" "));
        System.out.println("Строка разделенная: ");
        for (String e : lines){
            System.out.println(e);
        }
        List<String> linesOut = filterOneLine(lines);
        System.out.println("\n" + "Итоговая фраза: ");
        for (String e : linesOut){
            System.out.println(e);
        }
    }
    public static List<String> filterOneLine(List<String> list){
        return list.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }
}
