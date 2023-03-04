package lr9;

public class Lr9_Example_13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива = " + l);
            int h = 10 / l;
            System.out.println("Значение h = " + h);
            args[l + l] = "10";
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс не существует");
        }
    }
}
