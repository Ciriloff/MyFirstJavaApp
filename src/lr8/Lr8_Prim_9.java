package lr8;

import java.io.*;

public class Lr8_Prim_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            // создание потоков для чтения и записи с нужной кодировкой
            br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\Lr8\\MyFileTask8_1.txt")));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\Lr8\\MyFileTask9_2.txt")));
            // переписывание информации из одного файла в другой
            int linecount = 0; // счетчик строк
            String s;
            while ((s = br.readLine()) != null){
                linecount++;
                System.out.println(linecount + ":" + s);
                bw.write(linecount + ":" + s); // запись без перевода строки
                bw.newLine(); // принудительный переход на новую строку
            }
        } catch (IOException e){
            System.out.println("Ошибка!!!!");
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
