package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WTusingfepndfesm {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		for(WebElement r:rows)
		{
			System.out.println("||"+ r.getText()+"||");
			System.out.println();
		}
	
		
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}
