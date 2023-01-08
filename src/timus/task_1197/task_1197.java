package timus.task_1197;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int x;
        int y;
        int count = 0;
        char x1, y1;
        for (int k = 0; k < n; k++){
            String place = in.next();
            x1 = place.charAt(0);
            y1 = place.charAt(1);
            x = (int) x1 - 96;
            y = (int) y1 - 48;
            for (int i = -2; i <= 2; i++){
                for (int j = -2; j<= 2; j++){
                    if (j != i){
                        if (x - i > 0 && y - j > 0 && x - i < 9 && y - j < 9){
                            if (i * i + j * j == 5){
                                count++;
                            }
                        }
                    }
                }
            }
            out.println(count);
            count = 0;
        }
        out.flush();
    }
}
