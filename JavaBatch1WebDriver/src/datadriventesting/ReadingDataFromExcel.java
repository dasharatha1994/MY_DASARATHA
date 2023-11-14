package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream("C:\\Users\\hp\\Desktop\\data.xlsx"));
		XSSFSheet sh=wb.getSheet("Sheet1");	
		int rowcount=sh.getLastRowNum();
		int colcount=sh.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sh.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.print("  "  +value);
			}
          System.out.println();		
                 }
			}
				

	}


