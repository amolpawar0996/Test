package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Row_Cell_size {//print cell and row size 
	public static void main(String[] args) throws IOException  {
		FileInputStream file = new FileInputStream("C:\\Users\\amolb\\OneDrive\\Selenium\\Parameterization\\Book1.xlsx");
		int lastRowNum = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
		System.out.println(lastRowNum + 1);
			
			
			
//		FileInputStream file = new FileInputStream("C:\\Users\\amolb\\OneDrive\\Selenium\\Parameterization\\Book1.xlsx");
//		int lastCellNum = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getLastCellNum();
//		System.out.println(lastCellNum);
		}
	}
		
	//row give the index to find size  we have to add 1 in row
	//row start from 0
	//cell is start from 1


