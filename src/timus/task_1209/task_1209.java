package timus.task_1209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_1209 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1209/1209input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) :
                new BufferedReader(new FileReader(inputFileName));
        int quant = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < quant; i++){
            double num = Double.parseDouble(bufferedReader.readLine());
            double t;
            t = 8 * (num - 1) + 1;
            int v = (int) Math.sqrt(t);
            if (Math.pow(v,2) == t){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}