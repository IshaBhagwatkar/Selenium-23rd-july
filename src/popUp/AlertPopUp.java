package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp 
{

		public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		
		driver.findElement(By.id("alertButton")).click();
		Alert alt = driver.switchTo().alert();
		
		System.out.println("Alert text is---> "+alt.getText());
		
		alt.accept();
		
		Thread.sleep(1000);
		
		String myText = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		System.out.println(myText);
	
		
		
		
		
		

	}

}
