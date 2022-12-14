package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WholeWTusingforloop {

	

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		// outer for loop for rows----> 1-11
		for(int i=1;i<=11;i++)
		{
			{
				for(int j=1;j<=3;j++)
				{
					if(i==1)
					{
					String	value=driver.findElement(By.xpath("//table[@id='product']//tr[" +i+ "]/th[" +j+ "]")).getText();
						System.out.print(value+ " || ");
					}
					else
					{
						String	value=driver.findElement(By.xpath("//table[@id='product']//tr[" +i+ "]/td[" +j+ "]")).getText();
						System.out.print(value+ " || ");
					}
					
					System.out.println();
					
					
					
					
					
					
					
					
					
					
					
					
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
