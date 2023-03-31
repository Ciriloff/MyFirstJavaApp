package lr10.task_2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class CreateNewJSONfile_Task_2_2 {
    public static void createNewFile2(String filename){
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", "1869");

        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булгаков");
        book2.put("year", "1967");

        books.add(book1);
        books.add(book2);

        library.put("books",books);
        //записываем новый объект в файл
        try (FileWriter file = new FileWriter(filename)){
            file.write(library.toJSONString());
            System.out.println("Json-файл успешно создан! ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
