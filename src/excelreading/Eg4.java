package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Book2.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//Dynamic for loop
		
		int LastRowNum = mySheet.getLastRowNum();
		int TotalNumOfRows=LastRowNum;
		System.out.println("Total no. of rows are "+TotalNumOfRows);
		
			short LastCellNum = mySheet.getRow(0).getLastCellNum();
		System.out.println("Last Cell number is "+LastCellNum);
			
			int totalNumOfCells = LastCellNum-1;
			System.out.println("Total cells are "+totalNumOfCells);
			
			for(int i=0;i<=TotalNumOfRows;i++)
			{
				for(int j=0;j<=totalNumOfCells;j++)
					
				{
					String Value = mySheet.getRow(i).getCell(j).getStringCellValue();
					
					System.out.print(Value+" ");
					
				}
				System.out.println();
			}
			
			
			
			
	}

}
