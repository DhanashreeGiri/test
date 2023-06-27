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

	//need to call in editRO.xml
	@Test
	public void verifyNavigationToEditOrder() throws InterruptedException {
		orderDetails=new OrderDetailsPage(driver);
		Assert.assertTrue(orderDetails.checkNavigation_EditRO());
	}
	
	@Test
	public void verifyNavigationToCameraScreen() throws InterruptedException {
		orderDetails=new OrderDetailsPage(driver);
		Assert.assertTrue(orderDetails.checkNavigation_To_CameraScreen());
	}
	
	@Test
	public void verifyNavigationToMessages() throws InterruptedException {
		orderDetails=new OrderDetailsPage(driver);
		Assert.assertTrue(orderDetails.checkNavigation_To_Messages());
	}
	
	@Test
	public void verifyCheck_UncheckVideoFunction() throws InterruptedException {
		orderDetails=new OrderDetailsPage(driver);
		Assert.assertTrue(orderDetails.check_UncheckButton_Function());
	}
	
	@Test
	public void verifyNavigationToPendingToUpload() throws InterruptedException {
		orderDetails=new OrderDetailsPage(driver);
		Assert.assertTrue(orderDetails.checkNavigation_PendingToUploadScreen());
	}
	
	
	@Test
	public void verifyNavigationToListPage() throws InterruptedException {
		orderDetails=new OrderDetailsPage(driver);
		orderDetails.checkNavigationToListPage();
	}
	
}
