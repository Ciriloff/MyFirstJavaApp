package lr10.task_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
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

import static org.w3c.dom.Node.ELEMENT_NODE;

public class SearchXMLfile_Task_1_1 {
    public static void searchElement(String newfilename){
        Scanner yoy = new Scanner(System.in);
        System.out.print("Параметр для поиска: ");
        String tekst = yoy.nextLine();
        System.out.println();

        File xmlFile = new File(newfilename);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);
                NodeList nodeList1 = node.getChildNodes(); //находим вложенные элементы узла book
                for (int j = 0; j < nodeList1.getLength(); j++){
                    Node node1 = nodeList1.item(j);
                    if (node1.getNodeType() == ELEMENT_NODE) { //проверяем является ли узел элементом
                        Element element = (Element) node1;
                        //сравниваем значение с консоли с найденым элементом
                        if (tekst.equals(element.getTextContent())){
                            Element element1 = (Element) element.getParentNode(); //находим родителя найденого элемента
                            //печатаем вложенные элементы найденого родителя
                            System.out.println("Название книги: " + element1.getElementsByTagName("title")
                                    .item(0).getTextContent());
                            System.out.println("Автор: " + element1.getElementsByTagName("author")
                                    .item(0).getTextContent());
                            System.out.println("Год издания: " + element1.getElementsByTagName("year")
                                    .item(0).getTextContent());
                            //блок удаления узла book найденного элемента
                            System.out.print("Будем удалять запись? Y/N: ");
                            String otvet = yoy.next();
                            if(otvet.equals("Y")){
                                element1.getParentNode().removeChild(element1);
                            }
                        }
                    }
                }
            }
            // запишем измененный документ в файл
            doc.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(newfilename));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("Обновленный XML-файл успешно записан!" + "\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}