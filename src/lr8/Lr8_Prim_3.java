package lr8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Lr8_Prim_3 {
    // считает по 5 символов (буфер)
    public static void readAllByArray (InputStream in) throws IOException{
        byte[] buff = new byte[5]; // за один проход считывается 5 байт (символов)
        while (true){
            int count = in.read(buff);
            if (count != -1){ // если не конец файла
                System.out.println("количество = " + count + ", buff = "
                        + Arrays.toString(buff) + ", str = "
                        + new String(buff,0,count,"cp1251")); // "UTF8"
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "E:\\Lr8\\MyFile2.txt";
        InputStream inFile = null; // переменная объявляется до секции try, чтобы не ограничивать область видимости
        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e){
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e);
        } finally {
            if (inFile != null){
                try {
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/
                }
            }
        }
    }
}
