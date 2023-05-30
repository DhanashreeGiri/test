package flutter.Truvideo.Tests;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;
import io.appium.java_client.AppiumDriver;

public class DealerCodePageTest extends BaseClass {
	AppiumDriver<WebElement> driver;
	DealerCodePage dealerCodePage;

	@BeforeTest
	public void setUp() throws IOException, ParseException {
		driver=setUpApplication();
		//dealerCodePage=new DealerCodePage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	@BeforeMethod
	public void intialisation() {
	 dealerCodePage=new DealerCodePage(driver);
	}
	
	@Test(priority = 1)
	public void verifyAllVisibleText_LogoIsDisplayed_DealerCodePage(){
		//DealerCodePage dealerCodePage=new DealerCodePage(driver);
		Assert.assertTrue(dealerCodePage.visibleElements_DealerCodePage());
	}
	
	@Test(priority = 2)
	public void verifyLogin_InValidDealerCode() throws InterruptedException {
		Assert.assertTrue(dealerCodePage.dealerLogin_InvalidCredentials());
	}
	
	@Test(priority = 3)
	public void verifyLogin_ValidDealerCode() throws Exception {
		Assert.assertTrue(dealerCodePage.dealerLogin_ValidCredentials());
	}
	
	
}
