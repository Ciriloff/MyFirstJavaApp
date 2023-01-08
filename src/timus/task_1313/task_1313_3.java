package timus.task_1313;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task_1313_3 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1313/1313input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) :
                new BufferedReader(new FileReader(inputFileName));

        int quant = Integer.parseInt(bufferedReader.readLine());
        int[][] arr = new int[quant][quant];
        String line;
        int row = 0;
        while ((line = bufferedReader.readLine()) != null){
            Scanner in = new Scanner(line);
            for (int i = 0; i < quant && in.hasNextInt(); i++){
                arr[row][i] = in.nextInt();
            }
            row++;
        }
        for (int i = 0; i < quant; i++){
            for (int j = 0; j < quant; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}

