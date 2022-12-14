package dropdowneg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select s=new Select(cars);
		System.out.println(s.isMultiple());
		
		s.selectByVisibleText("Opel");
		Thread.sleep(1000);
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		
		s.selectByValue("saab");
	
		System.out.println("1st selection is done of "+s.getFirstSelectedOption().getText());
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		
		for(WebElement o:options)
		{
			System.out.println(o.getText());
		}
		
		
		
		
		
		
		
		
		

	}

}
