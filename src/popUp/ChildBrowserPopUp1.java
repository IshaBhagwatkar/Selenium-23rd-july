package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChildBrowserPopUp1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Start Selenium Practice']")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();//getting set of all window id
		for(String a:allWindowId)
		{
			System.out.println(a);//printing all window id
		}
		
		Iterator<String> it = allWindowId.iterator();
		String mainWindowID = it.next();
		String childWindowId = it.next();
		
		Thread.sleep(1000);
		driver.switchTo().window(childWindowId);

		Thread.sleep(5000);
		WebElement DD = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(DD);
		Thread.sleep(5000);
		s.selectByValue("option2");
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(1000);
		driver.switchTo().window(mainWindowID);
		
		 String mainPageText = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']")).getText();
		System.out.println(mainPageText);
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
