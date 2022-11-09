package lr3;
import java.util.Scanner;
import java.util.Arrays;
public class task8 {
    public static void main(String[] args) {
        char[] alfabet = new char[20]; // Создаём массив без гласных
        int j = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            if(i=='A' || i=='E' || i=='I' || i=='O' || i=='U' || i=='Y') continue;
            alfabet[j] = i;
            //System.out.print((int) alfabet[j] + ";");
            j++;
        }
        Scanner vvod = new Scanner(System.in);
        System.out.print("Сколько согласных букв английского алфавита показать: ");
        int sum = vvod.nextInt(); // Ввод размера массива
        if (sum < 21 && sum > 0) {
            System.out.printf("Вы запросили %d букв \n", sum);
        } else {
            System.out.println("Введенное вами количество отобразить невозможно");
            sum = 0;
        }
        char[] letters = new char[sum];
        for (int k = 0; k < sum; k++){
            letters[k] = alfabet[k];
        }
        System.out.println("" + Arrays.toString(letters));
    }
}
