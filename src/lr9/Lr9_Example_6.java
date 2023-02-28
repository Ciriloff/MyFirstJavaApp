package lr9;

public class Lr9_Example_6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
//        } catch (RuntimeException e) { // RuntimeException не может идти после Exception
//            System.out.println("3");
        }
        System.out.println("4");
    }
}
