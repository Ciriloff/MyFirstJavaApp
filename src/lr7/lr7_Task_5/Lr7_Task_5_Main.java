package lr7.lr7_Task_5;

public class Lr7_Task_5_Main {
    public static void main(String[] args) {
        SuperA5Class superA5 = new SuperA5Class("Задание №5"); // создаем объект класса A
        String superA5string = superA5.toTekst();
        System.out.println(superA5string);

        SubG5Class subG5 = new SubG5Class("Задание №5 через подкласс G5", 222); // создаем объект G
        String subG5string = subG5.toTekst();
        System.out.println(subG5string);

        SubH5Class subH5 = new SubH5Class("Задание №5 через 2-й подкласс H5", 'W'); // создаем объект H
        String subH5string = subH5.toTekst();
        System.out.println(subH5string);

        SuperA5Class assa; // ссылочная переменная

        assa = superA5; // ссылочная переменная ссылается на объект класса A
        System.out.println(assa.toTekst()); // вызов переопределенного метода через ссылочную переменную

        assa = subG5; // ссылочная переменная ссылается на объект класса G
        System.out.println(assa.toTekst()); // вызов переопределенного метода через ссылочную переменную

        assa = subH5; // ссылочная переменная ссылается на объект класса H
        System.out.println(assa.toTekst()); // вызов переопределенного метода через ссылочную переменную
    }
}
