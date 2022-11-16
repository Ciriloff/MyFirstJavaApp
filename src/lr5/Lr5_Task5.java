package lr5;
import java.util.Scanner;
class Proba {
    private int one;
    Proba(){ //конструктор без параметров
        one = 0;
        System.out.printf("Значение поля через конструктор без параметров %d \n", one);
    }
    Proba(int a){ //конструктор с одним параметром
        if (a <= 100){
            one = a;
        } else {
            one = 100;
        }
        System.out.printf("Значение поля через конструктор с 1-м параметром %d \n", one);
    }
    public void plusValue (int zum){ //метод с одним параметром
        if (zum <= 100){
            one = zum;
        } else {
            one = 100;
        }
        System.out.printf("Значение поля через метод с 1-м параметром %d \n", one);
    }
    public void plusValue (){ //метод без параметров
        one = 0;
        System.out.printf("Значение поля через метод без параметров %d \n", one);
    }
    public int chekValue (){ //метод для проверки значения параметров
        int two = one;
        return two;
    }
}
public class Lr5_Task5 {
    public static void main(String[] args) {
        String s;
        int shift1 = 0;
        int result, result1;
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("ПРОВЕРКА РАБОТЫ МЕТОДОВ.\nВведите целое число (аргумент) или нажмите Enter без ввода значений: ");
        s = vvod1.nextLine(); //ввод с консоли
        if (s.isEmpty()){ //если ввода не было, т.е. пользователь нажал Enter
            System.out.println("Рассчет через метод БЕЗ параметров:");
            Proba mycount1 = new Proba();
            mycount1.plusValue();
            result = mycount1.chekValue();
            System.out.println("Проверка значения числового поля " + result);
        } else {
            System.out.println("Рассчет через метод с 1-М параметром:");
            shift1 = Integer.parseInt(s);
            Proba mycount2 = new Proba(shift1);
            mycount2.plusValue(shift1);
            result1 = mycount2.chekValue();
            System.out.println("Проверка значения числового поля " + result1);
        }
    }
}
