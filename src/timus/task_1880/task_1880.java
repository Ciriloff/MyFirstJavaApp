package timus.task_1880;

import java.io.*;
import java.util.Arrays;

public class task_1880 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1880/1880input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) :
                new BufferedReader(new FileReader(inputFileName));
        int numbers1 = Integer.parseInt(bufferedReader.readLine());
        String[] strings1 = bufferedReader.readLine().split(" ");

        int numbers2 = Integer.parseInt(bufferedReader.readLine());
        String[] strings2 = bufferedReader.readLine().split(" ");

        int numbers3 = Integer.parseInt(bufferedReader.readLine());
        String[] strings3 = bufferedReader.readLine().split(" ");

        int size = numbers1 + numbers2 + numbers3;
        String[] allstrings = new String[size];
        for (int i = 0, j = 0, k = 0; i < size; i++){
            if (i < numbers1){
                allstrings[i] = strings1[i];
                continue;
            }
            if (i < (numbers1 + numbers2)){
                allstrings[i] = strings2[j];
                j++;
                continue;
            }
            allstrings[i] = strings3[k];
            k++;
        }
        Arrays.sort(allstrings);
        int count = 0;
        for (int i = 1; i < allstrings.length - 1; i++){
            if (allstrings[i - 1].equals(allstrings[i]) && allstrings[i].equals(allstrings[i + 1])){
                count++;
            }
        }
        System.out.println(count);
    }
}
