package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_is_selected {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		checkBox1.click();                      // this step is imp,otherwise status is false
		boolean result1 = checkBox1.isSelected();
		System.out.println("Checkbox selection status is "+result1);
		
		WebElement checkBox2 = driver.findElement(By.id("checkBoxOption2"));
		checkBox2.click();                      // this step is imp,otherwise status is false
		boolean result2 = checkBox1.isSelected();
		System.out.println("Checkbox selection status is "+result2);
		
		WebElement checkBox3 = driver.findElement(By.id("checkBoxOption3"));
		checkBox3.click();                      // this step is imp,otherwise status is false
		//boolean result3 = checkBox1.isSelected();
		//System.out.println("Checkbox selection status is "+result3);


	}

}
