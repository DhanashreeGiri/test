package flutter.Truvideo.POM;

import org.openqa.selenium.WebElement;

import flutter.Truvideo.Pages.AddOrderPage;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class POM_UserListPage  {
	
	public POM_UserListPage(AppiumDriver<WebElement> driver) {
		//super(driver);
	}
	
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	public static WebElement searchBar;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Disha Gupta\"]")
	public static WebElement userDishaGupta;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]")
	public static WebElement threeDotButton;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Create user\"]")
	public static WebElement createUser;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Change dealer\"]")
	public static WebElement changeDealer;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"YES\"]")
	public static WebElement YesButton;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"NO\"]")
	public static WebElement NoButton;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"DEMO Main Street Toyota\"]")
	public static WebElement dealerName;
	
	/*
	 * @AndroidFindBy(accessibility = "Orders") public static WebElement
	 * orders_PageTitle;
	 */
	
	@AndroidFindBy(accessibility = "1")
	public static WebElement one;
	
	@AndroidFindBy(accessibility = "2")
	public static WebElement two;
	
	@AndroidFindBy(accessibility = "3")
	public static WebElement three;
	
	@AndroidFindBy(accessibility = "4")
	public static WebElement four;
	
	@AndroidFindBy(accessibility = "5")
	public static WebElement five;
	
	@AndroidFindBy(accessibility = "6")
	public static WebElement six;
	
	@AndroidFindBy(accessibility = "7")
	public static WebElement seven;
	
	@AndroidFindBy(accessibility = "8")
	public static WebElement eight;
	
	@AndroidFindBy(accessibility = "9")
	public static WebElement nine;
	
	@AndroidFindBy(accessibility = "NO")
	public static WebElement biometric_no;
	
	@AndroidFindBy(accessibility = "Error")
	public static WebElement errorPin;
	
	@AndroidFindBy(accessibility = "Invalid pin code")
	public static WebElement invalidPinCode;
	
	@AndroidFindBy(accessibility = "OK")
	public static WebElement okButton;

}
