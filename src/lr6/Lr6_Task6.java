package lr6;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
class Rozen {
    private static int x; //переменная класса определяющая размер нового массива
    private static int[] uparray; //новый массив
    public static void turnArray(int v, int[] myarray) { //метод формирующий новый массив
        x = v;
        if (x < myarray.length){ //если новый массив меньше исходного
        uparray = new int[x];
        for (int i = 0; i < x; i++){
            uparray[i] = myarray[i];
        }
        } else if (x >= myarray.length) { //если длина нового массива равна или больше исходного
            uparray = myarray.clone();
        }
        System.out.println("Новый массив " + Arrays.toString(uparray));
    }
}
public class Lr6_Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner vvod1 = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = vvod1.nextInt();
        int[]newarray = new int[num];
        for (int j = 0; j < newarray.length; j++){ //формируем исходный массив
            newarray[j] = random.nextInt(1000);
        }
        System.out.println("Введенный массив " + Arrays.toString(newarray));
        Scanner vvod2 = new Scanner(System.in);
        System.out.print("Введите размер нового массива: ");
        int pop = vvod2.nextInt();
        Rozen.turnArray(pop, newarray); //вызов статического метода для формирования нового массива
    }
}
