package dyanamicwebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Laptop");
		Thread.sleep(1000);
		
		 List<WebElement> items = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		
		 
		 for(WebElement i:items)
			{
				System.out.println(i.getText());
			}
		 
		 System.out.println("====================================================");
		 
		 
		 
		 for(int i=0;i<=items.size()-1;i++)
		 {
			 System.out.println(items.get(i).getText());
			 
			 String expected="laptop games";
			 String actual=items.get(i).getText();
			 
			 if(expected.equals(actual))
			 {
				 items.get(i).click();
				 break;
				 
			 }
			 
			 
		 }
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(500);
		List<WebElement> Totalimgs = driver.findElements(By.tagName("img"));
		System.out.println(Totalimgs.size());
		Thread.sleep(500);driver.close();
		
	}

}
