package timus.task_2100;

import java.io.*;

public class task_2100 {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_2100/2100input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshalAndLily = 2;
        try {
            BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) :
                    new BufferedReader(new FileReader(inputFileName));
            String readLine;
            int numberFriends = 0;
            int numberPairs = 0;

            while ((readLine = bufferedReader.readLine()) != null){
                if (numberFriends == 0){
                    numberFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")){
                    numberPairs++;
                }
            }
            int result;
            int guest = (marshalAndLily + numberFriends + numberPairs);
            if (guest == 13){
                result = guest * 100 + 100;
            } else {
                result = guest * 100;
            }
            System.out.println(result);
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
