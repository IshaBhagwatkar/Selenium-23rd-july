package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignLogin 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement MobileNumField;
	@FindBy(xpath="//a[@id='lnk_signup1']")private WebElement SignInButton;
	
	public NeoStoxSignLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void sendMobNum(WebDriver driver, String MobNum)
	{
		MobileNumField.sendKeys(MobNum);
	}
	
	public void  clickOnSignInButton(WebDriver driver)
	{
		SignInButton.click();
	}
	
	
	
	
	
	
	
	
	
}
