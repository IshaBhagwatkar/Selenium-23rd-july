package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysmethod {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ISHA");
		
//		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@id='email']")).clear();
		
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ISHA");
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("BHAGWATKAR");
		
		
		WebElement userID = driver.findElement(By.xpath("//input[@id='email']"));
            userID.sendKeys("ISHA");
        	Thread.sleep(2000);
            userID.clear();
            Thread.sleep(2000);
            userID.sendKeys("ISHA BHAGWATKAR");
            
            
            
            
            
            
            
            
            
		


	}

}
