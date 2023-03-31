package lr10.example_7;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException {
        //создаём новую книгу Excel
        XSSFWorkbook workbook = new XSSFWorkbook();
        //создаём новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");
        //записываем данные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("№");
        headerRow.createCell(1).setCellValue("Товар");
        headerRow.createCell(2).setCellValue("Характеристики");
        headerRow.createCell(3).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue(1);
        dataRow1.createCell(1).setCellValue("Книга");
        dataRow1.createCell(2).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        dataRow1.createCell(3).setCellValue(500.0);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue(2);
        dataRow2.createCell(1).setCellValue("Компьютер");
        dataRow2.createCell(2).setCellValue("Процессор: Intel Core i5, Оперативная память: 8 Гб");
        dataRow2.createCell(3).setCellValue(2500.0);

        //записываем книгу Excel в файл
        String filePath = "src/lr10/example_7/examplexcel.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл: " + filePath);
    }
}
