package lr10.task_2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JSONParser_Task_2_2 {
    public static void getJsonFile2(String filename){
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(filename));
            JSONObject jsonObject = (JSONObject) obj;
            //System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            //отображаем в консоле считанный объект
            for (Object o : jsonArray){
                JSONObject book = (JSONObject) o;
                System.out.println("");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
