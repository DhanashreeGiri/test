package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.VideoRecordingPage;

public class VideoRecordingPageTest extends BaseClass{
	VideoRecordingPage vidioRecordingPage;

	@Test
	public void verifyVideoUploading_MediaGallery() throws InterruptedException {
		vidioRecordingPage=new VideoRecordingPage(driver);
		Assert.assertTrue(vidioRecordingPage.checkVideoUploadingFromDeviceGallery());
	}
	
	@Test(priority = 1)
	public void verifyChangingVideoQualityFromRecorder() throws InterruptedException {
		vidioRecordingPage=new VideoRecordingPage(driver);
		vidioRecordingPage.checkChangingVideoQualityFromRecorder();
	}
	
	@Test(priority = 2)
	public void verifyFlashlightFunction() throws InterruptedException {
		vidioRecordingPage=new VideoRecordingPage(driver);
		Assert.assertTrue(vidioRecordingPage.checkFlashlightFunction());
	}
	
	@Test(priority = 3)
	public void verifyNarratorMode() throws InterruptedException {
		vidioRecordingPage=new VideoRecordingPage(driver);
		Assert.assertTrue(vidioRecordingPage.checkNarratorMode());
	}
	
	@Test(priority = 4)
	public void verifyNoiseCancellation() throws InterruptedException {
		vidioRecordingPage=new VideoRecordingPage(driver);
		Assert.assertTrue(vidioRecordingPage.checkNoiseCancellation());
	}
	
	@Test(priority = 5)
	public void verifyOnlyImageCapturing() throws InterruptedException {
		vidioRecordingPage=new VideoRecordingPage(driver);
		Assert.assertTrue(vidioRecordingPage.checkOnlyImageCapturing());
	}
	
	@Test(priority = 6)
	public void verifyNavigationToMediaActionScreen() throws InterruptedException {
		vidioRecordingPage=new VideoRecordingPage(driver);
		Assert.assertTrue(vidioRecordingPage.checkNavigationToMediaActionScreen());
	}
	
	@Test(priority = 7)
	public void verifyVideoRecordingWithImageCapture() throws InterruptedException {
		vidioRecordingPage=new VideoRecordingPage(driver);
		Assert.assertTrue(vidioRecordingPage.checkVideoRecordingWithImageCapture());
	}
	
	@Test
   public void verifyCameraQuality() throws InterruptedException
   {
		vidioRecordingPage=new VideoRecordingPage(driver);
		vidioRecordingPage.cameraQualityFromSetting();
   }
	

}
