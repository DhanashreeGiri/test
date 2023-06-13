package flutter.Truvideo.POM;

import java.util.List;

import org.openqa.selenium.WebElement;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class POM_AddOrderPage extends UtilityClass {

	public POM_AddOrderPage(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(accessibility = "Add Order")
	public static WebElement addOrderScreenTitle;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index='2']")
	public static WebElement orderTextBox;
	
	@AndroidFindBy(accessibility ="Fleet Customer")
	public static WebElement fleetCustomerCheckBox;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='6']")
	public static WebElement companyNameTextBox;
	
	@AndroidFindBy(xpath ="//android.view.View[@index='9']")
	public static WebElement advisorDropDown;
	
	@AndroidFindBy(xpath ="//android.widget.EditText")
	public static WebElement advisorSearchBar;
	
	@AndroidFindBy(xpath="//android.view.View")
	public static List<WebElement> advisorDishaGupta;//index 9
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='11']")
	public static WebElement firstNameTextBox;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='13']")
	public static WebElement lastNameTextBox;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='15']")
	public static WebElement mobileTextBox;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='15']")
	public static WebElement emailTextBox;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='15']")
	public static WebElement doNotSendDirectlyCheckBox;
	
	@AndroidFindBy(accessibility ="CREATE")
	public static WebElement createButton;
	
	@AndroidFindBy(accessibility ="CANCEL")
	public static WebElement cancelButton;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.View[1]")
	public static WebElement roNumber_OrderDetails;
	


}
