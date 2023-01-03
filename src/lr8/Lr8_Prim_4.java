package lr8;

import java.io.*;
import java.util.Scanner;

public class Lr8_Prim_4 {
    public static void main(String[] args) {
        try { // создание исходного файла numIsh.txt и запись в него чисел типа float
            File f1 = new File("E:\\Lr8\\NumIsh.txt");
            f1.createNewFile();
            if (f1.exists()){ // Моя вставка для проверки создания файла №1
                System.out.println("Создан первый файл для чтения");
                System.out.println("Полный путь к 1-му: " + f1.getAbsolutePath());
            }
            Scanner sc = new Scanner(System.in);
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа:");
            for (int i = 0; i < count; i++) {
            wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();
            // создание файла NumRez.txt и переписывание в него чисел из NumIsh.txt
            File f2 = new File("E:\\Lr8\\NumRez.txt");
            f2.createNewFile();
            if (f2.exists()){ // Моя вставка для проверки создания файла №2
                System.out.println("Создан второй файл для записи");
                System.out.println("Полный путь к 2-му: " + f2.getAbsolutePath());
            }
            // поток для чтения из исходного файла NumIsh.txt
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            // поток для записи в результирующий файл NumRez.txt
            wr = new DataOutputStream (new FileOutputStream(f2.getAbsolutePath()));
            try {
                while (true){
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Число " + (float)number);
                }
            } catch (EOFException e){}
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e){
            System.out.println("End of file");
        }
    }
}
