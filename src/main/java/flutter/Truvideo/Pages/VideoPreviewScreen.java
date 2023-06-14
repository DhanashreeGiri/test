package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VideoPreviewScreen extends UtilityClass{
	AppiumDriver<WebElement> driver;

	public VideoPreviewScreen(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.view.View[8]")
	private WebElement play_Pause_Button;
	
	public WebElement getPlay_PauseButton(){
		return play_Pause_Button;
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]")
	private WebElement greenButton;
	
	@AndroidFindBy(xpath = "//android.view.View[5][@index='4']")
	private WebElement redButton;
	
	@AndroidFindBy(xpath = "//android.view.View[5]")
	private WebElement rotation_Anticlockwise_video;
	
	@AndroidFindBy(xpath = "//android.view.View[6]")
	private WebElement rotation_Clockwise_video;
	
	@AndroidFindBy(xpath = "//android.view.View[2][@scrollable='true']")
	private WebElement firstScroll_Bar;
	
	@AndroidFindBy(xpath = "//android.view.View[4][@scrollable='true']")
	private WebElement lastScroll_Bar;
	
	@AndroidFindBy(accessibility = "Delete")
	private WebElement delete_Message;
	
	@AndroidFindBy(accessibility = "Are you sure?")
	private WebElement areYouSure_Message;
	
	@AndroidFindBy(accessibility = "DELETE")
	private WebElement delete_Button;
	
	@AndroidFindBy(accessibility = "NO")
	private WebElement no_Button;
	
	@AndroidFindBy(xpath = "//android.view.View[2][@clickable='true']")
	private WebElement next_ScreenButton;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	private WebElement previous_ScreenButton;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.ImageView/android.view.View[1]")
	private WebElement rotate_Anticlockwise_image;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.ImageView/android.view.View[2]")
	private WebElement rotate_Clockwise_image;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.ImageView/android.view.View[3]")
	private WebElement flip_Image_Left_Right;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.ImageView/android.view.View[4]")
	private WebElement flip_Image_Up_Down;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.ImageView/android.view.View[5]")
	private WebElement delete_Image;
	
	public boolean checkDeleteVideoFunction_NOButton() throws InterruptedException {
		next_ScreenButton.click();
		redButton.click();
		Thread.sleep(2000);
		if(delete_Message.isDisplayed()&&areYouSure_Message.isDisplayed()) {
			log.info("Delete popup opened & Are you Sure? message is Dispalyed");
			Thread.sleep(1000);
			no_Button.click();
			return true;
		}else {
			log.info("Delete popup opened & Are you Sure? message is not Dispalyed");
			no_Button.click();
			return false;
		}
	}
	
	public boolean checkDeleteVideoFunction_DeleteButton_MediaGallery() throws InterruptedException{
		redButton.click();
		Thread.sleep(2000);
		delete_Button.click();
		VideoRecordingPage recordingScreen=new VideoRecordingPage(driver);
		Thread.sleep(2000);
		if(recordingScreen.getRotateDeviceMessage().isDisplayed()) {
			log.info("video deleted from video preview screen");
			return true;
		}else {
			log.info("video not deleted from video preview screen");
			return false;
		}
	}
	
	public boolean checkDeleteVideoFunction_DeleteButton_Recorder() throws InterruptedException{
		redButton.click();
		Thread.sleep(2000);
		delete_Button.click();
		VideoRecordingPage recordingScreen=new VideoRecordingPage(driver);
		Thread.sleep(2000);
		if(recordingScreen.getRecordingTimer().isDisplayed()) {
			log.info("video deleted from video preview screen");
			return true;
		}else {
			log.info("video not deleted from video preview screen");
			return false;
		}
	}
	
	//need for recording side only
	public void deleteImages() {
		next_ScreenButton.click();
		delete_Image.click();
		delete_Button.click();
		log.info("image deleted : 1st");
		delete_Image.click();
		delete_Button.click();
		log.info("image deleted : 2nd");
		delete_Image.click();
		delete_Button.click();
		log.info("image deleted : 3rd");
		delete_Image.click();
		delete_Button.click();
		log.info("image deleted : 4th");
		previous_ScreenButton.click();
	}
	
	public boolean checkPreviewScreenFunction() throws InterruptedException {
		Thread.sleep(2000);
		//previous_ScreenButton.click();
		rotation_Anticlockwise_video.click();
		log.info("Video : Anticlockwise rotation done");
		rotation_Clockwise_video.click();
		log.info("Video : Clockwise rotation done");
		play_Pause_Button.click();
		log.info("Video is Started");
		Thread.sleep(2000);
		play_Pause_Button.click();
		log.info("Video is Stopped");
		next_ScreenButton.click();
		log.info("Navigated to image preview screen");
		rotate_Anticlockwise_image.click();
		Thread.sleep(3000);
		log.info("Image : Anticlockwise rotation done");
		rotate_Clockwise_image.click();
		Thread.sleep(3000);
		log.info("Image : Clockwise rotation done");
		flip_Image_Left_Right.click();
		Thread.sleep(3000);
		log.info("Image : Flip image left/right done");
		flip_Image_Up_Down.click();
		Thread.sleep(3000);
		log.info("Image : Flip image up/down done");
		delete_Image.click();
		log.info("Image : Delete popup opened & Are you Sure? message is not Dispalyed");
		no_Button.click();
		delete_Image.click();
		log.info("Image : Delete popup opened & Are you Sure? message is not Dispalyed 2nd time");
		delete_Button.click();
		log.info("Image : One image is deleted");
		greenButton.click();
		OrderDetailsPage orderDetailsPage=new OrderDetailsPage(driver);
		Thread.sleep(4000);
		if(orderDetailsPage.getPendingToUploadVideo().isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	private void syso() {
		// TODO Auto-generated method stub

	}
	
	

}
