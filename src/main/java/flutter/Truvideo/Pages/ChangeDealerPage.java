package flutter.Truvideo.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ChangeDealerPage extends UtilityClass {
	AppiumDriver<WebElement> driver;

	public ChangeDealerPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Switch Dealer")
	@iOSXCUITFindBy(accessibility = "Switch Dealer")
	private WebElement changeDealerButton;

	@AndroidFindBy(accessibility = "Switch Dealers")
	@iOSXCUITFindBy(accessibility = "Switch Dealers")
	private WebElement headerTitle;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private WebElement searchDealerTextbox;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'BMW')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'BMW')]")
	private List<WebElement> searchResults;

	public boolean changeDealer(String dealerName) throws InterruptedException {
		Thread.sleep(2000);
		changeDealerButton.click();
		log.info("Clicked on Change Dealer button");
		Thread.sleep(2000);
		searchDealerTextbox.click();
		searchDealerTextbox.sendKeys(dealerName);
		log.info("The Dealer name is :" + dealerName);
		Thread.sleep(2000);
		if (searchDealerTextbox.getText() != null) {
			try {
				if (searchResults.get(0).getAttribute("content-desc").contains(searchDealerTextbox.getText())) {
					log.info("Dealer search is working properly: contains Dealer code -> "
							+ searchDealerTextbox.getText());
					searchResults.get(0).click();
					return true;
				}
			} catch (Exception e) {
				if (searchResults.get(0).getAttribute("label").contains(searchDealerTextbox.getText())) {
					log.info("Dealer search is working properly: contains Dealer code -> "
							+ searchDealerTextbox.getText());
					searchResults.get(0).click();
					return true;
				}
			}
		} {
		return false;
		}
	}
}