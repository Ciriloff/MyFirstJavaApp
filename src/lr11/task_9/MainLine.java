package lr11.task_9;
import java.util.*;

public class MainLine {
    private static int x = 10000000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        System.out.println("Время создания arrayList = " + getRunningTime(arrayList));
        System.out.println("Время создания linkedList = " + getRunningTime(linkedList));
        System.out.println("Время создания treeMap = " + getRunningTimeMap(treeMap));
        System.out.println("Время создания arrayDeque = " + getRunningTimeDeque(arrayDeque));

        System.out.println("Время добавления элемента treeMap = " + getRunningTimeMapInOne(treeMap));
        System.out.println("Время удаления 1-го элемента treeMap = " + getRunningTimeMapRemOne(treeMap));
        System.out.println("Время удаления последнего элемента treeMap = " + getRunningTimeMapRemLast(treeMap));
        System.out.println("Время удаления элемента из середины treeMap = " + getRunningTimeMapRemMidd(treeMap));

        System.out.println("Время добавления 1-го arrayDeque = " + getRunningTimeDequeInOne(arrayDeque));
        System.out.println("Время удаления 1-го arrayDeque = " + getRunningTimeDequeRemOne(arrayDeque));
        System.out.println("Время добавления в середину arrayDeque = " + getRunningTimeDequeInMidd(arrayDeque));
        System.out.println("Время удаления из середины arrayDeque = " + getRunningTimeDequeRemMidd(arrayDeque));
    }
    private static long getRunningTime(List<Integer> list) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < x; i++) {
            list.add(i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        //System.out.println(list);
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
    //Map
    private static long getRunningTimeMap(TreeMap<Integer, String> map) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < x*2; i+=2) {
            map.put(i, "A");
        }
        long end = System.currentTimeMillis();
        //System.out.println(map);
        return end - start;
    }
    private static long getRunningTimeMapInOne(TreeMap<Integer, String> map) {//добавление в Map элемента
        long start = System.currentTimeMillis();
        map.put(1,"V");
        long end = System.currentTimeMillis();
        //System.out.println(map);
        return end - start;
    }
    private static long getRunningTimeMapRemOne(TreeMap<Integer, String> map) {//удаление в Map элемента
        long start = System.currentTimeMillis();
        map.pollFirstEntry();
        long end = System.currentTimeMillis();
        //System.out.println(map);
        return end - start;
    }
    private static long getRunningTimeMapRemLast(TreeMap<Integer, String> map) {//удаление в Map элемента
        long start = System.currentTimeMillis();
        map.pollLastEntry();
        long end = System.currentTimeMillis();
        //System.out.println(map);
        return end - start;
    }
    private static long getRunningTimeMapRemMidd(TreeMap<Integer, String> map) {//удаление из середины Map
        long start = System.currentTimeMillis();
        int k = 0;
        for (Map.Entry m : map.entrySet()){
            if (m.getKey().equals(x)){
                k = (int) m.getKey();
            }
        }
        map.remove(k);
        long end = System.currentTimeMillis();
        //System.out.println(map);
        return end - start;
    }
    //Очередь
    private static long getRunningTimeDeque(ArrayDeque<Integer> deque) {//создание очереди
        long start = System.currentTimeMillis();
        for (int i = 0; i < x; i++) {
            deque.add(i);
        }
        long end = System.currentTimeMillis();
        //System.out.println(deque);
        return end - start;
    }
    private static long getRunningTimeDequeInOne(ArrayDeque<Integer> deque) {//добавление в очередь 1-го
        long start = System.currentTimeMillis();
        deque.addFirst(33);
        long end = System.currentTimeMillis();
        //System.out.println(deque);
        return end - start;
    }
    private static long getRunningTimeDequeRemOne(ArrayDeque<Integer> deque) {//удаление из очереди 1-го
        long start = System.currentTimeMillis();
        deque.removeFirst();
        long end = System.currentTimeMillis();
        //System.out.println(deque);
        return end - start;
    }
    private static long getRunningTimeDequeInMidd(ArrayDeque<Integer> deque) {//нельзя добавить в середину очереди
        long start = System.currentTimeMillis();
        for (int i = 0; i < deque.size(); i++) {
            if (i == x/2){
                deque.push(i * 7);
            }
        }
        long end = System.currentTimeMillis();
        //System.out.println(deque);
        return end - start;
    }
    private static long getRunningTimeDequeRemMidd(ArrayDeque<Integer> deque) {//удаление из очереди середины
        long start = System.currentTimeMillis();
        for (int i = 0; i < deque.size(); i++) {
            if (i == x/2){
                deque.remove(i);
            }
        }
        long end = System.currentTimeMillis();
        //System.out.println(deque);
        return end - start;
    }
}
