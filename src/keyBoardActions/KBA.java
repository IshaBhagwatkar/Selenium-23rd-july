package keyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KBA {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
			
		WebElement firstname = driver.findElement(By.name("firstname"));	
	//	act.moveToElement(FN).sendKeys("ISHA").build().perform();
		
		act.moveToElement(firstname).keyDown(Keys.SHIFT).sendKeys("I").keyUp(Keys.SHIFT).sendKeys("sha").build().perform();
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));	
		act.click(month).perform();
		for(int i=0;i<=3;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement day = driver.findElement(By.id("day"));	
		act.click(day).perform();
		for(int i=0;i<=13;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		WebElement year = driver.findElement(By.id("year"));	
		act.click(year).perform();
		for(int i=0;i<=21;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
	}

}
