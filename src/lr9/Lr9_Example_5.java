package lr9;

public class Lr9_Example_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (Exception e) { // изначально в примере NullPointerException - неподходящий класс
            System.out.println("1 " + e);
        }
        System.out.println("2");
    }
} // программа работает после замены NullPointerException на Exception
