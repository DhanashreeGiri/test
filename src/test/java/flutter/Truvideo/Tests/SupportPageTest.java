package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.SupportPage;
       
 
public class SupportPageTest extends BaseClass {
	 SupportPage support;
	@Test
	public void verifySupportFunctionality() throws InterruptedException
	{
		support=new SupportPage(driver);
		Assert.assertTrue(support.checkSupportFunctionality("rahul.kapse@5exceptions.com", "9689798989", "Testing Support"));
		
	}
	private void syso() {
		// TODO Auto-generated method stub
        }

}
