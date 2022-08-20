package testing;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {
    public static WebDriver driver;

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrobj = getExcelSheetData("C:\\Users\\priyanka\\Desktop\\Data provider example.xlsx", "testData");
        return arrobj;
    }

    public String[][] getExcelSheetData(String fileName, String sheetName) throws IOException {
        String[][] data = null;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sh = wb.getSheet(sheetName);
        XSSFRow row = sh.getRow(0);
        int noOfRows = sh.getPhysicalNumberOfRows();
        int noOfColumns = row.getLastCellNum();
        Cell cell;
        data = new String[noOfRows - 1][noOfColumns];

        for (int i = 1; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                row = sh.getRow(i);
                cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
}
