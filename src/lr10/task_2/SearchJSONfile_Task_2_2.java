package lr10.task_2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class SearchJSONfile_Task_2_2 {
    public static void searchJSONeLement2(String filename){
        try {
            Scanner tv = new Scanner(System.in);
            System.out.print("Параметр для поиска: ");
            String title = tv.next(); //если использовать nextline, то не работает
            System.out.println();

            JSONObject library = new JSONObject();
            JSONParser parser = new JSONParser();
            Object object = parser.parse(new FileReader(filename));
            JSONObject jsonObject = (JSONObject) object;
            JSONArray books = (JSONArray) jsonObject.get("books");

            Iterator iterator = books.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (!title.equals(book.get("title")) && !title.equals(book.get("author"))
                        && !title.equals(book.get("year"))) {
                } else {
                    System.out.println("Книга - " + book.get("title")
                            + "; Автор - " + book.get("author") + "; Год - " + book.get("year"));
                    System.out.print("Удалить найденную книгу? Y/N: ");
                    String ans = tv.next();
                    if(ans.equals("Y")){
                        iterator.remove();
                    } else {
                        System.out.println("Как хотите.");
                    }
                }
            }
            library.put("books", books); //записываем оставшиеся книги в объект
            //переписываем полученный объект в исходный файл
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
