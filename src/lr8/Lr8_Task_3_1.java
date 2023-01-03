package lr8;

import java.io.*;
import java.util.Scanner;

public class Lr8_Task_3_1 {
    private static int n = 0;
    public static void main(String[] args) throws IOException {
        DataOutputStream wr = null;
        DataOutputStream wr2 = null;
        DataInputStream rd = null;
        try {
            File q1 = new File("E:\\Lr8\\MyFileTask12_1.txt");
            q1.createNewFile(); //создаем 1-й файл
            if (q1.exists()) {
                System.out.print("Создан 1-й файл. ");
                System.out.println("Полный путь к файлу: " + q1.getAbsolutePath());
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество строк для записи в файл =>");
            n = sc.nextInt();
            wr = new DataOutputStream(new FileOutputStream(q1.getAbsolutePath()));
            sc.nextLine(); //очистка буфера
            for (int i = 0; i < n; i++) { //в цикле получаем ввод строки и два числа в формате int
                System.out.println("Введите строку для записи в файл => ");
                String s = sc.nextLine();
                wr.writeUTF(s + "\n");
            }
            wr.flush(); //очищаем поток ввода в 1-й файл
            wr.close(); //закрываем поток ввода в 1-й файл
            File t1 = new File("E:\\Lr8\\MyFileTask12_2.txt");
            t1.createNewFile(); //создаем 2-й файл
            if (t1.exists()) {
                System.out.print("Создан 2-й файл. ");
                System.out.println("Полный путь к 2-му файлу: " + t1.getAbsolutePath());
            }
            // создаем потоки для чтения из 1-го файла и записи во 2-й
            rd = new DataInputStream(new FileInputStream("E:\\Lr8\\MyFileTask11_1.txt"));
            wr2 = new DataOutputStream(new FileOutputStream("E:\\Lr8\\MyFileTask11_2.txt"));
            for (int i = 0; i < n; i++){
                String tekst = rd.readUTF();
                wr2.writeUTF(tekst);
            }
            rd.close();
            wr2.flush();
            wr2.close();
        } catch (Exception e) {
            System.out.println("Ошибка!!! " + e);
        }
        DataInputStream rdresult = null; // создаем поток для вывода из 2-го файла записанных данных
        try {
            rdresult = new DataInputStream(new FileInputStream("E:\\Lr8\\MyFileTask12_2.txt"));
            for (int i = 0; i < n; i++){
                String vyvod = rdresult.readUTF();
                System.out.println(vyvod);
            }
            rdresult.close();
        } catch (Exception e){
            System.out.println("Вторая ошибка!!! " + e);
        }
    }
}
