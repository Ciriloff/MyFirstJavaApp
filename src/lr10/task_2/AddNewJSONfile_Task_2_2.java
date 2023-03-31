package lr10.task_2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AddNewJSONfile_Task_2_2 {
    public static void addNewFile2(String filename){
        try {
            JSONObject library = new JSONObject();
            JSONParser parser = new JSONParser();
            Object object = parser.parse(new FileReader(filename));
            JSONObject jsonObject = (JSONObject) object;
            //System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray books = (JSONArray) jsonObject.get("books");
            //добавляем новую книгу
            Scanner newbk = new Scanner(System.in);
            System.out.print("Введите наименование новой книги: ");
            String title = newbk.next();
            System.out.print("Введите автора новой книги: ");
            String author = newbk.next();
            System.out.print("Введите год выпуска новой книги: ");
            String year = newbk.next();

            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            books.add(newBook);
            library.put("books", books);
            //записываем дополненный объект в файл
            try (FileWriter file = new FileWriter(filename)){
                file.write(library.toJSONString());
                System.out.println("Json-файл успешно переписан! ");
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
