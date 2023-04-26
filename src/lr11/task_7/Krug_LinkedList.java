package lr11.task_7;

        import java.util.LinkedList;
//используем LinkedList
public class Krug_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> kruglinked = new LinkedList<>();
        int n = 10000; //кол-во элементов в списке
        int k = 2; // удаляем каждый 2-й
        for (int i = 0; i < n; i++) {
            kruglinked.add(i + 1);
        }
        System.out.print("Исходный список Linked " + kruglinked + "\n");
        System.out.print("Размер исходный списка " + kruglinked.size() + "\n");

        int count = 0;
        long startlin = System.currentTimeMillis();//начало процесса
        while (kruglinked.size() != 1) {
            count = (count + k - 1) % kruglinked.size();
            //System.out.println("Удаляем элемент с индексом " + count + "; ");
            kruglinked.remove(count);
            //System.out.println("Обновленный список " + kruglinked);
        }
        System.out.println("В итоге остался один элемент - " + kruglinked.get(0));
        long endlin = System.currentTimeMillis();//конец процесса
        System.out.println("Длительность процесса: " + (endlin - startlin) + " мс");//время процесса
    }
}