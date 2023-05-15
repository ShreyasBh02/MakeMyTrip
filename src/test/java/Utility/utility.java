package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility {

	public static String getTD(int rowI, int colI) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\java\\velo\\MMT-data.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data=sh.getRow(rowI).getCell(colI).getStringCellValue();
		return data;
	}
}
