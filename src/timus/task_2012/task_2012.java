package timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int quantTask = in.nextInt();
        int otherTask = 12 - quantTask;
        if ((4 * 60) > (otherTask * 45)){
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.flush();
    }
}
