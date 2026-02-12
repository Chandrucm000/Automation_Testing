package utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static Object[][] getTestData(String sheetName) {

        Object[][] data = null;

        try {
            File file = new File(
                System.getProperty("user.dir") +
                "/src/test/resources/TestData/FormData.xlsx"
            );

            FileInputStream fis = new FileInputStream(file);
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sheet = wb.getSheet(sheetName);
            
            if (sheet == null) 
            {
                throw new RuntimeException("❌ Sheet not found: " + sheetName);
            }
            
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getLastCellNum();

            data = new Object[rowCount - 1][colCount];
            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i < rowCount; i++) {
                for (int j = 0; j < colCount; j++) {
                	data[i - 1][j] =formatter.formatCellValue(sheet.getRow(i).getCell(j));
                }
            }

            wb.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

}
