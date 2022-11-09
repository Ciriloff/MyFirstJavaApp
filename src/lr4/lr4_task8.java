package lr4;
import java.util.Scanner;

class Encrypt {
    public static String getEncryptString(String encryptString, int shift) {
        char[] ArrayChar = encryptString.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];
        for (int i = 0; i < ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] + shift;
            ArrayCharNew[i] = (char) ArrayInt[i];
        }
        encryptString = new String(ArrayCharNew);
        return encryptString;
    }
}
public class lr4_task8 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String simvol = String.valueOf(vvod1.nextLine());
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите ключ: ");
        int shift = vvod2.nextInt();
        Encrypt tekst = new Encrypt();
        String otvet;
        otvet = tekst.getEncryptString(simvol,shift);
        System.out.println("Текст после преобразования: " + otvet);
        String cho;
        char choice;
        do {
            System.out.print("Выполнять обратное преобразование? Y/N: ");
            Scanner vvod3 = new Scanner(System.in);
            cho = vvod3.nextLine();
            choice = cho.charAt(0);
        }
        while (choice != 'N' && choice != 'Y');
        System.out.println("");
        if (choice == 'Y'){
            Encrypt backtekst = new Encrypt();
            String backotvet;
            backotvet = backtekst.getEncryptString(otvet,- shift);
            System.out.println("Первоначальный текст: " + backotvet);
        } else {
            System.out.println("До свидания!");
        }
    }
}