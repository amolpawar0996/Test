package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data {//fetching all data from excel
	public static void main(String[] args) throws IOException {
				
	   for(int i=0;i<=3;i++) {//row
		    for(int j=0;j<=3;j++) {//cell
				
		    FileInputStream file = new FileInputStream("C:\\Users\\amolb\\OneDrive\\Selenium\\Parameterization\\Book1.xlsx");
   	        String info = WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
	        System.out.print(info+" ");	
	        }
		System.out.println();
		}
	}
}


