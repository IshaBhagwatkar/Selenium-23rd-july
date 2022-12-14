package upStoxPOMUsingExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sreenshot_topic.ScreenShotCM;
import upStoxusingExcelSheet.ScrollingCommonMethod;

public class UpstoxHomePage
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userID;
	@FindBy(id="funds") private WebElement fundsButton;
	@FindBy(xpath="//div[text()='Logout']") private WebElement logoutButton;
	
	public UpstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserID(WebDriver driver, String expID) throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		ScrollingCommonMethod.scrollIntoView(driver, userID);
		
		String actualID = userID.getText();
		String expectedUserID=expID;
		
		
		
		ScreenShotCM.takeScreenshot(driver, actualID);
		
		
		if(actualID.equals(expectedUserID))
		{
			System.out.println("Actual and Expected usernames are matching,TC passed");
		}
		else
		{
			System.out.println("Actual and Expected usernames are not matching,TC failed");
		}
	}
		public void clickOnFundsButton(WebDriver driver) throws InterruptedException
		{
		Thread.sleep(1000);
		ScrollingCommonMethod.scrollIntoView(driver, fundsButton);
		fundsButton.click();
		Thread.sleep(1000);
		}
		
		
		public void logoutFromApplication(WebDriver driver) throws InterruptedException
		
		{
			Thread.sleep(1000);
			ScrollingCommonMethod.scrollIntoView(driver,userID);
			userID.click();
			Thread.sleep(500);
			logoutButton.click();
			
		}
		
	//	public String getactualID(WebDriver driver)
	//	{
	//		String actualID=userID.getText();
	//		GeneralMethods.scrollIntoView(driver,userID);
	//		return actualID;
	//	}
		
		
		

}
