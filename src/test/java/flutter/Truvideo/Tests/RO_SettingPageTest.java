package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_SettingPage;

public class RO_SettingPageTest extends BaseClass {
	
	RO_SettingPage settingpage;
	
	@Test(priority = 0)
	public void checkSmallFont() throws InterruptedException{
		settingpage=new RO_SettingPage(driver);
		Assert.assertTrue(settingpage.checkSmallFont());
	}
	@Test(priority = 1)
	public void checkMediumFont() throws InterruptedException{
		settingpage=new RO_SettingPage(driver);
		Assert.assertTrue(settingpage.meduimFontCheck());
	}
	@Test(priority = 2)
	public void checkLargeFont() throws InterruptedException{
		settingpage=new RO_SettingPage(driver);
		Assert.assertTrue(settingpage.largeFontCheck());
	}
	
	@Test(priority = 3)
	public void checkThemeMode() throws InterruptedException{
		settingpage=new RO_SettingPage(driver);
		Assert.assertTrue(settingpage.checkTheme());
	}

	@Test(priority = 4)
	public void biometricConfiguration() throws InterruptedException{
		settingpage=new RO_SettingPage(driver);
		settingpage.biometricConfiguration();
	}
	
	@Test
	public void checkingCountryDopdown() throws InterruptedException
	{
		settingpage=new RO_SettingPage(driver);
		Assert.assertTrue(settingpage.defaultCountry("India"));
		
	}

}
<<<<<<< HEAD
=======


>>>>>>> origin/Rahul
