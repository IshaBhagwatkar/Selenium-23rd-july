package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		File myFile=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Book3.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		int totalNumOfRows=mySheet.getLastRowNum();
		int totalNumOfCells=mySheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
			for(int j=0;j<=totalNumOfCells;j++)
			{
				CellType cellDataType = mySheet.getRow(i).getCell(j).getCellType();
				
				if(cellDataType==CellType.STRING)
				{
					String Value = mySheet.getRow(i).getCell(j).getStringCellValue();			
					System.out.print(Value+" ");
				}
				else if(cellDataType==CellType.NUMERIC)
				{
					 double Value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(Value+" ");
				}
				else if(cellDataType==CellType.BOOLEAN)
				{
					 boolean Value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(Value+" ");
				}
				
				else if(cellDataType==CellType.BLANK)
				{
					
				}
			}
				System.out.println();
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


