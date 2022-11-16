package lr5;
import java.util.Scanner;
class Bot{
    char botchar;
    int botint;
    double botdouble;
    Bot(char botchar, int botint){
        this.botchar = botchar;
        this.botint = botint;
        System.out.printf("Создаем объект по двум параметрам %s и %d. ", botchar, botint);
    }
    Bot(double botdouble){
        this.botdouble = botdouble; // нужна ли эта строка если вычисляем по аргументы?
        int part = (int) botdouble;
        int partback = (((int) (botdouble * 100)) - (part * 100));
        System.out.println("");
        System.out.printf("Целая часть числа - %d, дробная часть числа - %d. ", part, partback);
        this.botchar = (char) part;
        this.botint = partback;
        System.out.print("Символ "+ botchar + ", а целое число " + botint);
    }
}
public class Lr5_Task4 {
    public static void main(String[] args) {
        String tekst;
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите символ: ");
        tekst = vvod1.nextLine();
        char shift1 = tekst.charAt(0);
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int shift2 = vvod2.nextInt();
        Scanner vvod3 = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        double shift3 = vvod3.nextDouble();
        Bot mybot1 = new Bot(shift1, shift2);
        Bot mybot2 = new Bot(shift3);
    }
}
