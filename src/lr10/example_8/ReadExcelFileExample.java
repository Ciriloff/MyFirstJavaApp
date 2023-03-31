package lr10.example_8;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        //открываем файл Excel для чтения
        String filePath = "src/lr10/example_7/examplexcel.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);
        //создаем экземпляр книги Excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        //получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");
        //перебираем строки и ячейки листа
        for (Row row : sheet) {
            for (Cell cell : row) {
                //выводим значение ячейки на экран
                System.out.print(cell.toString() + "\t\t\t\t");
            }
            System.out.println();
        }
        //закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();
    }
}
