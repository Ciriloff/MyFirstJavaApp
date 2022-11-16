package lr5;
import java.util.Scanner;
import java.util.Arrays;
class Simbol {
    private char let;
    public void addValue (char value){
        let = value;
    }
    public int codeValue (){
        int code = (int) let;
        return code;
    }
    public void lookValue (){
        System.out.print("Символ: " + let + " (" + codeValue() + ")");
    }
}
public class Lr5_Task1 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String cho = String.valueOf(vvod1.nextLine());
        char[] ArrayChar = cho.toCharArray();
        if (ArrayChar.length > 1){
            System.out.println("Нужен был только один символ. Берем первый.");
        }
        char sign = cho.charAt(0);
        Simbol simbol = new Simbol();
        simbol.addValue(sign);
        simbol.lookValue();
    }
}
