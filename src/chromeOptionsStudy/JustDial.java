package chromeOptionsStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustDial {

	public static void main(String[] args) throws InterruptedException 
	{
		//create object of chrome-options
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("incognito");
		opt.addArguments("start-maximized");
		opt.addArguments("disable-notifications");
	//	opt.addArguments("headless");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );

		WebDriver driver=new ChromeDriver(opt); // imp step--- pass the object opt as argument
		driver.get("https://www.justdial.com/");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}

}
