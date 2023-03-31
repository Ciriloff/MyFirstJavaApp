package lr10.task_1;

import java.util.Scanner;

public class Main_Task_1_1 {
    public static void main(String[] args) {
        String filename = "src/lr10/task_1/newexample.xml";
        String newfilename = "src/lr10/task_1/newexample_2.xml";
        CreateNewXMLfile_Task_1_1.createNewFile(filename); //создаем XML-файл как в примере #1
        XMLParser_Task_1_1.getFile(filename); //считываем созданный XML-файл и отображаем в консоле

        Scanner vvod = new Scanner(System.in);
        System.out.print("Будем дополнять файл? Y/N: ");
        String answer = vvod.next();

        if(answer.equals("Y")){
            AddNewXMLfile_Task_1_1.addElement(filename, newfilename); // добавляем новый элемент в XML-файл
            SearchXMLfile_Task_1_1.searchElement(newfilename); //включаем функцию поиска и удаления
            XMLParser_Task_1_1.getFile(newfilename); //считываем обновленный XML-файл и отображаем в консоле
        } else {
            System.out.println("Как хотите.");
        }
    }
}
