package flutter.Truvideo.Pages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class UserListPage extends UtilityClass {
	AppiumDriver<WebElement> driver;

	public UserListPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	static String userName;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[2]")
	private WebElement reFreshButton;//modified

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(accessibility="Search")
	private WebElement searchBar;

	@AndroidFindBy(accessibility = "NO USERS FOUND")
	@iOSXCUITFindBy(accessibility="NO USERS FOUND")
	private WebElement noUserFoundMessage;

	@AndroidFindBy(xpath = "//android.view.View[@index='4']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[4]")
	private WebElement cancelButton_search;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Hello there')]")//modified
	@iOSXCUITFindBy(accessibility="Hello there Disha Gupta")
	private WebElement helloThere_UserText;

	@AndroidFindBy(accessibility = "Please type your Personal Pin Code to login")
	@iOSXCUITFindBy(accessibility="Please type your Personal Pin Code to login")
	private WebElement pleaseEnterPin_text;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Disha Gupta\"]")
	@iOSXCUITFindBy(accessibility="Disha Gupta")
	private WebElement userDishaGupta;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View")
	private List<WebElement>selectUser_Login;//modified

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement x_button;//modified

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[3]")
	private WebElement threeDotButton;// modified

	@AndroidFindBy(accessibility = "Create user")
	@iOSXCUITFindBy(accessibility="Create user")
	private WebElement createUser;

	@AndroidFindBy(accessibility = "Change dealer")
	@iOSXCUITFindBy(accessibility="Change dealer")
	private WebElement changeDealer;

	@AndroidFindBy(accessibility = "DEMO Main Street Toyota")
	@iOSXCUITFindBy(accessibility = "DEMO-Main Street")
	private WebElement dealerName;

	public WebElement getDealerName() {
		return dealerName;
	}

	@AndroidFindBy(accessibility = "0")
	@iOSXCUITFindBy(accessibility = "0")
	private WebElement zero;
	
	@AndroidFindBy(accessibility = "1")
	@iOSXCUITFindBy(accessibility = "1")
	private WebElement one;

	@AndroidFindBy(accessibility = "2")
	@iOSXCUITFindBy(accessibility = "2")
	private WebElement two;

	@AndroidFindBy(accessibility = "3")
	@iOSXCUITFindBy(accessibility = "3")
	private WebElement three;

	@AndroidFindBy(accessibility = "4")
	@iOSXCUITFindBy(accessibility = "4")
	private WebElement four;

	@AndroidFindBy(accessibility = "5")
	@iOSXCUITFindBy(accessibility = "5")
	private WebElement five;

	@AndroidFindBy(accessibility = "6")
	@iOSXCUITFindBy(accessibility = "6")
	private WebElement six;

	@AndroidFindBy(accessibility = "7")
	@iOSXCUITFindBy(accessibility = "7")
	private WebElement seven;

	@AndroidFindBy(accessibility = "8")
	@iOSXCUITFindBy(accessibility = "8")
	private WebElement eight;

	@AndroidFindBy(accessibility = "9")
	@iOSXCUITFindBy(accessibility = "9")
	private WebElement nine;

	@AndroidFindBy(accessibility = "NO")
	@iOSXCUITFindBy(accessibility = "NO")
	private WebElement biometric_no;

	@AndroidFindBy(accessibility = "Error")
	@iOSXCUITFindBy(accessibility = "Error")
	private WebElement errorPin;

	@AndroidFindBy(accessibility = "Invalid pin code")
	@iOSXCUITFindBy(accessibility = "Invalid pin code")
	private WebElement invalidPinCode;

	@AndroidFindBy(accessibility = "OK")
	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement okButton;

	@AndroidFindBy(accessibility = "Are you sure?")
	@iOSXCUITFindBy(accessibility = "Are you sure?")
	private WebElement areYouSure_text;

	@AndroidFindBy(accessibility = "YES")
	@iOSXCUITFindBy(accessibility = "YES")
	private WebElement yesButton;

	@AndroidFindBy(accessibility = "NO")
	@iOSXCUITFindBy(accessibility = "NO")
	private WebElement noButton;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	@iOSXCUITFindBy(accessibility = "Allow")
	private WebElement notificationsAllow;

	public boolean checkVisibleText_Icons() throws Exception {
		Thread.sleep(1000);
		if (dealerName.isDisplayed() && reFreshButton.isDisplayed() && searchBar.isDisplayed()) {
			log.info("Dealer Name and refresh button is Displayed");
			return true;
		} else {
			log.info("Dealer Name and refresh button is Not Displayed");
			return false;
		}

	}

	public boolean checkForInvalidUser() throws InterruptedException {
		Thread.sleep(1000);
		searchBar.click();
		searchBar.sendKeys("mnvb");
		if (noUserFoundMessage.isDisplayed()) {
			log.info("No User Found message is Displayed");
			cancelButton_search.click();
			return true;
		} else {
			log.info("No User Found message Not Displayed");
			return false;
		}

	}

	public boolean check_VisibleText_PersonalPinScreen(String user) throws Exception {
		searchUser(user);
		if (helloThere_UserText.isDisplayed() && pleaseEnterPin_text.isDisplayed()) {
			log.info("All text are displayed on Personal Pin Screen");
			x_button.click();
			return true;
		} else {
			log.info(" Text are not displayed on Personal Pin Screen");
			return false;
		}
	}

	public boolean selectUserToLogin_WitInvalidPin(String user) throws Exception {
		searchUser(user);
		Thread.sleep(2000);
		two.click();
		two.click();
		three.click();
		four.click();
		five.click();
		four.click();
		if (errorPin.isDisplayed() && invalidPinCode.isDisplayed()) {
			log.info("Error message displayed while entering invalid pin");
			okButton.click();
			Thread.sleep(2000);
			x_button.click();
			return true;
		} else {
			log.info("User login failed");
			return false;

		}
	}

	public boolean selectUserToLogin_WithValidPin(String user) throws Exception {
		Thread.sleep(2000);
		searchUser(user);
		Thread.sleep(3000);
		one.click();
		two.click();
		three.click();
		four.click();
		five.click();
		six.click();
		try {
			if (biometric_no.isDisplayed()) {
				biometric_no.click();
				log.info("Biometric -> 'NO' clicked");
			}
		}catch(NoSuchElementException e) {
		log.info("Biometric popup Not present");
		}
		try {
			if (notificationsAllow.isDisplayed()) {
				notificationsAllow.click();
				log.info("Notifications allowed.");
			}
		}catch(NoSuchElementException e) {
		log.info("Notifications allowed pop up not displayed");
		}
		RO_ListPage roListpage = new RO_ListPage(driver);
		Thread.sleep(3000);
		if (roListpage.getCreateButton().isDisplayed()) {
			log.info("User logged in successfully and Navigating to the RO/Prospects List Page");
			return true;
		} else {
			log.info("User login failed");
			return false;

		}
	}

	public void searchUser(String user) throws Exception {
		Thread.sleep(1000);
		searchBar.click();
		searchBar.clear();
		searchBar.sendKeys(user);
		userName=searchBar.getText();
		Thread.sleep(4);
		selectUser_Login.get(0).click();
		//userDishaGupta.click();
	}
	
	public boolean checkCreateUserFunction() throws InterruptedException {
		CreateNewUserPage newUser = new CreateNewUserPage(driver);
		threeDotButton.click();
		createUser.click();
		newUser.getfNameBox().click();
		newUser.getCreateUserPage_Title().click();
		//((HidesKeyboard) driver).hideKeyboard();
		if (newUser.getCreateUserPage_Title().isDisplayed()) {
			log.info("User is navigated to the Create User page");
			return true;
		} else {
			log.info("User is not able to navigate to the Create User page");
			return false;
		}
	}

	public boolean check_TextsUnderChangeDealerFunction() {
		CreateNewUserPage newUser = new CreateNewUserPage(driver);
		newUser.getCancelButton().click();
		threeDotButton.click();
		changeDealer.click();
		if (changeDealer.isDisplayed() && areYouSure_text.isDisplayed()) {
			noButton.click();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean check_ChangeDealerFunction() throws InterruptedException {
		Thread.sleep(2000);
		threeDotButton.click();
        changeDealer.click();
		yesButton.click();
		DealerCodePage dealeCodePage=new DealerCodePage(driver);
		if(dealeCodePage.getHelloThereText().isDisplayed()) {
			log.info("User is On Dealer Code Page Now");
			two.click();
			four.click();
			seven.click();
			three.click();
			zero.click();
			one.click();
			return true;
		}else {
			return false;
		}
	}

}

