package lr10.task_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ParserHTML_Task_3 {
    public static void main(String[] args) {
        try {
            JSONObject library = new JSONObject();
            JSONArray list = new JSONArray();
            JSONObject news = new JSONObject();

            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            Elements newParent = doc.select("body > table > tbody > tr > td > div > table > "
                    + "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td");
            //выводим последние 9 новостей в консоль
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)){
                    List<Node> nodes = newParent.get(0).childNodes();
                    //записываем считанные с сайта новости и даты в новый объект
                    String topic = String.valueOf(((Element) nodes.get(i)).getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0));
                    String data = String.valueOf(((Element) nodes.get(i)).getElementsByClass("blockdate")
                            .get(0).childNodes().get(0));
                    news.put("Новость", topic);
                    news.put("Дата", data);
                    list.add(news);
                    library.put("Список", list);
                }
            }
            //записываем новый объект в JSON-файл
            try (FileWriter file = new FileWriter("src/lr10/task_3/example1.json")){
                file.write(library.toJSONString());
                System.out.println("Json-файл успешно создан! ");
            }catch (Exception e){
                e.printStackTrace();
            }
            //считываем данные из созданного объекта
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/task_3/example1.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("Список");
            //отображаем в консоле считанный объект
            for (Object o : jsonArray){
                JSONObject book = (JSONObject) o;
                System.out.println("");
                System.out.println("Новость: " + book.get("Новость"));
                System.out.println("Дата: " + book.get("Дата"));
            }
        }catch (IOException | ParseException e){
            e.printStackTrace();
        }
    }
}
