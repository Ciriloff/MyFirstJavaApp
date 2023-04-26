package lr11.example_6;

public class DeleteNodeInMiddle {
    public static void main(String[] args) {
        //удаление элементов из середины списка
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
        // для перемещения по списку используется вспомогательная переменная ref2,
        // которой в качестве начальной ссылки передается указатель на «голову»
        Node ref2 = head;
        int k = 1; // счетчик элементов
        while (ref2.next != null && k < 2){ // поиск нужного элемента, т.е. 3-го в списке
            ref2 = ref2.next;
            k++;
        }
        // переброска ссылок при удалении элемента
        ref2.next = ref2.next.next;
        System.out.println("");
        // вывод элементов сокращенного списка на экран
        Node ref3 = head;
        while (ref3 != null){ // пока не последний элемент
            System.out.print(" " + ref3.value);
            ref3 = ref3.next;
        }
    }
}
