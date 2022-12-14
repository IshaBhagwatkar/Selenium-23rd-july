package neoStoxTestClasses;

import org.testng.annotations.Test;

import neoStoxBaseClass.Base;
import neoStoxPOM.NeoStoxHomePage;
import neoStoxPOM.NeoStoxPasswordPage;
import neoStoxPOM.NeoStoxSignLogin;
import neoStoxUtility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateNeoStoxUserName extends Base
{
	NeoStoxSignLogin login;
	NeoStoxPasswordPage	Password;
	NeoStoxHomePage home;
	@BeforeClass
	  public void launchNeoStox() 
	{
		launchBrowser();
		login=new NeoStoxSignLogin(driver);
		Password=new NeoStoxPasswordPage(driver);
		home=new NeoStoxHomePage(driver);
	 }
	@BeforeMethod
	  public void LoginTONeoStox() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		login.sendMobNum(driver,Utility.readDataFromExcel(1, 0));
		login.clickOnSignInButton(driver);
		Thread.sleep(1000);
		Password.sendPassword(driver,Utility.readDataFromExcel(1, 1));
		Password.clickOnSubmitButton(driver);
		Thread.sleep(1000);
		home.popUpHandle(driver); 
	  }

  @Test
  public void ValidateUserName() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getUserName(), Utility.readDataFromExcel(3, 2),"TC failed, actual and expected User Names are not matching");  
	  Utility.takeSceenshot(driver, home.getUserName()); 
  }
  
  @AfterMethod
  public void logout() 
  {
	  home.logoutFormNeoStox(driver); 
  }

  @AfterClass
  public void  closeApplication() throws InterruptedException 
  {
	  closingBrowser(driver); 
  }

}
