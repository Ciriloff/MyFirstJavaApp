package lr11.example_6;

public class AddNodeInTail {
    public static void main(String[] args) {
        //добавление элементов в конец списка
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
        // создается новый элемент со значением 123 – будущий хвост
        System.out.println("\nДобавляем элемент в конец списка.");
        Node newtail = new Node(123,null);
        // для перемещения по списку используется вспомогательная переменная ref2,
        // которой в качестве начальной ссылки передается указатель на «голову»
        Node ref2 = head;
        while (ref2.next != null){ // пока не последний элемент
            ref2 = ref2.next;
        }
        ref2.next = newtail;
        // вывод элементов дополненного списка на экран
        Node ref3 = head;
        while (ref3 != null){ // пока не последний элемент
            System.out.print(" " + ref3.value);
            ref3 = ref3.next;
        }
    }
}
