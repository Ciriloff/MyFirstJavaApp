package lr8;

import java.io.*;
import java.net.URL;

public class Lr8_Prim_8 {
    public static void readAllByByte (Reader in) throws IOException{
        while (true){
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1){ // признак конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.println("\n" + "конец");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // С потоком связан файл
            InputStream inFile = new FileInputStream("E:\\Lr8\\MyFileTask8_1.txt"); // байтовый поток
            Reader rFile = new InputStreamReader(inFile,"cp1251"); // символьный поток
            readAllByByte(rFile);
            System.out.println("\n\n");
            inFile.close();
            rFile.close();
            // c потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream(); // байтовый поток
            Reader rUrl = new InputStreamReader(inUrl,"cp1251"); // символьный поток
            readAllByByte(rUrl);
            System.out.println("\n\n");
            inUrl.close();
            rUrl.close();
            // с потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[] {5,8,3,9,11});
            Reader rArray = new InputStreamReader(inArray, "cp1251"); // символьный поток
            readAllByByte(rArray);
            System.out.println("\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
}
