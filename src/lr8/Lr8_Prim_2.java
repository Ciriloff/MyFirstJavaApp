package lr8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Lr8_Prim_2 {
    // метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte (InputStream in) throws IOException{
        while (true){
            int oneByte = in.read(); // читает один байт
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args) {
        try {
            // с потоком связан файл
            InputStream inFile = new FileInputStream("E:/Lr8/MyFile3.txt");
            readAllByByte(inFile);
            System.out.println("n\n\n");
            inFile.close();
            // с потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("n\n\n");
            inUrl.close();
            // с потоком связана массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[] {7,5,3,7,4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}

