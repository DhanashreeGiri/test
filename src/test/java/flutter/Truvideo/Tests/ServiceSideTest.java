package flutter.Truvideo.Tests;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.POM.POM_ROListPage;
import flutter.Truvideo.Pages.AddOrderPage;
import flutter.Truvideo.Pages.DealerCodePage;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.UserListPage;
import io.appium.java_client.AppiumDriver;

public class ServiceSideTest extends BaseClass {
	
	AppiumDriver<WebElement> driver;
	DealerCodePage dealerCodePage;
	UserListPage userlogin;
	RO_ListPage roListPage;
	AddOrderPage addOrderPage;
	
	@BeforeTest
	public void setUp() throws IOException, ParseException {
		driver=setUpApplication();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 0)
	public void verifyDealerCode_InvalidDealer() throws InterruptedException {
		dealerCodePage= new DealerCodePage(driver);
		Assert.assertTrue(dealerCodePage.dealerLogin_InvalidCredentials());
	}
	
	
	@Test(priority = 1)
	public void verifyDealerCode_ValidDealer() throws Exception
	{
		dealerCodePage= new DealerCodePage(driver);
		Assert.assertTrue(dealerCodePage.dealerLogin_ValidCredentials());
	}
	
	@Test(priority = 2)
	public void verifyLoginWith_InvalidPin() throws Exception {
		userlogin =new UserListPage(driver);
		Assert.assertTrue(userlogin.selectUserToLogin_WitInvalidPin());
	}
	
	@Test(priority = 3)
	public void verifyLoginwith_ValidPin() throws Exception{
		userlogin =new UserListPage(driver);
		Assert.assertTrue(userlogin.selectUserToLogin_WithValidPin());
	}
	
	@Test(priority = 4)
	public void verifyFooterTabsOn_RO_Screen() throws Exception {
		roListPage=new RO_ListPage(driver);
		Assert.assertTrue(roListPage.checkAllFooterTab());
	}
	
	@Test(priority = 5)
	public void verifySearchROFunction() throws InterruptedException {
		roListPage=new RO_ListPage(driver);
		Assert.assertTrue(roListPage.checkSearchFunction("720"));
	}
	
	@Test(priority = 6)
	public void verifyROFilter_New() throws Exception {
		roListPage=new RO_ListPage(driver);
		Assert.assertTrue(roListPage.checkRO_Status_New());
	}
	
	@Test(priority = 7)
	public void verifyROFilter_Rejected() throws Exception {
		roListPage=new RO_ListPage(driver);
		Assert.assertTrue(roListPage.checkRO_Status_New());
	}
	
	@Test(priority = 8)
	public void verifyROFilter_All() throws Exception {
		roListPage=new RO_ListPage(driver);
		Assert.assertTrue(roListPage.checkRO_Status_All());
	}
	
	@Test(priority = 9)
	public void verifyROFilter_My() throws Exception {
		roListPage=new RO_ListPage(driver);
		Assert.assertTrue(roListPage.checkRO_Status_My());
		POM_ROListPage.backButton_RODetails.click();
	}
	
	@Test(priority = 10)
	public void verifyNavigationToCreateNewRO() throws Exception {
		roListPage=new RO_ListPage(driver);
		Assert.assertTrue(roListPage.checkNavigationToCreateNew_RO());
	}
	
	@Test(priority = 11)
	public void verifyCreateNewRepairOrderFunction() throws Exception {
	   addOrderPage=new AddOrderPage(driver);
	   Assert.assertTrue(addOrderPage.createNewRO());
	}
	
	
	
	

}
