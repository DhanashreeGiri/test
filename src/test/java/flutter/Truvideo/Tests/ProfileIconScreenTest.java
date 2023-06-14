package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ProfileIconScreen;

public class ProfileIconScreenTest extends BaseClass {
	ProfileIconScreen Profileiconscreen;
	
	@Test
	public void clickonsettingsButton()
	{
		Profileiconscreen=new ProfileIconScreen(driver);
		Profileiconscreen.checkNavigationToSettingsScreen();
	}
	
	@Test
	public void verifyDealerNameSwitchDealer()
	{
		Profileiconscreen=new ProfileIconScreen(driver);
		Assert.assertTrue(Profileiconscreen.varifyDealerName());
	}

}
