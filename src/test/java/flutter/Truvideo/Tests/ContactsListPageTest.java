package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ContactsListPage;

public class ContactsListPageTest extends BaseClass{

	ContactsListPage contactsListPage;
	
	@Test(priority = 1)
	public void verifyAllAvailableTabsOnContactsScreen() {
		contactsListPage=new ContactsListPage(driver);
		Assert.assertTrue(contactsListPage.checkAllAvailableTabsOnContactsScreen());
	}
	
	@Test(priority = 2)
	public void verifySearchContacts() {
		contactsListPage=new ContactsListPage(driver);
		Assert.assertTrue(contactsListPage.checkSearchContacts());
	}
	
	@Test(priority = 3)
	public void verifyAddToFavorite_withoutSearch() throws InterruptedException {
		contactsListPage=new ContactsListPage(driver);
		Assert.assertTrue(contactsListPage.checkAddToFavorite_withoutSearch());
	}
	
	@Test(priority = 4)
	public void verifyRemoveFromFavorite() throws InterruptedException {
		contactsListPage=new ContactsListPage(driver);
		Assert.assertTrue(contactsListPage.removeFromFavorite());
	}
	
	@Test(priority = 5)
	public void verifyCalling_Button() throws InterruptedException {
		contactsListPage=new ContactsListPage(driver);
		Assert.assertTrue(contactsListPage.checkCalling_Button());
	}
	
	@Test(priority = 6)
	public void verifyAdd_Remove_Favorite_withSearch() {
		contactsListPage=new ContactsListPage(driver);
		Assert.assertTrue(contactsListPage.checkAdd_Remove_Favorite_withSearch());
	}
	
	@Test(priority = 7)
	public void verifyCalling_withSearch () throws InterruptedException{
		contactsListPage=new ContactsListPage(driver);
		Assert.assertTrue(contactsListPage.checkCalling_withSearch());
	}
	
}
