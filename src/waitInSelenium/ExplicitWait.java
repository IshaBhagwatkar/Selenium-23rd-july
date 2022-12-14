package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(40000));
		
	//	WebDriverWait w= WebDriverWait(driver,Duration.ofMillis(60000));
		WebElement signInButton = driver.findElement(By.xpath("((//h6[text()='Sign In'])[2])"));
	//	w.until(ExpectedConditions.visibilityOf(signInButton));
		signInButton.click();
	
	
	
	
	
	}

	
	}

