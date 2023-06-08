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
}
