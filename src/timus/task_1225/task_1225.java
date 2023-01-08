package timus.task_1225;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int stripe = in.nextInt();
        long num = 0;
        if (stripe == 1 || stripe == 2){
            num = 2;
        } else {
            long x = 2;
            long y = 2;
            for (int i = 2; i < stripe; i++){
                num = x + y;
                x = y;
                y = num;
            }
        }
        out.println(num);
        out.flush();
    }
}
