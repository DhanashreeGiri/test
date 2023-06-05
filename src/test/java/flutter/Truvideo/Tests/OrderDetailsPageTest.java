package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.OrderDetailsPage;

public class OrderDetailsPageTest extends BaseClass{
	OrderDetailsPage orderDetails;
	
	@Test(priority = 1)
	public void verifyVariousFields_RoDetails() {
		orderDetails=new OrderDetailsPage(driver);
		Assert.assertTrue(orderDetails.checkAllImportantTextsArePresent());
	}
	
	@Test(priority = 2)
	public void verifyMandatoryFields() {
		orderDetails=new OrderDetailsPage(driver);
		Assert.assertTrue(orderDetails.checkAllMandatoryFields());
	}

}
