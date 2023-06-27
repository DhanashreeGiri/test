package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.VideoPreviewScreen;

public class VideoPreviewScreenTest extends BaseClass {
	VideoPreviewScreen videoPreviewScreen;

	@Test(priority = 1)
	public void verifyDeleteVideoFunction_NOButton() throws InterruptedException {
		videoPreviewScreen = new VideoPreviewScreen(driver);
		Assert.assertTrue(videoPreviewScreen.checkDeleteVideoFunction_NOButton());
	}

	@Test(priority = 2)
	public void verifyDeleteVideoFunction_DeleteButton_MediaGallery() throws InterruptedException {
		videoPreviewScreen = new VideoPreviewScreen(driver);
		Assert.assertTrue(videoPreviewScreen.checkDeleteVideoFunction_DeleteButton_MediaGallery());
	}

	@Test(priority = 2)
	public void verifyDeleteVideoFunction_DeleteButton_Recorder() throws InterruptedException {
		videoPreviewScreen = new VideoPreviewScreen(driver);
		Assert.assertTrue(videoPreviewScreen.checkDeleteVideoFunction_DeleteButton_Recorder());
	}

	//Need to call in recorder side only
	@Test
	public void verifyDeleteImagesFunction() throws InterruptedException {
		videoPreviewScreen = new VideoPreviewScreen(driver);
		videoPreviewScreen.deleteImages();
	}

	// call in second time
	@Test(priority = 3)
	public void verifyPreviewScreenFunction() throws InterruptedException {
		videoPreviewScreen = new VideoPreviewScreen(driver);
		Assert.assertTrue(videoPreviewScreen.checkPreviewScreenFunction());
	}
	
	@Test()       //ForCameraQualityThroughSetting
	public void verifyNavigatingonPendianToUploadScreenCameraQualitySetting() throws InterruptedException
	{
		videoPreviewScreen = new VideoPreviewScreen(driver);
		Assert.assertTrue(videoPreviewScreen.forCameraQualityFunction());
	}

}
