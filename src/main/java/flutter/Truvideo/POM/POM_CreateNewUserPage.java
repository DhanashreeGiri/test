package flutter.Truvideo.POM;

import java.util.List;

import org.openqa.selenium.WebElement;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class POM_CreateNewUserPage extends UtilityClass {

	public POM_CreateNewUserPage(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
	public static MobileElement fNameBox;

	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]")
	public static MobileElement lNameBox;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]")
	public static MobileElement jobTitle;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"CANCEL\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CANCEL\"]")
	public static MobileElement cancelButton;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"CREATE\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CREATE\"]")
	public static MobileElement createButton;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='0']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Almost done!\"]")
	public static MobileElement almostDone;
	
	@AndroidFindBy(xpath = "//*[contains(@bounds,'[30,110][150,230]')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	public static List<MobileElement> closeBtn;

}
