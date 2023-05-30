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

public class DealerCodePage extends UtilityClass {
	AppiumDriver<WebElement> driver;
	

	public DealerCodePage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Hello there")
	private WebElement helloThereText;
	
	public WebElement getHelloThereText() {
		return helloThereText;
	}
	
	@AndroidFindBy(accessibility = "Please type your Dealer Code to identify you")
	private WebElement enterDealerCodeMessage;
	
	@AndroidFindBy(xpath="//android.widget.ImageView")
	private WebElement truVideoLogo;
	
	@iOSXCUITFindBy(accessibility = "OK")
	@AndroidFindBy(accessibility = "OK")
	private   WebElement popUpOK;

	@AndroidFindBy(xpath = "//android.view.View[@clickable='true']")
	private  List<WebElement> numbers;

	@iOSXCUITFindBy(accessibility = "1")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"1\"]")
	private  WebElement ONE;

	@iOSXCUITFindBy(accessibility = "2")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"2\"]")
	private  WebElement TWO;

	@iOSXCUITFindBy(accessibility = "3")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"3\"]")
	private  WebElement THREE;

	@iOSXCUITFindBy(accessibility = "4")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"4\"]")
	private  WebElement FOUR;

	@iOSXCUITFindBy(accessibility = "5")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"5\"]")
	private  WebElement FIVE;

	@iOSXCUITFindBy(accessibility = "6")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"6\"]")
	private  WebElement SIX;

	@iOSXCUITFindBy(accessibility = "7")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"7\"]")
	private  WebElement SEVEN;

	@iOSXCUITFindBy(accessibility = "8")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"8\"]")
	private  WebElement EIGHT;

	@iOSXCUITFindBy(accessibility = "9")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"9\"]")
	private  WebElement NINE;

	@iOSXCUITFindBy(accessibility = "0")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"0\"]")
	private  WebElement ZERO;
	
	@iOSXCUITFindBy(accessibility = "Error")
	@AndroidFindBy(accessibility = "Error")
	private  WebElement errorMessage;
	
	@iOSXCUITFindBy(accessibility = "Dealer not found")
	@AndroidFindBy(accessibility = "Dealer not found")
	private  WebElement dealerNotFoundMessage;
	
	@iOSXCUITFindBy(accessibility = "OK")
	@AndroidFindBy(accessibility = "OK")
	private  WebElement oKButton;
	
	
	public boolean visibleElements_DealerCodePage() {
		if(helloThereText.isDisplayed() && enterDealerCodeMessage.isDisplayed() && 
				truVideoLogo.isDisplayed()) {
			log.info("All elements are Present on Dealer Screen");
			System.out.println("test  source treee");
			return true;
		}else {
			log.info("All elements are not Present on Dealer Screen");
			return false;
		}
	}
	
	public boolean dealerLogin_InvalidCredentials() throws InterruptedException {
		try {
	        if (popUpOK.isDisplayed()) {
	            log.info("PopUp Displayed");
	            popUpOK.click();
	        }
	    } catch (NoSuchElementException e) {
	        log.info("PopUp not present");
	    }
		TWO.click();
		SEVEN.click();
		SEVEN.click();
		ONE.click();
		ZERO.click();
		TWO.click();
		Thread.sleep(5000);
		if(errorMessage.isDisplayed() && dealerNotFoundMessage.isDisplayed()) {
			log.info("Dealer Not found message is displayed");
			oKButton.click();
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public boolean dealerLogin_ValidCredentials() throws Exception {
		try {
	        if (popUpOK.isDisplayed()) {
	            log.info("PopUp Displayed");
	            popUpOK.click();
	        }
	    } catch (NoSuchElementException e) {
	        log.info("PopUp not present");
	    }
		log.info("Entering Dealer code");
		TWO.click();
		FOUR.click();
		SEVEN.click();
		THREE.click();
		ZERO.click();
		ONE.click();
		log.info("Dealer code is entered");
		UserListPage userListpage=new UserListPage(driver);
		if(userListpage.getDealerName().isDisplayed())
		{
			log.info("Dealer name is Displayed");
			return true;
		}
		else
		{
			log.info("Dealer name is not displayed");
			return false;
		}
	
	}

}
