package lr8;
import java.io.*;

import static java.lang.Character.toLowerCase;

public class Lr8_Task_3 {
    public static String oneString (String in) {
        String vvod = in.replace(",", "").replace(".", "").
                replace("?", "").replace("!", "");
        String[] arrword = vvod.split(" ");
        StringBuilder words = new StringBuilder(); // создаем объект StringBuilder
        String conconant = "бвгджзйклмнпрстфхцчшщ"; // список согласных букв
        int counterword = 0; // счетчик кол-ва слов
        for (int i = 0; i < arrword.length; i++) {
            char loose = toLowerCase(arrword[i].charAt(0));
            if (conconant.indexOf(loose) != -1) {
                counterword++;
                String needword = arrword[i] + " ";
                words.append(needword); // формируем строку из слов на согласную букву
            }
        }
        String vyvod = String.valueOf(words.append(counterword)); // добавляем в строку кол-во слов
        return vyvod; // возвращаем готовую строку
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:\\Lr8\\MyFileTask12_1.txt"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("E:\\Lr8\\MyFileTask12_2.txt"));
            int counterline = 0; // счетчик кол-ва строк
            String readtekst;
            while ((readtekst = br.readLine()) != null) {
                counterline++;
                String valueOut = oneString(readtekst);
                System.out.println(counterline + ": " + valueOut);
                wr.write(counterline + ": " + valueOut);
                wr.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода: " + e);
        }
    }
}
