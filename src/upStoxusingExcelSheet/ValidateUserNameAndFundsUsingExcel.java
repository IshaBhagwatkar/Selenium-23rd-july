package upStoxusingExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserNameAndFundsUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//read data from excel
		
		File myFile=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Upstox.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		String un = mySheet.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.name("userId")).sendKeys(un);  //sending userID
		
		driver.findElement(By.name("password")).sendKeys(mySheet.getRow(0).getCell(1).getStringCellValue()); //sending password
		
		driver.findElement(By.id("submit-btn")).click(); //click on signIn button
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("yob")).sendKeys( mySheet.getRow(0).getCell(2).getStringCellValue()); //nevigating to passcode page
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click(); //Click on cancel trip(no, Im good)
		
		Thread.sleep(3000); //navigating to home page
		
		String expectedUN="Nikhil S.";  //validate userName
		
		WebElement userNamefield = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
		
		//Scrolling into view
		Thread.sleep(1000);
		
		ScrollingCommonMethod.scrollIntoView(driver,userNamefield);
		Thread.sleep(1000);
		String actualUN=userNamefield.getText();
		if(expectedUN.equals(actualUN))
		{
			System.out.println("Actual and Expected usernames are matching,TC passed");
		}
		else
		{
			System.out.println("Actual and Expected usernames are not matching,TC failed");
		}
		
		//clicking on funds button
		
		driver.findElement(By.id("funds")).click();
		Thread.sleep(1000);
		String funds = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
		System.out.println("Funds available to trade is "+funds);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
