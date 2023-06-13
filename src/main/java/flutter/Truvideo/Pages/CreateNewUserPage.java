package flutter.Truvideo.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CreateNewUserPage extends UtilityClass {

	AppiumDriver<WebElement> driver;
	UserListPage userlist;
	
	public CreateNewUserPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private List<WebElement> backButton;//index=4
	
	public WebElement getBackButton() {
		return backButton.get(4);
	}
	@iOSXCUITFindBy(accessibility="Create user")
	@AndroidFindBy(accessibility = "Create user")
	private WebElement createUserPage_Title;
	
	public WebElement getCreateUserPage_Title() {
		return createUserPage_Title;
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
	private WebElement fNameBox;
	
	public WebElement getfNameBox() {
		return fNameBox;
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]")
	private WebElement lNameBox;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]")
	private WebElement jobTitle;
	
	@AndroidFindBy(accessibility  = "CANCEL")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CANCEL\"]")
	private WebElement cancelButton;
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"CREATE\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CREATE\"]")
	private WebElement createButton;
	
	@AndroidFindBy(accessibility = "Almost done!")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Almost done!\"]")
	private WebElement almostDoneText;
	
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private List<WebElement> closeBtn;//index=4
	
	@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Required\"])[1]")
	private WebElement errorMsg_required_Name;
	
	@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Required\"])[2]")
	private WebElement errorMsg_required_LastName;
	
	@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Required\"])[3]")
	private WebElement errorMsg_required_JobTitle;
	
	@AndroidFindBy(accessibility = "0")
	private WebElement zero;
	
	@AndroidFindBy(accessibility = "1")
	private WebElement one;

	@AndroidFindBy(accessibility = "2")
	private WebElement two;

	@AndroidFindBy(accessibility = "3")
	private WebElement three;

	@AndroidFindBy(accessibility = "4")
	private WebElement four;

	@AndroidFindBy(accessibility = "5")
	private WebElement five;

	@AndroidFindBy(accessibility = "6")
	private WebElement six;

	@AndroidFindBy(accessibility = "7")
	private WebElement seven;

	@AndroidFindBy(accessibility = "8")
	private WebElement eight;

	@AndroidFindBy(accessibility = "9")
	private WebElement nine;
	
	@AndroidFindBy(accessibility = "Create your pin")
	private WebElement createYourPinText;
	
	@AndroidFindBy(accessibility = "Confirm your pin")
	private WebElement confirmYourPinText;
	
	@AndroidFindBy(accessibility = "Error")
	private WebElement errorText;
	
	@AndroidFindBy(accessibility = "The pin codes do not match")
	private WebElement pinDoNotMatchText;

	@AndroidFindBy(accessibility = "ACCEPT")
	private WebElement acceptButton;
	
	
	public boolean check_cancelButton() {
		fNameBox.click();
		createUserPage_Title.click();//hiding keyboard
		//((HidesKeyboard) driver).hideKeyboard();
		cancelButton.click();
		UserListPage userListPage=new UserListPage(driver);
		if(userListPage.getDealerName().isDisplayed()) {
			log.info("Cancel Button is Working");
			return true;
		}else {
			log.info("Cancel Button is not Working");
			return false;
		}
	}
	
	public boolean checkErrorMessage_NullValue() {
		createUserPage_Title.click();//hiding keyboard
		//((HidesKeyboard) driver).hideKeyboard();
		createButton.click();
		if(errorMsg_required_Name.isDisplayed() && errorMsg_required_LastName.isDisplayed()
				&& errorMsg_required_JobTitle.isDisplayed()) {
			log.info("Error message is Displayed when trying to create user with null values");
			return true;
		}else {
			return false;
		}
	}
	
	public void checkNewUserCreation() throws InterruptedException {
		SoftAssert soft=new SoftAssert();
		Thread.sleep(3000);
		System.out.println("inside check new user page");
		fNameBox.click();
		fNameBox.sendKeys("Automation");
		System.out.println("inside check new user page1");
		lNameBox.click();
		lNameBox.sendKeys("User");
		jobTitle.click();
		jobTitle.sendKeys("technician");
		createUserPage_Title.click();//hiding keyboard
		//((HidesKeyboard) driver).hideKeyboard();
		createButton.click();
		soft.assertTrue(createYourPinText.isDisplayed());
		log.info("Create Your Pin text is Displayed");
		enter_pin();
		soft.assertTrue(confirmYourPinText.isDisplayed());
		log.info("Confirm Your Pin text is Displayed");
		//Entering Wrong pin in Confirm pin Screen
		one.click();
		two.click();
		three.click();
		two.click();
		one.click();
		three.click();
		soft.assertTrue(errorText.isDisplayed()&&pinDoNotMatchText.isDisplayed());
		log.info("Error & The pin code do not match text is displayed");
		acceptButton.click();
		enter_pin();
		soft.assertTrue(almostDoneText.isDisplayed());
		log.info("Almost done message displayed...");
		closeBtn.get(4).click();
		soft.assertAll();
		
	}
	
	public void enter_pin() {
		one.click();
		two.click();
		three.click();
		four.click();
		five.click();
		six.click();
	}

}
