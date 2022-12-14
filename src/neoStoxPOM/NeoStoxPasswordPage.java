package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxPasswordPage 
{
	
	@FindBy(id="txt_accesspin")private WebElement PasswordField;
	@FindBy(xpath="//a[text()='Submit']")private WebElement SubmitButton;
	
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendPassword(WebDriver driver, String Pass)
	{
		Utility.wait(driver, 1000);
		PasswordField.sendKeys(Pass);
		Reporter.log("sending password", true);
	}
	public void clickOnSubmitButton(WebDriver driver)
	{
	Utility.wait(driver, 1000);
	SubmitButton.click();
	Reporter.log("Clicking on submit button", true);
	}

	

}
