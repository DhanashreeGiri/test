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
	
	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[1]")
	private WebElement order_textBox;
	
	@AndroidFindBy(xpath="//android.view.View[7]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@index='8']")
	private WebElement advisor_DropDown;
	
	@AndroidFindBy(accessibility = "Advisor")
	@iOSXCUITFindBy(accessibility = "Advisor")
	private WebElement advisor_Title;
	
	//@AndroidFindBy(xpath = "//android.widget.EditText")
	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@index='3']")
	//private WebElement searchBox_advisor;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Disha Gupta')]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@label,'Disha')]")
	private WebElement DishaGupta_advisor;
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@index='3']")
	private WebElement advisor_SearchBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[2]")
	private WebElement firstName_textBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[3]")
	private WebElement lastName_textBox;
	
	@AndroidFindBy(xpath="//android.widget.Button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton")
	private WebElement country_DropDown;
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private WebElement country_SearchBar;
	
	@AndroidFindBy(accessibility = "//android.widget.ImageView[contains(@content-desc,'United States')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='United States 1']")
	private WebElement unitedState;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[4]")
	private WebElement mobileTextBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[4]")
	private WebElement mobileNumber_enter;
	
	@AndroidFindBy(xpath="//android.widget.EditText[5]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[5]")
	private WebElement eMail_textBox;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[5]")
	private WebElement email_enter;
	
	@AndroidFindBy(accessibility = "Do not send video directly to customer")
	@iOSXCUITFindBy(accessibility = "Do not send video directly to customer")
	private WebElement checkBox_DoNotSendDirectly;
	
	@AndroidFindBy(accessibility = "CREATE")
	@iOSXCUITFindBy(accessibility = "CREATE")
	private WebElement createButton;
	
	@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Required\"])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[1]")
	private WebElement required_order;
	
	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[2]")
	private WebElement required_advisor;
	
	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[3]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[3]")
	private WebElement required_firstName;
	
	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[4]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[4]")
	private WebElement required_lastName;
	
	public boolean checkErrorMessage() {
		createButton.click();
		if(required_order.isDisplayed()&&required_advisor.isDisplayed()&&required_firstName.isDisplayed()
				&&required_lastName.isDisplayed()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean checkCreateOrder() throws Exception {
		Thread.sleep(2000);
		order_textBox.click();
		order_textBox.sendKeys("RO"+randomNumber());
		String newRo=order_textBox.getText();	
		advisor_DropDown.click();
		Thread.sleep(2000);
		advisor_Title.click();
		advisor_SearchBox.sendKeys("Disha Gupta");
		Thread.sleep(2000);
		advisor_SearchBox.click();//need to delete in next build
		advisor_SearchBox.sendKeys("Disha Gupta");
		DishaGupta_advisor.click();
		Thread.sleep(2000);
		firstName_textBox.click();
		firstName_textBox.sendKeys("First"+randomWord());
		addOrder_Title.click();//hiding keyboard	
		lastName_textBox.click();
		lastName_textBox.sendKeys("Last"+randomWord());
		addOrder_Title.click();//hiding keayboard
		//country_DropDown.click();
		//country_SearchBar.sendKeys("united");
		//unitedState.click();
		mobileTextBox.click();
		//mobileTextBox.sendKeys("7812059487");
		mobileNumber_enter.sendKeys("7812059487");
		addOrder_Title.click();//hiding keayboard
		eMail_textBox.click();
		email_enter.sendKeys(randomWord()+"abc"+"@gmail.com");
		addOrder_Title.click();//hiding keayboard
		createButton.click();
		Thread.sleep(5000);
		OrderDetailsPage orderDetails=new OrderDetailsPage(driver);
		Thread.sleep(10000);
		if(orderDetails.getStatus_New().isDisplayed()) {
			log.info("New Ro Created Successfully");
			return true;
		}else {
			log.info("New Ro Creation Unsuccessfull");
			return false;
		}
		
	}

