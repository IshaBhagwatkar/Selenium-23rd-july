package iframe_nested;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		
		WebElement mainPageElement = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		System.out.println(mainPageElement.getText());
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		 String parentText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		 System.out.println("parent Text is "+parentText);
		 Thread.sleep(1000);
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		 Thread.sleep(1000);
		
	String childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		
		System.out.println("child text is "+childtext);
		
		driver.switchTo().defaultContent();
		
		System.out.println(mainPageElement.getText());
		
		
		
		
		
		
		
		
		
		
		
	}

}
