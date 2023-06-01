package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.AddOrderPage;

public class AddOrderPageTest extends  BaseClass{
	AddOrderPage addOrder;
	
	@Test
	public void checkNewOrderCreation() throws Exception {
		addOrder=new AddOrderPage(driver);
		Assert.assertTrue(addOrder.checkCreateOrder());
	}
}
