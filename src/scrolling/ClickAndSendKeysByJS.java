package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSendKeysByJS {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement button = driver.findElement(By.id("nav-search-submit-button"));

		JavascriptExecutor	js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='mobile'", search);
		
		js.executeScript("arguments[0].click()", button);
		
		
		
	}

}
