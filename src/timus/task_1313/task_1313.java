package timus.task_1313;

import java.io.*;

public class task_1313 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1313/1313input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) :
                new BufferedReader(new FileReader(inputFileName));

        int quant = Integer.parseInt(bufferedReader.readLine());
        String[] split = bufferedReader.readLine().trim().split(" +");
        int[][] arrays = new int[split.length][split.length];
        String line;
        while ((line = bufferedReader.readLine()) != null){
            for (int i = 0; i < split.length; i++){
                String[] split2 = bufferedReader.readLine().trim().split(" +");
                for (int j = 0; j < split.length; j++){
                    arrays[i][j] = Integer.parseInt(split2[j]);
                }
            }
        }
    }
}

