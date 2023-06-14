package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.EditOrderPage;

public class EditOrderPageTest extends BaseClass{
	EditOrderPage editOrderPage;
	
	@Test(priority = 1)
	public void verifyFleetCustomerFunction() {
		editOrderPage=new EditOrderPage(driver);
		Assert.assertTrue(editOrderPage.checkFleetCustomerFunction());
	}
	
	@Test(priority = 2)
	public void verifyEditOrderFunction() throws InterruptedException {
		editOrderPage=new EditOrderPage(driver);
		Assert.assertTrue(editOrderPage.editOrder());
	}

}
