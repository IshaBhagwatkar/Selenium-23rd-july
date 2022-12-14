package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage 
{
	
	@FindBy(name="userId") private WebElement userID;
	@FindBy(name="password") private WebElement password;
	@FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement signInButton;
	
	//initialize using constructor-->uses-->pageFactory class-->(method)-->initElements
	
	public UpstoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//variable Usage using method
	
	public void enterUserID(String un)
	{
	userID.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
	password.sendKeys(pwd);
	}
	
	public void clickOnSignInButton()
	{
	signInButton.click();
	}

}
