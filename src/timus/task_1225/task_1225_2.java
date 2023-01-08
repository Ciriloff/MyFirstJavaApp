package timus.task_1225;

import java.util.Scanner;

public class task_1225_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stripe = in.nextInt();
        long[] nums = new long[stripe];
        nums[0] = 2;
        for (int i = 1; i < nums.length; i++){
            if (i == 1){
                nums[1] = 2;
            } else {
            nums[i] = nums[i-2] + nums[i-1];
            }
        }
        System.out.println(nums[stripe-1]);
    }
}