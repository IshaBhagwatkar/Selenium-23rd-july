package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Book1.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//how to read whole row
		for(int i=0;i<=3;i++)
		{
		String myValue = mySheet.getRow(0).getCell(i).getStringCellValue();
		
		System.out.print(myValue+" ");
		}
		System.out.println();
		
		System.out.println("========================================================");
		
		//how to read whole column
		
		for(int i=0;i<=4;i++)
		
		{
			String myValue = mySheet.getRow(i).getCell(2).getStringCellValue();
			
			System.out.println(myValue);
		}
			
		System.out.println("==============================================================");
		//how to read complete excel sheet
		
		//Static For Loop
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=3;j++)
			{
			
			String myValue = mySheet.getRow(i).getCell(j).getStringCellValue();
			
			System.out.print(myValue+" ");
				
		}
		System.out.println();
				
				
				
				
				
		}
		
		


		
		
		
	}


}
