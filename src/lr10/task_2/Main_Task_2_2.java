package lr10.task_2;

import java.util.Scanner;

public class Main_Task_2_2 {
    public static void main(String[] args) throws java.io.IOException {
        String filename = "src/lr10/task_2_2/example.json";
        CreateNewJSONfile_Task_2_2.createNewFile2(filename); //создаем JSON-файл как в примере #3
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете пункт меню:" + "\n" + "1. отобразить"
                + "\n" + "2. дополнить" + "\n" + "3. поиск по файлу и удаление" + "\n" + "4. exit" + "\n");
        boolean exit = false;
        while (!exit) {//активация действия в зависимости от выбора
            programMenu();//вызов метода с запросом выбора
            int menuinput = sc.nextInt();
            if (menuinput == 1) {
                JSONParser_Task_2_2.getJsonFile2(filename); //считываем обновленный JSON-файл и отображаем в консоле
            } else if (menuinput == 2) {
                AddNewJSONfile_Task_2_2.addNewFile2(filename); // добавляем новый элемент в JSON-файл
            } else if (menuinput == 3) {
                SearchJSONfile_Task_2_2.searchJSONeLement2(filename); //включаем функцию поиска и удаления
            } else if (menuinput == 4) {
                exit = true;
            }
        }
    }
    public static void programMenu() {//запрос выбранного пункта меню
        System.out.print("Ваш выбор: ");
    }
}
