package lr9;

public class Lr9_Example_7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Ошибка");
        } catch (NullPointerException e){
            System.out.println("1");
            //throw ArithmeticException(); // из-за этой строки программа не работает
        } catch (ArithmeticException e){
            System.out.println("2");
        }
        System.out.println("3");
    }
}
