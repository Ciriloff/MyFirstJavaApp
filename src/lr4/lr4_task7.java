package lr4;
import java.util.Scanner;
import java.util.Random;
public class lr4_task7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите количество строк в массиве: ");
        int line = vvod1.nextInt();
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите количество колонок в массиве: ");
        int column = vvod2.nextInt();
        int[][] two = new int[line][column]; // Создаем массив из заданного кол-ва строк и колонок
        int count = 0; // счетчик шагов строка/столбец
        int addcount = 0; // корректировка значений j на нечетных шагах
        int chk = 0; // счетчик строк для ограничения значений i на нечетных шагах
        for (int content = 1; content < (line * column)+1;) {
            if (count % 2 == 0){ // четный шаг
                int i = count/2;
                chk++;
                if (i >= line){ // ограничение значений i (кол-во строк) на четных шагах
                    break;
                }
                for (int j = 0; j < two[0].length - count/2; j++){
                    two[i][j] = content;
                    content++;
                }
            } else { // нечетный шаг
                int j = column - (count-addcount);
                for (int i = two.length-1; i > -1+chk; i--){
                    two[i][j] = content;
                    content++;
                }
                addcount++;
            }
            count++;
        }
        for (int i = 0; i < two.length; i++) { // Печать заполненного массива
            for (int j = 0; j < two[0].length; j++) {
                System.out.print(" " + two[i][j]);
            }
            System.out.println(" ");
        }
    }
}