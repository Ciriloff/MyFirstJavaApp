package lr6;
import java.util.Arrays;
import java.util.Scanner;
class VarArr {
    private char letter; // символьное поле
    private String tekst; // текстовое поле
    public void setLetter(char x) { // присваивающий значение символьному полю
        letter = x;
        System.out.println("Значение символьного поля " + letter);
    }
    public void setLetter(String x) { // присваивающий значение текстовому полю
        tekst = x;
        System.out.println("Значение текстового поля " + tekst);
    }
    public void setLetter(char[] array) {
        int n = array.length;
        if (n == 1){
            letter = array[0];
            System.out.println("Значение символьного поля " + letter);
        } else {
            tekst = Arrays.toString(array);
            System.out.println("Значение текстового поля " + tekst);
        }
    }
}
public class Lr6_Task1 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String z = vvod1.nextLine();
        if (z.length() == 1){
        char shift1 = z.charAt(0);
        VarArr mychar = new VarArr();
        mychar.setLetter(shift1);
        } else {
            VarArr mychar = new VarArr();
            mychar.setLetter(z);
        }
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите символьный массив: ");
        String m = vvod1.nextLine();
        char[] simbol = m.toCharArray();
        VarArr mychar = new VarArr();
        mychar.setLetter(simbol);
    }
}
