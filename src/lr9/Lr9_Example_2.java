package lr9;

public class Lr9_Example_2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("1"); // недостижимый код
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}
