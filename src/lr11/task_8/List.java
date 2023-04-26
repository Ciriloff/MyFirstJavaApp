package lr11.task_8;

public class List { //класс - структура элемента списка
    public int value; //значение
    public List next; //поле - ссылка (указатель) на следующий узел
    List(int value, List next){ // конструктор класса c 2-я параметрами
        this.value = value;
        this.next = next;
    }
    List(){}

    @Override
    public String toString() {
        if(next == null){
        return "" + value;
        }
        return "" + value + "; " + next;
    }
    //ниже все методы, которые я изначально создал в отдельных классах
    public static List head = null;
    public static List head2 = null;
    public static List head3 = null;

    public static List createListTail_v2(int w) { //добавление элементов с хвоста списка
        for (int i = w; i >= 0; i--){
            head = new List(i, head);
        }
        return head;
    }

    public static List createListHead_v2(int w){ //добавление элементов с головы списка
        List head = new List(0,null);
        List tail = head;
        for (int i = 1; i <= w; i++){
            tail.next = new List(i,null);
            tail = tail.next;
        }
        return head;
    }
    public List createListRecur_v2(int w){ //добавление элементов рекурсией с хвоста списка (не static)
        head2 = new List(w, head2);
        if (w > 0){
            createListRecur_v2(w - 1);
        }
        return head2;
    }
    public List createListRecHead_v2(int w){ //добавление элементов рекурсией с головы списка (не static)
        if (w < 0){
            return null;
        }
        return head3 = new List(w,createListRecHead_v2(w - 1));
    }
    public List addInListHead(int elem, List list){ //добавление в список 1-го эл-та
        List addlist = new List(elem,list);
        return addlist;
    }
    public List addInListTail(int elem, List list){ //добавление в список последнего эл-та
        List addtail = new List(elem,null);
        List ref = list;
        while (ref.next != null){ // пока не последний элемент
            ref = ref.next;
        }
        ref.next = addtail;
        return list;
    }
    public List addInListMiddle(int elem, List list){ //добавление в список последнего эл-та
        List addmiddle = new List(elem,null);
        List ref1 = list;
        int k = 1;
        while (ref1.next != null && (k < 4)){ // пока не последний элемент
            ref1 = ref1.next;
            k++;
        }
        addmiddle.next = ref1.next;
        ref1.next = addmiddle;
        return list;
    }
    public List removeInHead(List list){ //удаление из списка 1-го эл-та
        List addlist = list.next;
        return addlist;
    }
    public List removeInTail(List list){ //удаление из списка последнего эл-та
        List ref = list;
        while (ref.next.next != null){ // пока не последний элемент
            ref = ref.next;
        }
        ref.next = null;
        return list;
    }
    public List removeInMiddle(int count, List list){ //удаление из списка последнего эл-та
        List ref3 = list;
        int k = 1;
        while (ref3.next != null && (k < count)){ // пока не последний элемент
            ref3 = ref3.next;
            k++;
        }
        ref3.next = ref3.next.next;
        return list;
    }
}
