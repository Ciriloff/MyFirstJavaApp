package lr6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class BlockingTwo{
    private static int[]vozvrattwo; //переменная класса - новый целочисленный массив
    public static int[] takeInputtwo (Integer[] v) { //метод работающий через аргумент ArrayList
        int min = 0;
        int max = 0;
        vozvrattwo = new int[2]; // задаем длину нового массива: min и max
        int count = 0; //переменная нужна для присвоения переменным min и max значений первого элемента
        System.out.print("Количество введенных чисел равно - " + v.length + ". Их значения: ");
        for (int x : v) {
            System.out.print(x + "; ");
            if (count == 0) {
                max = x;
                min = x;
                count++;
            }
            if (max < x) {
                max = x;
            } else if (min > x) {
                min = x;
            }
        }
        System.out.println("");
        vozvrattwo[0] = min;
        vozvrattwo[1] = max;
        return vozvrattwo;
    }
}
public class Lr6_Task10_2 {
    public static void main(String[] args) {
        ArrayList<Integer> drumtwo= new ArrayList<Integer>();
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите целые числа через enter и по окончании введите любой символ: ");
        while (vvod1.hasNextInt()){
            int numo = vvod1.nextInt();
            drumtwo.add(numo);
        }
        Integer vov[] = new Integer[drumtwo.size()];
        drumtwo.toArray(vov);
        //System.out.println("Введенный массив:" + Arrays.toString(vov));
        System.out.println("Min и max значения следующие: " + Arrays.toString(BlockingTwo.takeInputtwo(vov)));
    }
}