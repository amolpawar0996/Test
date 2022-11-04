package Utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Screenshot {
	public static void capturescreenshot(WebDriver driver, int tcid) throws IOException {

		Date d = new Date();

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy & hh-mm-ss");

		String dt = df.format(d);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\amolb\\OneDrive\\screenshot\\demo" + tcid + " " + dt + ".jpg");

		FileHandler.copy(src, dest);

	}

	public static void paramererization(String sheet, int row, int cell) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\amolb\\OneDrive\\Selenium\\Parameterization\\Book2.xlsx");
		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();

		try {
			data =getStringCellValue();
			
		}
		catch(NullPointerException e) {
			 double value = getNumericCellValue();
			 double
		}
		//return data;
	}

}