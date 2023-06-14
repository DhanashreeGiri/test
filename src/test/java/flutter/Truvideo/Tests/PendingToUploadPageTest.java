package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.PendingToUploadPage;

public class PendingToUploadPageTest extends BaseClass{
	PendingToUploadPage pendingToUploadPage;
	
	//@Test(priority = 1)
	public void verifyVideoCanPlayOnPendingScreen() throws InterruptedException {
		pendingToUploadPage=new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.checkVideoIsPlaying());
	}
	
	@Test(priority = 2)
	public void verifyChangeVideoTagAndDescription() throws InterruptedException {
		pendingToUploadPage=new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.changeVideoTagAndDescription());
	}
	
	@Test(priority = 3)
	public void verifyDeleteImage() throws InterruptedException {
		pendingToUploadPage=new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.deleteImage());
	}
	
	@Test(priority = 4)
	public void verifyUploadVideo() throws InterruptedException {
		pendingToUploadPage=new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.uploadVideo());
	}
	private void syso() {
		// TODO Auto-generated method stub
        }
	
}
