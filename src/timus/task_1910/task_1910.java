package timus.task_1910;

import java.io.*;
import java.util.Arrays;

public class task_1910 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1910/1910input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) :
                new BufferedReader(new FileReader(inputFileName));
        PrintWriter out = new PrintWriter(System.out);
        int quant = Integer.parseInt(bufferedReader.readLine());
        String[] power = bufferedReader.readLine().split(" ");
        int[] sum = new int[quant - 2];
        for (int i = 0; i < sum.length; i++){
            sum[i] = Integer.parseInt(power[i]) + Integer.parseInt(power[i+1]) + Integer.parseInt(power[i+2]);
        }
        int[] sumTwo = Arrays.copyOf(sum, sum.length);
        Arrays.sort(sum);
        int oneValue = sum[sum.length - 1];
        for (int i = 0; i < sum.length; i++){
            if (sumTwo[i] == oneValue) {
                out.println(oneValue + " " + (i + 2));
                break;
            }
        }
        out.flush();
    }
}
