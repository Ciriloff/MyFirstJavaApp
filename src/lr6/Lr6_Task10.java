package lr6;
import java.util.Arrays;
import java.util.Scanner;
class Blocking{
    private static int[]vozvrat; //переменная класса - новый целочисленный массив
    public static int[] takeInput (int ... v) { //метод работающий через аргумент переменной длины
        int min = 0;
        int max = 0;
        vozvrat = new int[2]; // задаем длину нового массива: min и max
        int count = 0; //переменная нужна для присвоения переменным min и max значений первого элемента
        System.out.print("Количество введенных чисел равно - " + v.length + ". Их значения: ");
        for (int x : v) {
            if (count == 0){ // если методу передан 1 аргумент, то min и max равны ему
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
        vozvrat[0] = min;
        vozvrat[1] = max;
        return vozvrat; // возврат массива с min и max значениями
    }
}
public class Lr6_Task10 {
    public static void main(String[] args) {
        String s;
        int[] drum = new int[10]; // создаём массив для введенных пользователем чисел, но заданной длины
        int i = 0; // индекс элемента вводимого массива
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите целые числа через enter и по окончании нажмите enter ещё раз: ");
        while (vvod1.hasNextLine()){ // ввод чисел пока не будет нажат пустой enter
            s = vvod1.nextLine();
            if (s.isEmpty()){ // если пустой enter, то окончание ввода
                System.out.println("ВВОД ОКОНЧЕН");
                break;
            }
            int numom = Integer.parseInt(s); // преобразовываем введенное как текст число в число
            drum[i] = numom;
            i++;
        }
        int counttwo = 0; // основной счетчик
        int check = 0; // вспомогательный счетчик
        for (int j = drum.length - 1; j > 0; j--){ // убираем из введенного массива лишние нули справа налево
            if (drum[j] == 0){
                check = counttwo;
                counttwo = j;
                if ((check - counttwo) >= 2){ // если 0 перестают идти друг за другом, конец пустой части массива
                    counttwo = check; // индекс последнего введенного с консоли числа
                    break;
                }
            }
        }
        int[] result = new int[counttwo]; // новый массив длиной кол-ву введенных чисел (без нолей)
        for (int q = 0; q < result.length; q++){
            result[q] = drum[q];
        }
        System.out.println("Введенный массив:" + Arrays.toString(result));
        System.out.println("Min и max значения следующие: " + Arrays.toString(Blocking.takeInput(result)));
    }
}
