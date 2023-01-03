package lr8;

import java.io.*;

public class Lr8_Prim_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // создание потоков
            br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\Lr8\\MyFileTask10_1.txt"),"cp1251"));
            out = new PrintWriter("E:\\Lr8\\MyFileTask10_2.txt","cp1251");
            // переписывание информации из одного файла в другой
            int linecount = 0;
            String s;
            while ((s = br.readLine()) != null){ //считываем информацию
                linecount++;
                out.println(linecount + ":" + s); // запись строк в файл
                System.out.println(linecount + ":" + s); // моя вставка - строка выводит строки на экран
            }
        } catch (IOException e){
            System.out.println("Ошибка!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
