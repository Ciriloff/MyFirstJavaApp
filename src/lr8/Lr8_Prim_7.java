package lr8;

import java.io.*;

public class Lr8_Prim_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            //создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("E:\\Lr8\\MyFileTask7_1.txt"),1024); // 1024 это 1кБ размер буффера
            out = new BufferedWriter(new FileWriter("E:\\Lr8\\MyFileTask7_2.txt"));
            int linecounter = 0; // счетчик строк
            String s;
            // переписываение информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                linecounter++;
                System.out.println(linecounter + ":" + s);
                out.write(s);
                out.newLine(); // переход на новую строку
            }
        } catch (IOException e){
            System.out.println("Ошибка!!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
