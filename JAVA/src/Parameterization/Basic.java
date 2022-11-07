package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\amolb\\OneDrive\\Selenium\\Parameterization\\Book1.xlsx");
		boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
	    System.out.println(data);
	
	}

}
