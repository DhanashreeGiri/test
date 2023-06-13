package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProfileIconScreen extends UtilityClass{
   AppiumDriver<WebElement>driver;
	
   public ProfileIconScreen(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
   
   @AndroidFindBy(accessibility = "Log out")
   @iOSXCUITFindBy(accessibility = "Log out")
   private WebElement logOut_Button;
   
   public WebElement getLogOut_Button() {
	   return logOut_Button;
   }
   
}
