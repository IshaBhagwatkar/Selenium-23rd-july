package findElementsuse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NOofImages {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\chromedriver_win32\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).click();
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.sendKeys("iphone 14").sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		Thread.sleep(1000);
		
		List<WebElement> imgs = driver.findElements(By.tagName("img"));
		System.out.println("Images present on webpage are "+imgs.size());
		
		
		
		
		
		
		
		
	}

}
