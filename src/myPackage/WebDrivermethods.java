package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivermethods 
{

	public static void main(String[] args) throws InterruptedException  
	{
		 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.amazon.in/");
			
			//driver.close();
			
			//driver.manage().window().maximize();
			
			//Thread.sleep(3000);
			//driver.manage().window().minimize();
			Thread.sleep(3000);
			driver.navigate().to("https://www.google.com/");
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			String Title=driver.getTitle();
			System.out.println("Title is "+Title);
			
			
			String url=driver.getCurrentUrl();
			System.out.println("url is "+url);
			
		}
		

	}

}
