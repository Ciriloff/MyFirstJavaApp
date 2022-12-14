package lr7.lr7_Task_2;

public class Lr7_Task_2_Main {
    public static void main(String[] args) {
        SuperClassTask_2 superA = new SuperClassTask_2("Конструктор Суперкласса");
        String superName = superA.toString();
        System.out.println(superName);

        SuperClassTask_2 superD = new SuperClassTask_2();
        String superTwoName = superD.toString("Метод Суперкласса");
        System.out.println(superTwoName);

        SubClassTask_2 subB1 = new SubClassTask_2("Конструктор Подкласса 1 параметр");
        String subName = subB1.toString();
        System.out.println(subName);

        SubClassTask_2 subB2 = new SubClassTask_2("Конструктор Подкласса 2 параметра", 10);
        String subName2 = subB2.toString();
        System.out.println(subName2);

        SubClassTask_2 subB3 = new SubClassTask_2();
        String subName3 = subB3.toString("Метод Подкласса 2 параметра", 10);
        System.out.println(subName3);

        SubClassTask_2 subB4 = new SubClassTask_2();
        String subName4 = subB4.toString("Метод Подкласса 1 параметр");
        System.out.println(subName4);

        SubClassTask_2 subB5 = new SubClassTask_2();
        String subName5 = subB5.toString(69);
        System.out.println(subName5);
    }
}
