package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_is_enable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
	    WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
	//	boolean result1 = getOTPButton.isEnabled();
	//	System.out.println("Get OTP button status is "+result1);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("783526193837");
		Thread.sleep(1000);
		
		boolean result2 = getOTPButton.isEnabled();
		System.out.println("Get OTP button status is "+result2);
		getOTPButton.click();
		
		
		
	

		

	}

}
