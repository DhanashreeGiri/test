package flutter.Truvideo.Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PendingToUploadPage extends UtilityClass{
	AppiumDriver<WebElement> driver;
	
	public PendingToUploadPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(accessibility = "Pending to upload")
	private WebElement pendingToUpload_Title;
	
	public WebElement getPendingToUpload_Title() {
		return pendingToUpload_Title;
	}
	
	@AndroidFindBy(accessibility = "UPLOAD")
	private WebElement upload_button;
	
	@AndroidFindBy(xpath = "//android.view.View[7]")
	private WebElement playIcon_Blue;
	
	@AndroidFindBy(xpath = "//android.view.View[4]")
	private WebElement playPause_Button_playerScreen;
	
	@AndroidFindBy(xpath = "//android.view.View[2]")
	private WebElement backButton_playerScreen;
	
	@AndroidFindBy(xpath = "//android.view.View[3]")
	private WebElement tagDropdown;
	
	@AndroidFindBy(accessibility = "Inspection Video")
	private WebElement inspection_Video;
	
	@AndroidFindBy(accessibility = "Condition Video")
	private WebElement condition_Video;
	
	@AndroidFindBy(accessibility = "Sanitization Video")
	private WebElement sanitization_Video;
	
	@AndroidFindBy(accessibility = "Status Video")
	private WebElement status_Video;
	
	@AndroidFindBy(accessibility = "Other Video")
	private WebElement other_Video;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	private WebElement backButton_VideoTag;
	
	@AndroidFindBy(xpath = "//android.view.View[5]")
	private WebElement videoDescription_MessageButton;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement descriptionTextBox;
	
	@AndroidFindBy(accessibility = "CLOSE")
	private WebElement close_Button;
	
	@AndroidFindBy(xpath = "//android.view.View[@index='5']")
	private WebElement enteredVideoDescription;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[1][contains(@content-desc,'Resolution')]/android.view.View[1]")
	private WebElement firstImageDescription_MessageButton;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[2][contains(@content-desc,'Resolution')]/android.view.View[1]")
	private WebElement secondImageDescription_MessageButton;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[1][contains(@content-desc,'Resolution')]/android.view.View[2]")
	private WebElement firstImageDescription_DeleteButton;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[2][contains(@content-desc,'Resolution')]/android.view.View[2]")
	private WebElement secondImageDescription_DeleteButton;
	
	@AndroidFindBy(accessibility = "Delete")
	private WebElement delete_Message;
	
	@AndroidFindBy(accessibility = "Are you sure?")
	private WebElement areYouSure_Message;
	
	@AndroidFindBy(accessibility = "NO")
	private WebElement no_Button;
	
	@AndroidFindBy(accessibility = "DELETE")
	private WebElement deleteButton;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	private WebElement backButton;// no need if bug is fixed
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'320x240')]")
	private List<WebElement> lowResolution;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'720x480')]")
	private  List<WebElement>  mediumResolution;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'1280x720')]")
	private List<WebElement> highResolution;
	

	
	public boolean checkVideoIsPlaying() throws InterruptedException {
		Thread.sleep(30000);//wait for video encoding
		playIcon_Blue.click();
		Thread.sleep(1000);
		log.info("Video played inside pending to upload screen");
		playPause_Button_playerScreen.click();
		log.info("video paused inside pending to upload screen");
		Thread.sleep(1000);
		backButton_playerScreen.click();
		if(tagDropdown.isDisplayed()) {
			log.info("Navigate back to upload screen");
			return true;
		}else {
			log.info("Error in Navigating back to upload screen");
			return false;
		}	
	}
	
	public boolean changeVideoTagAndDescription() throws InterruptedException {
		Thread.sleep(5000);
		scrollDown();
		Thread.sleep(1000);
		tagDropdown.click();
		Thread.sleep(2000);
		log.info("Video tag dropdown opened");
		sanitization_Video.click();
		log.info("Video tag changed to Sanitization Video");
		videoDescription_MessageButton.click();
		log.info("Add Description pop-up window open");
		descriptionTextBox.sendKeys("Testing Tags");
		String enteredTag=descriptionTextBox.getText();
		close_Button.click();
		if(enteredVideoDescription.getAttribute("content-desc").equals(enteredTag)) {
			log.info("Description is same as Entered");
			return true;
		}else {
			log.info("Description is not same as Entered");
			return false;
		}	
	}
	
	public boolean deleteImage() throws InterruptedException {
		scrollDown();
		Thread.sleep(1000);
		firstImageDescription_DeleteButton.click();
		if(delete_Message.isDisplayed() && areYouSure_Message.isDisplayed()) {
			log.info("Delete Pop-up window is displayed");
			no_Button.click();
			log.info("Image not deleted ");
		}
		firstImageDescription_DeleteButton.click();
		if(delete_Message.isDisplayed()&& areYouSure_Message.isDisplayed()) {
			log.info("Delete Pop-up window is displayed");
			deleteButton.click();
			log.info("Image deleted successfully");
			return true;
		}else {
			deleteButton.click();
			return false;
		}
	}
	
	public boolean uploadVideo() throws InterruptedException {
		scrollUp();
		scrollUp();
		Thread.sleep(1000);
		upload_button.click();
		Thread.sleep(30000);//wait for video encoding  and uploading process
		backButton.click();//Need to remove when the bug will fixed
		Thread.sleep(2000);
		OrderDetailsPage orderDetailsPage=new OrderDetailsPage(driver);
		scrollDown();
		Thread.sleep(4000);
		if(orderDetailsPage.getVideo_MediaGallery().isDisplayed()) {
			log.info("Video Uploaded Successfully");
			return true;
		}else {
			log.info("Video Uploading failed");
			return false;
		}	
	}
	
	String resultion;
	
	public boolean checkVideoLowQuality()
	{
		String resultion=lowResolution.get(0).getAttribute("content-desc");
		log.info(resultion);
		System.out.println("checking low resolution"+resultion );
		
		log.info("User is navigated on RO Details Page");
		
		//Assert.assertTrue(resultion.contains("320x240"));
		scrollDown();
         deleteButton.click();
         deleteButton.click();
		if(resultion.contains("320x240")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkVideoMediumQuality()
	{
		String resultion=mediumResolution.get(0).getAttribute("content-desc");
		log.info(resultion);
		System.out.println("checking medium resolution"+resultion );
		
		log.info("User is navigated on RO Details Page");
		
		//Assert.assertTrue(resultion.contains("640x480"));
		scrollDown();
        deleteButton.click();
        deleteButton.click();
		if(resultion.contains("720x480")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkVideoHighQuality()
	{
		String resultion=highResolution.get(0).getAttribute("content-desc");
		log.info(resultion);
		System.out.println("checking high resolution"+resultion );
		
		log.info("User is navigated on RO Details Page");
		
		//Assert.assertTrue(resultion.contains("1280x720"));
		scrollDown();
        deleteButton.click();
        deleteButton.click();
		if(resultion.contains("1280x720")) {
			return true;
		}else {
			return false;
		}
	}
	private void syso() {
		// TODO Auto-generated method stub

	}
}
