package lr9;

public class Lr9_Example_3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2"); // подходит только это исключение
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
