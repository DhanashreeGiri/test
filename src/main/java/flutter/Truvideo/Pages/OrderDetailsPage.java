package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class OrderDetailsPage extends UtilityClass {
	AppiumDriver<WebElement> driver;

	public OrderDetailsPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.view.View[1][@clickable='false'][@focusable='true']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1][@accessible='true'][@index='1']")
   private WebElement orderNumber;

	public WebElement getOrderNumber() {
		return orderNumber;
	}

	@AndroidFindBy(xpath = "//android.view.View[4][@index='3']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4][@index='4']")
	 private WebElement editButton;

	@AndroidFindBy(xpath = "//android.view.View[3][@index='2'][@clickable='true']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3][@index='3']")
	private WebElement refreshButton;

	@AndroidFindBy(accessibility = "Status")
	@iOSXCUITFindBy(accessibility = "Status" )
	private WebElement status;

	@AndroidFindBy(accessibility = "New")
	@iOSXCUITFindBy(accessibility = "New" )
	private WebElement status_New;

	public WebElement getStatus_New() {
		return status_New;
	}

	@AndroidFindBy(xpath = "//android.view.View[6]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3][@index='7']")
	private WebElement customer_Name;

	@AndroidFindBy(xpath = "//android.view.View[10]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[6][@index='11']")
	private WebElement advisor_Name;

	@AndroidFindBy(accessibility = "Customer")
	@iOSXCUITFindBy(accessibility = "Customer" )
	private WebElement customerBlock;

	@AndroidFindBy(accessibility = "Service Advisor")
	@iOSXCUITFindBy(accessibility = "Service Advisor" )
	private WebElement serviceAdvisorBlock;

	@AndroidFindBy(accessibility = "Technician")
   @iOSXCUITFindBy(accessibility = "Technician" )
	private WebElement technicianBlock;

	@AndroidFindBy(accessibility = "Last message")
	  @iOSXCUITFindBy(accessibility = "Last message" )
	private WebElement lastMessagesBlock;

	@AndroidFindBy(accessibility = "VIEW ALL")
	@iOSXCUITFindBy(accessibility = "VIEW ALL" )
	private WebElement viewAll;

	@AndroidFindBy(accessibility = "Media gallery")
	@iOSXCUITFindBy(accessibility = "Media gallery" )
	private WebElement mediaGallery;

	@AndroidFindBy(xpath = "//android.view.View[5][@index='5'][@clickable='true']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[6][@index='6']")
	private WebElement cameraIcon;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	@iOSXCUITFindBy(accessibility = "OK" )
	private WebElement permissionMessage;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@iOSXCUITFindBy(accessibility = "OK" )
	private WebElement permission_Allow;

	@AndroidFindBy(accessibility = "INSPECTIONS")
	@iOSXCUITFindBy(accessibility = "INSPECTIONS" )
	private WebElement inspectionsTab;

	@AndroidFindBy(accessibility = "//android.widget.ImageView/android.view.View[1]")
	private WebElement check_Button;

	@AndroidFindBy(xpath = "//android.view.View[@index=3]")
	private WebElement selectedVideo_Count;

	@AndroidFindBy(xpath = "//android.view.View[2][@index='1'][@clickable='true']")
	private WebElement x_Button;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
	private WebElement pendingToUpload_video;

	public WebElement getPendingToUploadVideo() {
		return pendingToUpload_video;
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Video')]")
	private WebElement video_MediaGallery;

	public WebElement getVideo_MediaGallery() {
		return video_MediaGallery;
	}

	public boolean checkAllImportantTextsArePresent() {
		if (orderNumber.getText() != null && customerBlock.isDisplayed() && serviceAdvisorBlock.isDisplayed()
				&& technicianBlock.isDisplayed() && lastMessagesBlock.isDisplayed() && mediaGallery.isDisplayed()
				&& cameraIcon.isDisplayed()) {
			log.info("All required elements are visible on Ro details screen");
			return true;
		} else {
			log.info("All required elements are not visible on Ro details screen");
			return false;
		}
	}

	public boolean checkAllMandatoryFields() {
		if (orderNumber.getText() != null && customer_Name.getText() != null && advisor_Name.getText() != null) {
			log.info("order number, customer name & advisor name is not null");
			return true;
		} else {
			log.info("order number, customer name & advisor name is null");
			return false;
		}
	}

	// need to call in editRo.xml file
	public boolean checkNavigation_EditRO() throws InterruptedException {
		editButton.click();
		EditOrderPage editOrder = new EditOrderPage(driver);
		Thread.sleep(2000);
		if (editOrder.getEditOrderTitle().isDisplayed()) {
			log.info("user is navigated to the Edit Ro Screen");
			return true;
		} else {
			log.info("user is not navigated to the Edit Ro Screen");
			return false;
		}
	}

	// need to call in cameraScreen.xml file
	public boolean checkNavigation_To_CameraScreen() throws InterruptedException {
		VideoRecordingPage recordingPage = new VideoRecordingPage(driver);
		cameraIcon.click();
		Thread.sleep(4000);
		try {
			log.info("Camera permission Displayed");
			permission_Allow.click();// camera permission
		} catch (Exception e) {
			log.info("Camera permission Not Displayed");
		}
		Thread.sleep(4000);
		try {
			log.info("Audio permission Displayed");
		permission_Allow.click();// audio permission
		}catch (Exception e) {
			log.info("Audio permission Displayed");
			
		}
			Thread.sleep(4000);
		if (recordingPage.getRotateDeviceMessage().isDisplayed()) {
			log.info("Camera screen is displayed");
			return true;
		} else {
			log.info("Camera screen is not displayed");
			return false;
		}
	}

	// need to call in messages.xml
	public boolean checkNavigation_To_Messages() {
		MessagingScreen messageScreen = new MessagingScreen(driver);
		viewAll.click();
		if (messageScreen.getMessage_Title().isDisplayed()) {
			log.info("Messages screen is displayed");
			return true;
		} else {
			log.info("Messages screen is displayed");
			return false;
		}
	}

	// need to call in inspection.xml
	public boolean checkNavigation_To_Inspection() {
		InspectionPage inspectionPage = new InspectionPage(driver);
		inspectionsTab.click();
		if (inspectionPage.getInspection_Title().isDisplayed()) {
			log.info("User is navigated to the Inspection page");
			return true;
		} else {
			log.info("User is not able to navigated to the Inspection page");
			return false;
		}
	}

	public boolean check_UncheckButton_Function() throws InterruptedException {
		scrollDown();
		Thread.sleep(30000);//wait for video encoding
		check_Button.click();
		if (selectedVideo_Count.isDisplayed()) {
			log.info("Video is selected for the next operations");
			x_Button.click();
			return true;
		} else {
			log.info("Video is not selected for the next operations");
			return false;
		}
	}

	public boolean checkNavigation_PendingToUploadScreen() {
		scrollDown();
		pendingToUpload_video.click();
		PendingToUploadPage pendingToUpload = new PendingToUploadPage(driver);
		if (pendingToUpload.getPendingToUpload_Title().isDisplayed()) {
			log.info("User is on Pending to Upload screen");
			return true;
		} else {
			log.info("User is not able to navigate to Pending Upload screen");
			return false;
		}
	}
	private void syso() {
		// TODO Auto-generated method stub

	}
}
