package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EditOrderPage extends UtilityClass{
	AppiumDriver<WebElement> driver;
	
	public EditOrderPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Edit Order")
	 @iOSXCUITFindBy(accessibility = "Edit Order" )
	private WebElement editOrder_Title;
	
	public WebElement getEditOrderTitle() {
		return editOrder_Title;
	}
	
	@AndroidFindBy(accessibility = "Fleet Customer")
	private WebElement fleetCustomer;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	private WebElement companyName;

}
