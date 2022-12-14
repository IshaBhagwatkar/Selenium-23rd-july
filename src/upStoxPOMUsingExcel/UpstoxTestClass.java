package upStoxPOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//reading data from excel
		
		File myFile=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Upstox.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//create an object of login page
		
		UpstoxLoginPage login = new UpstoxLoginPage(driver);
		login.enterUserID(mySheet.getRow(0).getCell(0).getStringCellValue());
	
		String pwd1 = mySheet.getRow(0).getCell(1).getStringCellValue();
		login.enterPassword(pwd1);
		login.clickOnSignInButton();
		
		//create an object of passcode page
		
		Thread.sleep(3000);
		UpstoxPasscodePage passcode=new UpstoxPasscodePage(driver);
		passcode.enterPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
		
		//create an object of welcome page
	
		Thread.sleep(8000);
		UpstoxWelcomePage welcome=new UpstoxWelcomePage(driver);
		welcome.clickOnnoIAmGoodButton();
		
		//create an object of home  page
		Thread.sleep(1000);
		UpstoxHomePage home = new UpstoxHomePage(driver);
		home.validateUserID(driver,mySheet.getRow(0).getCell(3).getStringCellValue());
		home.clickOnFundsButton(driver);
		
		//create an object of funds  page
		
		UpstoxFundsPage funds=new UpstoxFundsPage(driver);
		funds.checkAvailableFunds();
		home.logoutFromApplication(driver);
		driver.close();
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
