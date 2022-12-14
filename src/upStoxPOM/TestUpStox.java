package upStoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpStox {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//create an object UpStoxLoginPage of  class
		
		UpStoxLoginPage login= new UpStoxLoginPage(driver);
		login.enterUserID();
		login.enterPassword();
		login.clickOnSignInButton();
		
		//create an object UpstoxPasscodePage of  class
		
		Thread.sleep(4000);
		UpStoxPasscodePage passcode = new UpStoxPasscodePage(driver);
		passcode.enterPasscode();
		
		//create an object UpstoxWelcomePage of  class
		
		Thread.sleep(9000);
		UpstoxWelcomePage welcome = new UpstoxWelcomePage(driver);
		welcome.clickOnnoIAmGoodButton();
		
		//create an object UpstoxHomePage of  class
		
		Thread.sleep(3000);
		
		UpStoxHomePage home = new UpStoxHomePage(driver);
		home.validateUserID(driver);
		home.clickOnFundsButton();
		
		//create an object UpstoxFundsPage of  class
		
		Thread.sleep(1000);
		UpStoxFundsPage funds = new UpStoxFundsPage(driver);
		funds.checkAvailableFunds();
		home.logoutFromApplication();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
