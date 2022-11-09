package lr4;
import java.util.Scanner;
import java.util.Arrays;
class Test {
    public static String getEncryptString(String encryptString, int shift) {
        char[] ArrayChar = encryptString.toCharArray(); // текст для кодировки
        char[] ArrayCharNew = new char[ArrayChar.length]; // закодированный тект
        char[] Alfabetru = new char[64]; // Кодовый массив букв
        int[] number = new int[64]; // Кодовый массив Alfabetru, но с числами
        int j = 0;
        for (char i = 'А'; i <= 'я'; i++) { // Заполнение кодового массива буквами
            Alfabetru[j] = i;
            j++;
        }
        int t = 0;
        for (int i = 'А'; i <= 'я'; i++) { // Заполнение кодового массива номерами символов
            number[t] = i;
            t++;
        }
        int sh;
        if (Math.abs(shift) > number.length){ // Проверка величины сдвига на превышение длины кодового массива
            sh = shift % number.length;
        } else {
            sh = shift;
        }
        char let1;
        int z = 0;
        char let2;
        for (int k = 0; k < ArrayChar.length; k++){
            let1 = ArrayChar[k];
            for (int m = 0; m < Alfabetru.length; m++){
                let2 = Alfabetru[m];
            if (let1 == let2){
                if (shift >= 0) { // ветвь для положительного shift (кодировка исходного текста)
                    if ((let2 + sh) <= 1103) { // замещает элементы за пределами массива первыми элементами
                        ArrayCharNew[z] = (char) (let2 + sh);
                        if (z < ArrayChar.length) { // ограничение размера z (не длиннее кодируемого текста)
                            z++;
                        }
                    } else {
                        ArrayCharNew[z] = (char) (let2 + sh - Alfabetru.length);
                        if (z < ArrayChar.length) { // ограничение размера z (не длиннее кодируемого текста)
                            z++;
                        }
                    }
                } else { // ветвь для отрицательного shift (возврат исходного текста)
                    if ((let2 + sh) >= 1040) { // замещает элементы за пределами массива первыми элементами
                        ArrayCharNew[z] = (char) (let2 + sh);
                        if (z < ArrayChar.length) { // ограничение размера z (не длиннее кодируемого текста)
                            z++;
                        }
                    } else {
                        ArrayCharNew[z] = (char) (let2 + sh + Alfabetru.length);
                        if (z < ArrayChar.length) { // ограничение размера z (не длиннее кодируемого текста)
                            z++;
                        }
                    }
                }
            }
            }
        }
        //System.out.println("" + Arrays.toString(ArrayCharNew)); //визуализация для проверки
        encryptString = new String(ArrayCharNew);
        return encryptString;
    }
}
public class lr4_task9 {
    public static void main(String[] args) {
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите текст для шифрования на русском языке: ");
        String simvol = String.valueOf(vvod1.nextLine());
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите ключ: ");
        int shift = vvod2.nextInt();
        Test tekst = new Test();
        String otvet;
        otvet = tekst.getEncryptString(simvol,shift); // Обращение к методу getEncryptString класса Test
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
            Test backtekst = new Test();
            String backotvet;
            backotvet = backtekst.getEncryptString(otvet,- shift);
            System.out.println("Первоначальный текст: " + backotvet);
        } else {
            System.out.println("До свидания!");
        }
    }
}
