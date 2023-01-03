package lr8;

import java.io.*;

public class Lr8_Prim_6 {
    public static void main(String[] args) throws IOException { // метод main генерирует исключение
        Reader in = null; // можно сразу записать FileReader in=null;
        Writer out = null; // можно сразу записать FileWriter out =null;
        try {
            in = new FileReader("E:\\Lr8\\MyFile2.txt"); // файл для чтения
            out = new FileWriter("E:\\Lr8\\MyFileTask6_2.txt", true); // файл для записи, append - true
            // Данные считываются и записываются побайтно, как и для
            // InputStream/OutputStream
            int oneByte;
            while ((oneByte = in.read()) != -1){
                //out.write((char)oneByte); //запись с уничтожением ранее существующих данных
                out.append((char) oneByte); // запись с добавлением данных в конец
                System.out.print((char) oneByte);
            }
        } catch (IOException e){
            System.out.println("Ошибка!!!! ");
        }
        finally {
            in.close();
            out.close();
        }
    }
}
