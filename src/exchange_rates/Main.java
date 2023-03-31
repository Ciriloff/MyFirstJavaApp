package exchange_rates;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Document doc;
        try {
            doc = Jsoup.connect("http://www.finmarket.ru/currency/rates/").get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(doc.title());
        Elements tpostValue = doc.getElementsByAttributeValue("class", "fs11");
        for (Element element : tpostValue) {
            System.out.println(element.attr(" ") + " ; " + element.attr("hrev"));
        }
    }
}
