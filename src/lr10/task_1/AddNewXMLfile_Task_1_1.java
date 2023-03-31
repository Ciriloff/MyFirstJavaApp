package lr10.task_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class AddNewXMLfile_Task_1_1 {
    public static void addElement(String filename, String newfilename) {
        //меняем существующий файл
        File xmlFile = new File(filename);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            //Добавление ещё одной книги в существующий XML-файл
            Scanner newb = new Scanner(System.in);
            System.out.print("Введите наименование новой книги: ");
            String title = newb.nextLine();
            System.out.print("Введите автора новой книги: ");
            String author = newb.nextLine();
            System.out.print("Введите год выпуска новой книги: ");
            String year = newb.nextLine();

            NodeList library = doc.getElementsByTagName("library");
            Element lang = null;
            for(int i=0; i<library.getLength(); i++) {
            lang = (Element) library.item(i);

            Element book3 = doc.createElement("book");
            lang.appendChild(book3);

            Element title3 = doc.createElement("title");
            title3.appendChild(doc.createTextNode(title));
            book3.appendChild(title3);

            Element author3 = doc.createElement("author");
            author3.appendChild(doc.createTextNode(author));
            book3.appendChild(author3);

            Element year3 = doc.createElement("year");
            year3.appendChild(doc.createTextNode(year));
            book3.appendChild(year3);
            }
            // запишем дополненный документ в файл или выведем в консоль
            doc.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(newfilename));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("XML-файл успешно изменен!" + "\n");
            XMLParser_Task_1_1.getFile(newfilename); //считываем дополненный XML-файл и отображаем в консоле

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
