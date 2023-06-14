package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ChangeDealerPage;

public class ChangeDealerPageTest extends BaseClass {
	ChangeDealerPage changeDealer;
	
	@Test
	public void checkChangeDealerFunctionality() throws InterruptedException
	{
		changeDealer=new ChangeDealerPage(driver);
		Assert.assertTrue(changeDealer.changeDealer("BMW"));
	}
	
	
}
