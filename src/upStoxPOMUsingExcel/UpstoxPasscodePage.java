package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscodePage 
{
@FindBy(name="yob") private WebElement  passcodeField;
	
	public UpstoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPasscode(String pass)
	{
		passcodeField.sendKeys(pass);
	}

}
