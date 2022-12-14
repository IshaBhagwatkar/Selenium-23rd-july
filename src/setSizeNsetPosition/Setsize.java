package setSizeNsetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println("Default size is "+defaultSize);
		
		Dimension d=new Dimension(400,800);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		
		Dimension d1=new Dimension(1500,900);
		driver.manage().window().setSize(d1);
		Thread.sleep(1000);
		
		Setsize sp=new Setsize();
		sp.position();
		
		
	}
	
		public void position() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver_win32 (1)\\chromedriver.exe\\" );
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);
			
			Point defaultPosition = driver.manage().window().getPosition();
			System.out.println("Default position is "+defaultPosition);
			
			
			
			Point p=new Point(190,10);
			Thread.sleep(1000);
			driver.manage().window().setPosition(p);
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}


