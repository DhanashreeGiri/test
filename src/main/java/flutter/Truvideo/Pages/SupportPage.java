package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SupportPage extends UtilityClass {
	
AppiumDriver<WebElement> driver;
	
	public SupportPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility="Support")
	private WebElement supportButton;
	
	@AndroidFindBy(accessibility = "CONTINUE")
	private WebElement continueButton;
	
	@AndroidFindBy(xpath = "//android.view.View[3]/android.widget.EditText[1]")
	private WebElement emailTextbox;
	
	@AndroidFindBy(xpath = "//android.view.View[3]/android.widget.EditText[2]")
	private WebElement phoneTextbox;
	
	@AndroidFindBy(xpath = "//android.view.View[3]/android.widget.EditText[3]")
	private WebElement commentTextbox;
	
	@AndroidFindBy(accessibility = "SEND TO SUPPORT")
	private WebElement sendToSupportButton;
	
	@AndroidFindBy(accessibility = "Application Settings")
	private WebElement headerClick;
	
	@AndroidFindBy(accessibility = "Successfully sent application settings to support.")
	private WebElement successMessage;
	
	@AndroidFindBy(accessibility = "ACCEPT")
	private WebElement acceptButton;
	
	
	public boolean checkSupportFunctionality(String email,String phone,String comment) throws InterruptedException
	{
		supportButton.click();
		log.info("Clicked on support button :inside Profile Icon");
		
		continueButton.click();
		log.info("Clicked on Continue Button");
		Thread.sleep(30000);
		emailTextbox.click();
		emailTextbox.sendKeys(email);
		log.info("Email Address is written");
		phoneTextbox.click();
		phoneTextbox.sendKeys(phone);
		log.info("Phone number is entered");
		commentTextbox.click();
		commentTextbox.sendKeys(comment);
		log.info("Written some Comment");
		headerClick.click();
		sendToSupportButton.click();
		log.info("Sended Health Status to Support");
		Thread.sleep(3000);
		if(acceptButton.isDisplayed()) {
			acceptButton.click();
			return true;
		}else {
			return false;
		}
	}

}
