package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifrm2 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement myelement = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
		myelement.getText();
		System.out.println(myelement.getText());
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframe-name");
		WebElement frameElement=driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class')]"));
		frameElement.getText();
		System.out.println(frameElement.getText());
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		WebElement AD = driver.findElement(By.xpath("//legend[text()='Auto Suggestive Dropdown Example']"));
		AD.getText();
		System.out.println(AD.getText());
	}

}
