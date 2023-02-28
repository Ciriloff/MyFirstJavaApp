package lr9;

public class Lr9_Example_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) { // неподходящий класс для перехвата исключения
            System.out.println("1");
        }
        System.out.println("2");
    }
} // программа не работает!
