package lr4;

public class lr4_task1 {
    public static void main(String[] args) {
        int column = 23;
        int line = 11;
        int i;
        int j;
        for (i = 0; i < line; i++){
            System.out.print(": ");
            for (j = 0; j < column; j++){
                System.out.print("+");
            }
            System.out.println("");
        }
    }
}
