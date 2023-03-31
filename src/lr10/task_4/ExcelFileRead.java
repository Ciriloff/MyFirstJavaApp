package lr10.task_4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelFileRead {
    public static void main(String[] args) throws IOException {
        try {
            //открываем файл Excel для чтения
            String filePath = "E:/МОИ_ДОКУМЕНТЫ/Полезная Информация/ФАКТ/Учебмат/Програм-е/II семестр/Excel_Task4.xlsx";
            FileInputStream inputStream = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream); //создаем экземпляр книги Excel из файла
            XSSFSheet sheet = workbook.getSheetAt(0); //получаем лист из книги по его индексу
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()){
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()){
                        case NUMERIC -> {
                            System.out.printf("%.0f\t", cell.getNumericCellValue());
                        }
                        case STRING -> {
                            System.out.print(cell.getStringCellValue() + "\t");
                        }
                    }
                }
                System.out.println();
            }
            //закрываем файл и освобождаем ресурсы
            workbook.close();
            inputStream.close();
        }catch (Exception e){
            System.out.println("Что-то пошло не так: " + e);
        }
    }
}
