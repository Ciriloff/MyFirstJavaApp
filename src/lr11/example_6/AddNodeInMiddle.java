package lr11.example_6;

public class AddNodeInMiddle {
    public static void main(String[] args) {
        //добавление элементов в середину списка
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
        // создается новый элемент со значением 44 для вставки на 2-ю позицию
        System.out.println("\nДобавляем элемент на 2-е место в списке.");
        Node newNode = new Node(44,null);
        // для перемещения по списку используется вспомогательная переменная ref2,
        // которой в качестве начальной ссылки передается указатель на «голову»
        Node ref2 = head;
        int k = 1; // счетчик элементов
        while (ref2.next != null && k < 2){ // поиск нужного элемента, т.е. 3-го в списке
            ref2 = ref2.next;
            k++;
        }
        // переброска ссылок при вставке элемента
        newNode.next = ref2.next;
        ref2.next = newNode;
        // вывод элементов дополненного списка на экран
        Node ref3 = head;
        while (ref3 != null){ // пока не последний элемент
            System.out.print(" " + ref3.value);
            ref3 = ref3.next;
        }
    }
}
