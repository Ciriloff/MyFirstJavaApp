package lr11.example_6;

public class DeleteNodeInHead {
    public static void main(String[] args) {
        //удаление элементов с головы
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
        System.out.println("\nУдаляем элемент из начала списка.");
        Node ref2 = head.next;
        while (ref2 != null){
            System.out.print(" " + ref2.value);
            ref2 = ref2.next;
        }
    }
}
