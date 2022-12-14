package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class VerifyCheckBoxisSelected {
  @Test
  public void testing() throws InterruptedException
  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 

	 WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
	// checkBox.click();
	//  if(checkBox.isSelected())
	//  {
	//	  Reporter.log("chcekBOx is selected TC is passed", true);
	//  }
	//  else
	//  {
	//	  Reporter.log("chcekBOx is not selected TC is failed", true);
	//  }
	 checkBox.click();
	  Assert.assertTrue(checkBox.isSelected(),"TC is failed when checkbox is not selected");
	  
	  
  }
}
