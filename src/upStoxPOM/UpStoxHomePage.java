package upStoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sreenshot_topic.ScreenShotCM;
import upStoxusingExcelSheet.ScrollingCommonMethod;

public class UpStoxHomePage 
{
	
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userID;
	@FindBy(id="funds") private WebElement fundsButton;
	@FindBy(xpath="//div[text()='Logout']") private WebElement logoutButton;
	
	public UpStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserID(WebDriver driver) throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		ScrollingCommonMethod.scrollIntoView(driver, userID);
		
		String actualID = userID.getText();
		String expectedUserID="nikhil s.";
		
		
		
		ScreenShotCM.takeScreenshot(driver, "actualuserID "+actualID);
		
		
		if(expectedUserID.equalsIgnoreCase(actualID))
		{
			System.out.println("Actual and Expected usernames are matching,TC passed");
		}
		else
		{
			System.out.println("Actual and Expected usernames are not matching,TC failed");
		}
	}
		public void clickOnFundsButton()
		{
		 fundsButton.click();
		}
		
		
		public void logoutFromApplication() throws InterruptedException
		
		{
			userID.click();
			Thread.sleep(500);
			logoutButton.click();
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


