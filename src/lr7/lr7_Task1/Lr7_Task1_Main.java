package lr7.lr7_Task1;

public class Lr7_Task1_Main {
    public static void main(String[] args) {
        SuperMyClass superMyClassA = new SuperMyClass("Конструктор Супер");
        String superName = superMyClassA.toString();
        System.out.println(superName);
        SubMyClass subMyClassB1 = new SubMyClass("Конструктор Подкласс");
        String subName = subMyClassB1.toString();
        System.out.println(subName);
        SubMyClass subMyClassB2 = new SubMyClass("Конструктор Подкласс", "С двумя параметрами");
        String subName2 = subMyClassB2.toString();
        System.out.println(subName2);
    }
}
