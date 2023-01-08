package timus.task_1639;

import java.util.Scanner;

public class task_1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        int total = (m * n) % 2;
        if (total == 0){
            System.out.println("[:=[first]");
        } else {
            System.out.println("[second]=:]");
        }
    }
}
