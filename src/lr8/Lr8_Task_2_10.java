package lr8;

import java.io.*;
import java.util.Scanner;

public class Lr8_Task_2_10 {
    public static void main(String[] args) throws IOException {
        DataOutputStream wr = null;
        try {
            File q1 = new File("E:\\Lr8\\MyFileTask11_1.txt");
            q1.createNewFile();
            if (q1.exists()) {
                System.out.println("Создан файл");
                System.out.println("Полный путь к файлу: " + q1.getAbsolutePath());
            }
            Scanner sc = new Scanner(System.in);
            wr = new DataOutputStream(new FileOutputStream(q1.getAbsolutePath()));
            System.out.println("Введите две строки текста =>");
            for (int i = 0; i < 2; i++) {
                wr.writeChars(sc.nextLine());
            }
            System.out.println("Введите пять чисел типа double =>");
            for (int i = 0; i < 5; i++){
                wr.writeDouble(sc.nextDouble());
            }
        } catch (Exception e) {
            System.out.println("Ошибка здесь " + e);
        } finally {
            wr.flush();
            wr.close();
        }
        DataInputStream rd = null;
        DataOutputStream wr2 = null;
        try {
            File t1 = new File("E:\\Lr8\\MyFileTask11_2.txt"); //второй файл
            t1.createNewFile();
            if (t1.exists()) {
                System.out.println("Создан 2-й файл");
                System.out.println("Полный путь к 2-му файлу: " + t1.getAbsolutePath());
            }
            rd = new DataInputStream(new FileInputStream("E:\\Lr8\\MyFileTask11_1.txt"));
            wr2 = new DataOutputStream(new FileOutputStream("E:\\Lr8\\MyFileTask11_2.txt"));
            while (true){
                String tekst = String.valueOf(rd.readChar());
                wr2.writeChars(tekst);
                System.out.print(tekst);
            }
        }catch (Exception e){
            System.out.println("Ошибка!!! " + e);
        } finally {
            wr2.flush();
            wr2.close();
            rd.close();
        }
    }
}
