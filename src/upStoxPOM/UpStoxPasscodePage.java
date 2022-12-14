package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage 
{
	@FindBy(name="yob") private WebElement  passcodeField;
	
	public UpStoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPasscode()
	{
		passcodeField.sendKeys("1993");
	}
	
}
