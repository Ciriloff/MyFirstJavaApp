package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int garryshot = in.nextInt();
        int larryshot = in.nextInt();

        int totalcans = garryshot + larryshot - 1;
        int garryunshot = totalcans - garryshot;
        int larryunshot = totalcans - larryshot;

        out.println(garryunshot + " " + larryunshot);
        out.flush();
    }
}
