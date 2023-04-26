package lr11.task_8;

public class Main_v2 {
    public static void main(String[] args) {
        List basecreate = new List(); //переменная для вызова методов

        System.out.println("Создаем список начиная с головы: ");
        List primer_v2 = List.createListHead_v2(9);//1-й способ запустить метод
        System.out.println(primer_v2);

        System.out.println("\nСоздаем список начиная с хвоста: ");
        List primer_v3 = List.createListTail_v2(9);//1-й способ запустить метод
        System.out.println(primer_v3);

        System.out.println("\nСоздаем список рекурсией начиная с хвоста: ");
        System.out.println(basecreate.createListRecur_v2(9));//2-й способ запустить метод

        System.out.println("\nСоздаем список рекурсией начиная с головы: ");
        System.out.println(basecreate.createListRecHead_v2(9));//2-й способ запустить метод

        System.out.println("\nДобавляем в начало списка элемент 33: ");
        System.out.println(basecreate.addInListHead(33,basecreate.createListHead_v2(9)));

        System.out.println("\nДобавляем в конец списка элемент 55: ");
        System.out.println(basecreate.addInListTail(55,basecreate.createListHead_v2(9)));

        System.out.println("\nДобавляем в середину списка элемент 35: ");
        System.out.println(basecreate.addInListMiddle(35,basecreate.createListHead_v2(9)));

        System.out.println("\nУдаляем первый элемент из начала списка: ");
        System.out.println(basecreate.removeInHead(basecreate.createListHead_v2(9)));

        System.out.println("\nУдаляем последний элемент из списка: ");
        System.out.println(basecreate.removeInTail(basecreate.createListHead_v2(9)));

        System.out.println("\nУдаляем 5-й элемент из середины списка: ");
        System.out.println(basecreate.removeInMiddle(5,basecreate.createListHead_v2(9)));
    }
}
