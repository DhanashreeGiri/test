package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.UserListPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserListPageTest extends BaseClass {
	UserListPage userListPage ;
	
	@Test(priority = 1)
	public void verifyDealerName_And_RefreshButton() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.checkVisibleText_Icons());	
	}
	
	@Test(priority =2)
	public void verifyCreateUserFunction() throws InterruptedException {
		userListPage = new UserListPage(driver);
		//CreateNewUserPage newUser=new CreateNewUserPage(driver);
		Assert.assertTrue(userListPage.checkCreateUserFunction());
		
	}
	
	@Test(priority =3)
	public void verify_TextsUnderChangeDealerFunction() {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.check_TextsUnderChangeDealerFunction());
	}
	
	@Test(priority =4)
	public void verify_ChangeDealerFunction() throws InterruptedException {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.check_ChangeDealerFunction());
	}
	
	@Test(priority = 5)
	public void verifyInvalidUserSearch() throws InterruptedException {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.checkForInvalidUser());
	}
	
	@Test(priority = 6)
	public void verify_HelloThere_PersonalPinText() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.check_VisibleText_PersonalPinScreen());
	}
	
	@Test(priority = 7)
	public void verify_Login_InValidPin() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.selectUserToLogin_WitInvalidPin());
	}
	
	@Test(priority = 8)
	public void verify_Login_ValidPin() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.selectUserToLogin_WithValidPin());
	}
	
}
<<<<<<< HEAD
=======

>>>>>>> origin/Rahul
