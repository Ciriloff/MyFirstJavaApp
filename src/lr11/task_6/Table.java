package lr11.task_6;

import java.util.*;

public class Table {
    public static void main(String[] args) {
        HashMap<Integer, String> data = new HashMap<>();
        data.put(1, "Раз");
        data.put(2, "Два");
        data.put(3, "Три");
        data.put(4, "Четыре");
        data.put(5, "Пять");
        data.put(6, "Шесть");
        data.put(7, "Семь");
        data.put(8, "Восемь");
        data.put(9, "Девять");
        data.put(10, "Десять");
        System.out.println("Содержимое HashMap: " + data);
        for (Map.Entry entry : data.entrySet()) { //печатаем содержимое HashMap другим способом
            System.out.print(entry + "; ");
        }
        System.out.println("");
        System.out.println("Выводим строки, у которых ключ больше 5: ");
        for (int i = 5; i < data.size() + 1; i++) {//печатаем значения ключей больше пяти
            String line = data.get(i);
            System.out.print(line + "; ");
        }
        System.out.println("");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите значение ключа от 1 до 10 (если 0, выводим все строки через запятую: ");
            int vv = sc.nextInt();
            ArrayList<Integer> keys = new ArrayList<>(data.keySet());
            ArrayList<String> values = new ArrayList<>(data.values());
            if (vv == 0) {
                for (int i = 9; i > -1; i--) {
                    System.out.printf("%d - %s, ", keys.get(i), values.get(i));
                }
            }else {
            System.out.printf("%d - %s, ", keys.get(vv - 1), values.get(vv - 1));
            }
        }catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение " + "(" + e + ")");
        }
    }
}
