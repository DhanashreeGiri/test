package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;

public class DealerCodePageTest extends BaseClass {
	DealerCodePage dealerCodePage;
	
	@Test(priority = 1)
	public void verifyAllVisibleText_LogoIsDisplayed_DealerCodePage(){
		DealerCodePage dealerCodePage=new DealerCodePage(driver);
		Assert.assertTrue(dealerCodePage.visibleElements_DealerCodePage());
	}
	
	@Test(priority = 2)
	public void verifyLogin_InValidDealerCode() throws InterruptedException {
		dealerCodePage=new DealerCodePage(driver);
		Assert.assertTrue(dealerCodePage.dealerLogin_InvalidCredentials());
	}
	
	@Test(priority = 3)
	public void verifyLogin_ValidDealerCode() throws Exception {
		dealerCodePage=new DealerCodePage(driver);
		Assert.assertTrue(dealerCodePage.dealerLogin_ValidCredentials());
	}
	
	
}
