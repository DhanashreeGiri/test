package flutter.Truvideo.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UserListPage extends UtilityClass {
	AppiumDriver<WebElement> driver;

	public UserListPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.view.View[@index='1']")
	private List<WebElement> reFreshButton;// index=0

	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement searchBar;

	@AndroidFindBy(accessibility = "NO USERS FOUND")
	private WebElement noUserFoundMessage;

	@AndroidFindBy(xpath = "//android.view.View[@index='4']")
	private WebElement cancelButton_search;

	@AndroidFindBy(accessibility = "Hello there Disha Gupta")
	private WebElement helloThereDisha_Text;

	@AndroidFindBy(accessibility = "Please type your Personal Pin Code to login")
	private WebElement pleaseEnterPin_text;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Disha Gupta\"]")
	private WebElement userDishaGupta;

	/*
	 * String nameText = "Disha Gupta"; String xpathExpression =
	 * "//android.view.View[@content-desc='" + nameText + "']"; private WebElement
	 * userName = driver.findElement(By.xpath(""+xpathExpression));
	 */
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private List<WebElement> x_button;// index=3

	@AndroidFindBy(xpath = "//android.view.View[@index='2']")
	private List<WebElement> threeDotButton;// index=0

	@AndroidFindBy(accessibility = "Create user")
	private WebElement createUser;

	@AndroidFindBy(accessibility = "Change dealer")
	private WebElement changeDealer;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"YES\"]")
	private WebElement YesButton;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"NO\"]")
	private WebElement NoButton;

	@AndroidFindBy(accessibility = "DEMO Main Street Toyota")
	private WebElement dealerName;

	public WebElement getDealerName() {
		return dealerName;
	}

	/*
	 * @AndroidFindBy(accessibility = "Orders") public static WebElement
	 * orders_PageTitle;
	 */

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

	@AndroidFindBy(accessibility = "NO")
	private WebElement biometric_no;

	@AndroidFindBy(accessibility = "Error")
	private WebElement errorPin;

	@AndroidFindBy(accessibility = "Invalid pin code")
	private WebElement invalidPinCode;

	@AndroidFindBy(accessibility = "OK")
	private WebElement okButton;

	@AndroidFindBy(accessibility = "Are you sure?")
	private WebElement areYouSure_text;

	@AndroidFindBy(accessibility = "YES")
	private WebElement yesButton;

	@AndroidFindBy(accessibility = "NO")
	private WebElement noButton;

	public boolean checkVisibleText_Icons() throws Exception {
		Thread.sleep(1000);
		if (dealerName.isDisplayed() && reFreshButton.get(0).isDisplayed() && searchBar.isDisplayed()) {
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

	public boolean check_VisibleText_PersonalPinScreen() throws Exception {
		searchUser();
		if (helloThereDisha_Text.isDisplayed() && pleaseEnterPin_text.isDisplayed()) {
			log.info("All text are displayed on Personal Pin Screen");
			x_button.get(3).click();
			return true;
		} else {
			log.info(" Text are not displayed on Personal Pin Screen");
			return false;
		}
	}

	public boolean selectUserToLogin_WitInvalidPin() throws Exception {
		searchUser();
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
			x_button.get(3).click();
			return true;
		} else {
			log.info("User login failed");
			return false;

		}
	}

	public boolean selectUserToLogin_WithValidPin() throws Exception {
		Thread.sleep(2000);
		searchUser();
		Thread.sleep(3000);
		one.click();
		two.click();
		three.click();
		four.click();
		five.click();
		six.click();
		biometric_no.click();
		RO_ListPage roListpage = new RO_ListPage(driver);
		Thread.sleep(3000);
		if (roListpage.getOrderPageTitle().isDisplayed()) {
			log.info("User logged in successfully and Navigating to the RO List Page");
			return true;
		} else {
			log.info("User login failed");
			return false;

		}
	}

	public void searchUser() throws Exception {
		Thread.sleep(1000);
		searchBar.click();
		searchBar.clear();
		searchBar.sendKeys("Disha Gupta");
		Thread.sleep(4);
		userDishaGupta.click();
	}
	
	public boolean checkCreateUserFunction() throws InterruptedException {
		CreateNewUserPage newUser = new CreateNewUserPage(driver);
		threeDotButton.get(0).click();
		createUser.click();
		newUser.getCreateUserPage_Title().click();//hiding Keyboard
		//((HidesKeyboard) driver).hideKeyboard();
		//Thread.sleep(5000);
		//CreateNewUserPage newUser = new CreateNewUserPage(driver);
		if (newUser.getCreateUserPage_Title().isDisplayed()) {
			log.info("User is navigated to the Create User page");
			//newUser.getCreateUserPage_Title().click();//hiding keyboard
			//Thread.sleep(5000);
			//newUser.getCancelButton().click();
			return true;
		} else {
			log.info("User is not able to navigate to the Create User page");
			return false;
		}
	}

	public boolean check_TextsUnderChangeDealerFunction() {
		threeDotButton.get(0).click();
		changeDealer.click();
		if (changeDealer.isDisplayed() && areYouSure_text.isDisplayed()) {
			noButton.click();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean check_ChangeDealerFunction() {
		threeDotButton.get(0).click();
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
