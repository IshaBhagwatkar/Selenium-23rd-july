package dropdowneg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBsignuppage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		WebElement C = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		C.click();
		Thread.sleep(1000);
		
		WebElement FN = driver.findElement(By.name("firstname"));
        FN.sendKeys("ISHA");
        Thread.sleep(1000);
        
        WebElement LN = driver.findElement(By.name("lastname"));
        LN.sendKeys("BHAGWATKAR");
        Thread.sleep(1000);
        
        WebElement MB= driver.findElement(By.name("reg_email__"));
        MB.sendKeys("7637846897929");
        Thread.sleep(1000);
        
        WebElement PS= driver.findElement(By.id("password_step_input"));
        PS.sendKeys("IB@847");
        Thread.sleep(1000);
        
        WebElement D= driver.findElement(By.name("birthday_day"));
        Select bd = new Select(D);
        bd.selectByValue("13");
        Thread.sleep(1000);
        
        WebElement M= driver.findElement(By.id("month"));
        Select bm = new Select(M);
        bm.selectByVisibleText("Jun");
        Thread.sleep(1000);
        
        WebElement Dy= driver.findElement(By.name("birthday_year"));
        Select y = new Select(Dy);
        y.selectByVisibleText("2000");
        Thread.sleep(1000);
        
        WebElement option= driver.findElement(By.name("sex"));
        option.click();
        Thread.sleep(1000);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
