package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddOrderPage extends UtilityClass{
	AppiumDriver<WebElement> driver;
	String roNumber="";

	public AddOrderPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Add Order")
	@iOSXCUITFindBy(accessibility = "Add Order")
	private WebElement addOrder_Title;
	
	public WebElement getAddOrder_Title() {
		return addOrder_Title;
	}
	
	@AndroidFindBy(accessibility = "CANCEL")
	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement cancelButton;
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='2']")
	private WebElement order_textBox;
	
	@AndroidFindBy(xpath="//android.view.View[@index='6']")
	private WebElement advisor_DropDown;
	
	@AndroidFindBy(accessibility = "Advisor")
	private WebElement advisor_Title;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement searchBox_advisor;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Disha Gupta\r\n"
			+ "disha.gupta@5exceptions.com\"]")
	private WebElement DishaGupta_advisor;
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	private WebElement advisor_SearchBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index='9']")
	private WebElement firstName_textBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index='12']")
	private WebElement lastName_textBox;
	
	@AndroidFindBy(xpath="//android.widget.Button")
	private WebElement country_DropDown;
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	private WebElement country_SearchBar;
	
	@AndroidFindBy(accessibility = "United States 1")
	private WebElement unitedState;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='17']")
	private WebElement mobileTextBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index='17']")
	private WebElement eMail_textBox;
	
	@AndroidFindBy(accessibility = "Do not send video directly to customer")
	private WebElement checkBox_DoNotSendDirectly;
	
	@AndroidFindBy(accessibility = "CREATE")
	private WebElement createButton;
	
	public boolean checkCreateOrder() throws Exception {
		Thread.sleep(2000);
		order_textBox.sendKeys("985421");
		advisor_DropDown.click();
		advisor_Title.click();
		advisor_SearchBox.sendKeys("Disha Gupta");
		DishaGupta_advisor.click();
		Thread.sleep(2000);
		firstName_textBox.sendKeys("abcd");
		lastName_textBox.sendKeys("xyz");
		addOrder_Title.click();//hiding keayboard
		country_DropDown.click();
		country_SearchBar.sendKeys("united");
		unitedState.click();
		mobileTextBox.sendKeys("7812059487");
		addOrder_Title.click();//hiding keayboard
		eMail_textBox.sendKeys(generateRandomString(8)+"abc"+"@gmail.com");
		addOrder_Title.click();//hiding keayboard
		createButton.click();
			
		return true;
	}

}
