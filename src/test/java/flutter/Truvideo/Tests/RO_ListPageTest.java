package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_ListPage;

public class RO_ListPageTest extends BaseClass{

	RO_ListPage ro_ListPage;
	
	@Test(priority = 1)
	public void verifyAllFooterTabs_and_HeadersTabs() throws Exception {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkAllFooterTab_and_HederTabs());
	}
	
	@Test(priority = 2)
	public void verifySearchROFunction() throws InterruptedException {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkSearchROFunction("752"));
	}
	
	@Test(priority = 3)
	public void verifyRO_Status_New() throws Exception {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkRO_Status_New());
	}
	
	@Test(priority = 4)
	public void verifyRO_Status_Rejected() throws Exception {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkRO_Status_Rejected());
	}
	
	@Test(priority = 5)
	public void verifyRO_Status_All() throws Exception {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkRO_Status_All());
	}
	
	@Test(priority = 6)
	public void verifyRO_Status_My() throws Exception {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkRO_Status_My());
	}
	
	@Test(priority = 7)
	public void verifyNavigationTo_Chat() {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkNavigationTo_Chat());
	}
	
	@Test(priority = 8)
	public void verifyNavigationTo_Messages() {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkNavigationTo_Messages());
	}
	
	@Test(priority = 9)
	public void verifyNavigationTo_Contacts() {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkNavigationTo_Contacts());
	}
	
	@Test(priority = 10)
	public void verifyNavigation_BackTo_Orders() {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkNavigationBackTo_Order());
	}
	
	@Test(priority = 11)//need to call in profilrIcon.xml file
	public void verifyNavigationToProfileIcon() throws InterruptedException {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkNavigationToProfileIcon());
	}
	
	@Test(priority = 12)
	public void verifyNavigationToAddOrderPage() {
		ro_ListPage=new RO_ListPage(driver);
		Assert.assertTrue(ro_ListPage.checkNavigationTo_AddOrder_Page());
	}
	
	@Test(priority = 15)  //Using for selecting first Existing New RO
	public void verifyNavigationFirstNewExistingRODetailsPage() {
		ro_ListPage=new RO_ListPage(driver);
		ro_ListPage.checkNavigationTo_OrderDetails_Existing_FirstNewRO();
	}
	
	private void syso() {
		// TODO Auto-generated method stub
        }
}

