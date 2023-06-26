package flutter.Truvideo.Pages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MessagesListPage extends UtilityClass {
	AppiumDriver<WebElement> driver;

	public MessagesListPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Message")
	@iOSXCUITFindBy(accessibility = "Message")
	private WebElement messages_Title;

	public WebElement getMessage_Title() {
		return messages_Title;
	}

	@AndroidFindBy(accessibility = "MY")
	private WebElement myFilter;

	@AndroidFindBy(accessibility = "MY ACTIVE")
	private WebElement myActiveFilter;

	@AndroidFindBy(accessibility = "ALL")
	private WebElement allFilter;

	@AndroidFindBy(accessibility = "ALL ACTIVE")
	private WebElement allActiveFilter;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Open')]")
	private List<WebElement> status_Open;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Responded')]")
	private List<WebElement> status_Resopned;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Closed')]")
	private List<WebElement> status_Closed;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc , 'Open')  or contains(@content-desc,'Responded') or contains(@content-desc,'Closed')]")
	private List<WebElement> statusListAll;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Disha')]")
	private WebElement advisorName;

	public boolean checkFilter_AllActive() throws InterruptedException {
		allActiveFilter.click();
		Thread.sleep(3000);
		Set<String> statusList = new HashSet<String>();
		if (statusList == null || statusList.isEmpty()) {
			for (WebElement statusObject : statusListAll) {
				try {
					statusList.add(statusObject.getAttribute("content-desc"));
				} catch (Exception e) {
					statusList.add(statusObject.getAttribute("label"));
				}
			}
			for (String status : statusList) {
				if (status.contains("Open")) {
					log.info("In All Active :->Status is :->" + status);
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean checkFilter_All() throws InterruptedException {
		allFilter.click();
		Thread.sleep(3000);
		Set<String> statusList = new HashSet<String>();
		if (statusList == null || statusList.isEmpty()) {
			for (WebElement statusObject : statusListAll) {
				try {
					statusList.add(statusObject.getAttribute("content-desc"));
				} catch (Exception e) {
					statusList.add(statusObject.getAttribute("label"));
				}
			}
			for (String status : statusList) {
				if (status.contains("Open") || status.contains("Responded") || status.contains("Closed")) {
					log.info("In All :->Status is :->" + status);
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean checkFilter_My_Active() throws Exception {
		MessagingScreen messagingScreen = new MessagingScreen(driver);
		myActiveFilter.click();
		Thread.sleep(1000);
		if (!statusListAll.isEmpty()) {
			for (WebElement statusObject : statusListAll) {
				statusObject.click();
				try {
					if (messagingScreen.getConversationStatus_Open().isDisplayed() && advisorName.getAttribute("content-desc").contains(UserListPage.userName)) {
						log.info("In My Active Filter RO is of Login technician and status is Open"
								+ advisorName.getAttribute("content-desc"));
						Thread.sleep(1000);
						messagingScreen.getBackButton().click();
						log.info("Return back to Message List Screen");
					}
				} catch (Exception e) {
					if (messagingScreen.getConversationStatus_Open().isDisplayed() && advisorName.getAttribute("label").contains(UserListPage.userName)) {
						log.info("In My Active Filter RO is of Login technician and status is Open" 
					               + advisorName.getAttribute("label"));
						Thread.sleep(1000);
						messagingScreen.getBackButton().click();
						log.info("Return back to Message List Screen");
					}
					messagingScreen.getBackButton().click();
				}
			}
			return true;
		} else {
			log.info("The RO in My Active Filter is not of Login technician or status is not open");
			messagingScreen.getBackButton().click();
			return false;
		}
	}
	
	public boolean checkFilter_My() throws Exception {
		MessagingScreen messagingScreen = new MessagingScreen(driver);
		myFilter.click();
		Thread.sleep(1000);
		if (!statusListAll.isEmpty()) {
			for (WebElement statusObject : statusListAll) {
				statusObject.click();
				try {
					if (advisorName.getAttribute("content-desc").contains(UserListPage.userName)) {
						log.info("The RO in My Filter is of Login technician"
								+ advisorName.getAttribute("content-desc"));
						Thread.sleep(1000);
						messagingScreen.getBackButton().click();
						log.info("Return back to Message List Screen");
					}
				} catch (Exception e) {
					if (advisorName.getAttribute("label").contains(UserListPage.userName)) {
						log.info("The RO in My Filter is of Login technician" 
					               + advisorName.getAttribute("label"));
						Thread.sleep(1000);
						messagingScreen.getBackButton().click();
						log.info("Return back to Message List Screen");
					}
					messagingScreen.getBackButton().click();
				}
			}
			return true;
		} else {
			log.info("The RO in My Filter is not of Login technician");
			messagingScreen.getBackButton().click();
			return false;
		}
	}
	
	public boolean navigationToMessagingScreen() {
		statusListAll.get(0).click();
		MessagingScreen messagingScreen = new MessagingScreen(driver);
		if(messagingScreen.getMessage_Title().isDisplayed()) {
			log.info("User is navigated to the messaging screen");
			return true;
		}else {
			log.info("User is anable to navigate to the messaging screen");
			return false;
		}
	}
	
}
