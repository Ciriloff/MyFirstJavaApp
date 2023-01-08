package timus.task_1787;

import java.util.Scanner;

public class task_1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int lack = 0;
        for (int i = 0; i < n; i++){
            int carInMin = in.nextInt();
            lack = lack + carInMin - k;
            if (lack < 0){
            lack = 0;
            }
        }
        System.out.println(lack);
    }
}
