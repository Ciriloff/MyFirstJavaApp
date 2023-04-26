package lr11.task_7;

import java.util.ArrayList;
//используем ArrayList
public class Krug_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> krug = new ArrayList();
        int n = 10000; //кол-во элементов в списке
        int k = 2; // удаляем каждый 2-й
        for (int i = 0; i < n; i++) {
            krug.add(i + 1);
        }
        System.out.print("Исходный список Array " + krug + "\n");
        System.out.print("Размер исходный списка " + krug.size() + "\n");

        int count = 0;
        long start = System.currentTimeMillis();//начало процесса
        while (krug.size() != 1) {
            count = (count + k - 1) % krug.size();
            //System.out.println("Удаляем элемент с индексом " + count + "; ");
            krug.remove(count);
            //System.out.println("Обновленный список " + krug);
        }
        System.out.println("В итоге остался один элемент - " + krug.get(0));
        long end = System.currentTimeMillis();//конец процесса
        System.out.println("Длительность процесса: " + (end - start) + " мс");//время процесса
    }
}
