package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VideoRecordingPage extends UtilityClass{
	AppiumDriver<WebElement> driver;
	
	public VideoRecordingPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Rotate your device Left or Right")
	private WebElement rotateDeviceMessage;
	
	public WebElement getRotateDeviceMessage() {
		return rotateDeviceMessage;
	}
	
	@AndroidFindBy(accessibility = "The device must be on landscape mode")
	private WebElement theDeviceMustBeOnLandscapeMode_text;
	
	@AndroidFindBy(accessibility = "PICK FROM DEVICE GALLERY")
	private WebElement pickFromGallery;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement accessPhotosAndMedia_Allow;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Recent')]")
	private WebElement RecentTab;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'ALL')]")
	private WebElement all_Tab;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'VIDEOS')]")
	private WebElement videos_Tab;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'PICTURES')]")
	private WebElement pictures_Tab;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[1]")
	private WebElement firstVideoOrImage_InEach_Tab;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[2]")
	private WebElement secondVideoOrImage_InEach_Tab;
	
	@AndroidFindBy(accessibility = "CONTINUE")
	private WebElement continueButton;
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement mediaPermission_Allow;
	
	public boolean checkVideoUploadingFromDeviceGallery() throws InterruptedException {
		pickFromGallery.click();
		Thread.sleep(2000);
		try {
			log.info("Permission message displayed");
		mediaPermission_Allow.click();
		}catch(Exception e) {
			log.info("Permission message not displayed");
		}
		Thread.sleep(2000);
		RecentTab.click();
		Thread.sleep(4000);
		videos_Tab.click();
		Thread.sleep(2000);
		firstVideoOrImage_InEach_Tab.click();
		pictures_Tab.click();
		Thread.sleep(2000);
		firstVideoOrImage_InEach_Tab.click();
		secondVideoOrImage_InEach_Tab.click();
		continueButton.click();
		Thread.sleep(3000);
		VideoPreviewScreen previewScreen=new VideoPreviewScreen(driver);
		if(previewScreen.getPlay_PauseButton().isDisplayed()) {
			log.info("video Preview is Displayed");
			return true;
		}else {
			log.info("video Preview is not Displayed");
			return false;
		}
	}
	

}
