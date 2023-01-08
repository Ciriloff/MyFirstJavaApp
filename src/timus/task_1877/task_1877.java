package timus.task_1877;

import java.util.Scanner;

public class task_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int codeOne = in.nextInt();
        int codeTwo = in.nextInt();

        if (codeOne % 2 == 0 || codeTwo % 2 != 0){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}