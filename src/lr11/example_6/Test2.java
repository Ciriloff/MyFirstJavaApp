package lr11.example_6;

public class Test2 {
    public static void main(String[] args) {
        //добавление элементов с хвоста
        Node head = null; //начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--){
            head = new Node(i, head);
        }
        // вывод элементов на экран
        Node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
