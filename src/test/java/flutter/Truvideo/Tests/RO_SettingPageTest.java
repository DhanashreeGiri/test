package flutter.Truvideo.Tests;

import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_SettingPage;

public class RO_SettingPageTest extends BaseClass {
	
	RO_SettingPage settingpage;
	
	@Test
	public void checkSmallFont() throws InterruptedException{
		settingpage=new RO_SettingPage(driver);
		settingpage.checkSmallFont();
	}
	private void syso() {
		// TODO Auto-generated method stub

	}
}
