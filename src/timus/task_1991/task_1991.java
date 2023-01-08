package timus.task_1991;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_1991 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1991/1991input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) :
                new BufferedReader(new FileReader(inputFileName));

        String[] strings1 = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(strings1[0]);
        int k = Integer.parseInt(strings1[1]);
        String[] strings2 = bufferedReader.readLine().split(" ");
        int droid = 0;
        int bomb = 0;
        for (int i = 0; i < strings2.length; i++){
            if (k > Integer.parseInt(strings2[i])){
                droid = droid + (k - Integer.parseInt(strings2[i]));
            } else {
                bomb = bomb + (Integer.parseInt(strings2[i]) - k);
            }
        }
        System.out.print(bomb + " " + droid);
    }
}
