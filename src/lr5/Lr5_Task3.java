package lr5;
import java.util.Scanner;
class Chok{
    int value1;
    int value2;
    Chok(){ //конструктор без параметров
        value1 = 1;
        value2 = 1;
        System.out.println("Создание объекта конструктором без параметров. Значение: " + value1);
    }
    Chok(int value1){ //конструктор с одним параметром
        this.value1 = value1;
        System.out.printf("Создаем объект по одному параметру %d. ",value1);
        System.out.println("Произведение числа самого на себя " + value1 * value1 + ".");
    }
    Chok(int value1, int value2){ //конструктор с двумя параметрами
        this.value1 = value1;
        this.value2 = value2;
        System.out.printf("Создаем объект по двум параметрам %d и %d. ", value1, value2);
        System.out.println("Произведение 2-х чисел " + value1 * value2 + ".");
    }
}
public class Lr5_Task3 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите число №1: ");
        int shift1 = vvod1.nextInt();
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите число №2: ");
        int shift2 = vvod2.nextInt();
        Chok mychok1 = new Chok();
        Chok mychok2 = new Chok(shift1);
        Chok mychok3 = new Chok(shift1, shift2);
    }
}
