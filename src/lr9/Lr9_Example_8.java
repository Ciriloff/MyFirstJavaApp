package lr9;

public class Lr9_Example_8 {
    public static int m(){
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println("1");
        }finally {
            System.out.println("2");
        }
        return 3;
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
