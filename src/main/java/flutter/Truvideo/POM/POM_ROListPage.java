package flutter.Truvideo.POM;

import java.util.List;

import org.openqa.selenium.WebElement;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class POM_ROListPage extends UtilityClass {

	public POM_ROListPage(AppiumDriver<WebElement> driver) {
		super(driver);
		
	}
	
	@AndroidFindBy(accessibility = "Orders")
	public static WebElement orders_PageTitle;
	
	@AndroidFindBy(xpath="//android.view.View[@index='1']")
	public static List<WebElement>  seachButton;// index 0
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	public static WebElement  seachBar;
	
	@AndroidFindBy(xpath="//android.view.View[@index='1']")
	public static WebElement  seachBarCancelButton;
	
	@AndroidFindBy(xpath="//android.view.View[@index='0']")
	public static List<WebElement>  seachBarBackButton;//index 3
	
	
	@AndroidFindBy(xpath="//android.view.View")
	public static List<WebElement>  firstSearchresult;//index 6
	
	@AndroidFindBy(accessibility = "Chat")
	public static WebElement chatFooterTab;
	
	@AndroidFindBy(accessibility = "Messages")
	public static WebElement messageFooterTab;
	
	@AndroidFindBy(accessibility = "Chat")
	public static WebElement contactsFooterTab;
	
	@AndroidFindBy(accessibility = "CREATE")
	public static WebElement createButton;
	
	@AndroidFindBy(accessibility = "ALL")
	public static WebElement allFilter;
	
	@AndroidFindBy(accessibility = "MY")
	public static WebElement myFilter;
	
	@AndroidFindBy(accessibility = "NEW")
	public static WebElement newFilter;
	
	@AndroidFindBy(accessibility = "REJECTED")
	public static WebElement rejectedFilter;
	
	@AndroidFindBy(xpath = "//android.widget.Button")
	public static List<WebElement> filterStatusList;
	
	@AndroidFindBy(xpath = "//android.view.View[@index='13']")
	public static WebElement technicianName;
	
	/*
	 * @AndroidFindBy(xpath = "//android.view.View/android.view.View[1]") public
	 * static List<WebElement> backButton_RODetails;//index 3
	 */	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	public static WebElement backButton_RODetails;//index 3

}
