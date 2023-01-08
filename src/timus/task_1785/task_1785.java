package timus.task_1785;

import java.util.Scanner;

public class task_1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantity = in.nextInt();
        if (quantity >= 1 && quantity <= 4){
            System.out.println("few");
        } else if (quantity >= 5 && quantity <= 9) {
            System.out.println("several");
        } else if (quantity >= 10 && quantity <= 19) {
            System.out.println("pack");
        } else if (quantity >= 20 && quantity <= 49) {
            System.out.println("lots");
        } else if (quantity >= 50 && quantity <= 99) {
            System.out.println("horde");
        } else if (quantity >= 100 && quantity <= 249) {
            System.out.println("throng");
        } else if (quantity >= 250 && quantity <= 499) {
            System.out.println("swarm");
        } else if (quantity >= 500 && quantity <= 999) {
            System.out.println("zounds");
        } else if (quantity >= 1000) {
            System.out.println("legion");
        }
        System.out.flush();
    }
}