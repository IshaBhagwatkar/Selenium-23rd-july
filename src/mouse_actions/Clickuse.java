package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickuse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//1.Identify an element and store in ref. variable
		WebElement homepagebutton = driver.findElement(By.xpath("//a[text()='HOME ']"));
		
		//2.create an object of actions class and pass driver as object
		Actions act=new Actions(driver);
		
		//3.take actions
		
		
		//1st way:-
		
		//act.moveToElement(homepagebutton).perform();
		//act.click().perform();
		
		//2nd way:-
		act.moveToElement(homepagebutton).click().build().perform();
		
		// 3rd way
		//act.click(homepagebutton).perform();
		
		
		
		
		

	}

}
