package TestPackage;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.AccountPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import util.DataUtil;
import util.MyXLSReader;

public class LoginTest extends Base{
	WebDriver driver;
	 MyXLSReader excelReader;
	@Test(dataProvider="DataSupplier")
	public void testLogin(HashMap<String,String> hMap) {
		if (!DataUtil.isRunnable(excelReader, "LoginTest", "Testcases") || hMap.get("Runmode").equals("N"))
		{
			throw new SkipException("Run mode is set to N, hence not executed");
		}
		driver=openBrowserAndApplicationURL(hMap.get("Browser"));
		HomePage homePage=new HomePage(driver);
		homePage.clickOnMyAccountDropMenu();
		LoginPage loginPage=homePage.selectLoginOption();
		loginPage.enterEmailAddress(hMap.get("Username"));
		loginPage.enterPassword(hMap.get("Password"));
		AccountPage accountPage=loginPage.clickOnLoginButton();
		String expectedResult=hMap.get("ExpectedResult");
		boolean expectedConvertedResult = false;
		if(expectedResult.equalsIgnoreCase("Success")) {
			expectedConvertedResult=true;
		}else if(expectedResult.equalsIgnoreCase("Failure")){
			expectedConvertedResult=false;
		}
		boolean actualResult=false;
		
			actualResult=accountPage.verifyTheDisplayofEditYourAccountInformationOption();
		
		Assert.assertEquals(actualResult, expectedConvertedResult);
		
	}
	
	 @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            
	        }
	    }
	 @DataProvider
	 public Object[][] DataSupplier() throws Exception
	 {
		 Object[][] data=null
				 ;
		 try {
		 excelReader=new MyXLSReader("src\\test\\resource\\TutorialsNinjas.xlsx");
		 data=DataUtil.getTestData(excelReader, "LoginTest", "Data");
		 }
		 catch (Throwable e) {
			 e.printStackTrace();
		 }
		return data; 
	 }
	 

}

