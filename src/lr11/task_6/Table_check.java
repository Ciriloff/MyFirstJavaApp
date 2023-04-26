package lr11.task_6;

import java.util.*;

public class Table_check {
    private static int sum = 0;
    public static void main(String[] args) {
        HashMap<Integer, String> data_1 = new HashMap<>();
        data_1.put(1, "Раз");
        data_1.put(2, "Два");
        data_1.put(3, "Три");
        data_1.put(4, "Четыре");
        data_1.put(5, "Пять");
        data_1.put(6, "Шесть");
        data_1.put(7, "Семь");
        data_1.put(8, "Восемь");
        data_1.put(9, "Девять");
        data_1.put(10, "Десять");
        System.out.println("Содержимое HashMap: " + data_1);
        System.out.print("Значения HashMap, длина которых более 5 символов: ");
        data_1.forEach((Integer k, String v) -> {//используем цикл foreach и лямбда-выражение
            char[] charlist = v.toCharArray();
            if (charlist.length > 5) {
                System.out.print(v + ", ");
                sum += k;
            }
        });
        System.out.println("");
        System.out.println("Сумма всех ключей HashMap, значение которых длиннее 5 символов = " + sum);
    }
}
