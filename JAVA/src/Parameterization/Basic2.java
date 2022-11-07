package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic2 {
	public static void main(String[] args) throws IOException {
	       FileInputStream file = new FileInputStream("C:\\Users\\amolb\\OneDrive\\Selenium\\Parameterization.xlsx");
	       String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	       System.out.println(data);
	
	
	}

}
