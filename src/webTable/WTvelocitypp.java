package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WTvelocitypp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		for(int i=1;i<=3;i++)
		{
			WebElement data1 = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th[" +i+ "]"));
			System.out.println(data1.getText());
		}
		
		System.out.println("==========row no. 4|||||====================================");
		
		for(int i=1;i<=3;i++)
		{
			  
			System.out.print(driver.findElement(By.xpath("//table[@id='product']//tr[4]/td[" +i+ "]")).getText()+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		//WebElement data = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th[1]"));
		//System.out.println(data.getText());
		
		
		
		
	}

}
