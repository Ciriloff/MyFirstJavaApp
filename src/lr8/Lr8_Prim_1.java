package lr8;

import java.io.File;

public class Lr8_Prim_1 {
    public static void main(String[] args) {
        try {
            // создание файла в текущей папке (где расположен файл Lr8_Prim_1.java)
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()){
                System.out.println("Создан!!!");
                System.out.println("Полный путь1: " + f1.getAbsolutePath());
            }
            // Создание файла на диске Е и вывод полного пути
            File f2 = new File("E:\\Lr8\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2: " + f2.getAbsolutePath());
            // создание нескольких вложенных папок
            File f3 = new File("E:\\Lr8\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь 3: "+ f3.getAbsolutePath());
        } catch (Exception e){
            System.out.println("Ошибка!!! " + e);
        }
    }
}
