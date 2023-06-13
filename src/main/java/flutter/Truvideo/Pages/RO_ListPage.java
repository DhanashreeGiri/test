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

public class RO_ListPage extends UtilityClass {
	AppiumDriver<WebElement> driver;

	public RO_ListPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Orders")
	private WebElement orders_PageTitle;

	public WebElement getOrderPageTitle() {
		return orders_PageTitle;
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	private WebElement seachButton;// modified

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]")
	private WebElement reFreshButton;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]")
	private WebElement profileIcon;

	@AndroidFindBy(xpath = "//android.view.View[2][@clickable='true']")
	private WebElement screentap; // require when profile icon is opened

	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement seachBar;

	@AndroidFindBy(xpath = "//android.view.View[@index='1']")
	private WebElement seachBarCancelButton;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View")
	private WebElement searchBarBackButton;// modified

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,\"752\")]")
	private List<WebElement> searchResults;// new//make it common for IOS & Android

	@AndroidFindBy(accessibility = "Chat")
	private WebElement chatFooterTab;

	@AndroidFindBy(accessibility = "Messages")
	private WebElement messageFooterTab;

	@AndroidFindBy(accessibility = "Chat")
	private WebElement contactsFooterTab;

	@AndroidFindBy(accessibility = "Orders")
	private WebElement ordersFooterTab;

	@AndroidFindBy(accessibility = "CREATE")
	private WebElement createButton;

	@AndroidFindBy(accessibility = "ALL")
	private WebElement allFilter;

	@AndroidFindBy(accessibility = "MY")
	private WebElement myFilter;

	@AndroidFindBy(accessibility = "NEW")
	private WebElement newFilter;

	@AndroidFindBy(accessibility = "REJECTED")
	private WebElement rejectedFilter;

	@AndroidFindBy(xpath = "//android.widget.Button")
	private List<WebElement> filterStatusList;

	@AndroidFindBy(xpath = "//android.view.View[@index='13']")
	private WebElement technicianName;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	private WebElement backButton_RODetails;// index 3

	public boolean checkAllFooterTab_and_HederTabs() throws Exception {
		Thread.sleep(1000);
		log.info("inside Footer tab method");
		if (chatFooterTab.isDisplayed() && messageFooterTab.isDisplayed() && contactsFooterTab.isDisplayed()
				&& createButton.isDisplayed() && reFreshButton.isDisplayed() && profileIcon.isDisplayed()) {
			log.info("All Footer tabs, Header tabs & Create button are Present on RO Screen");

			return true;
		} else {
			log.info("All Footer tabs, Header tabs & Create button are not Present on RO Screen");
			return false;
		}
	}

	public boolean checkSearchROFunction(String roNumber) throws InterruptedException {
		seachButton.click();
		searchBarBackButton.click();
		log.info("ROSearch--  SearchBar Closed ");
		seachButton.click();
		seachBar.sendKeys(roNumber);
		// ((HidesKeyboard) driver).hideKeyboard();
		Thread.sleep(4000);
		if (searchResults.get(0).getAttribute("content-desc").contains(seachBar.getText())) {
			log.info("Search function is working properly: contains ro number -> " + seachBar.getText());
			searchBarBackButton.click();
			return true;
		} else {
			return false;
		}
	}

	public boolean checkRO_Status_New() throws Exception {
		newFilter.click();
		Thread.sleep(1000);
		Set<String> statusList = new HashSet<String>();
		for (WebElement statusObject : filterStatusList) {
			statusList.add(statusObject.getAttribute("content-desc"));
		}
		for (String status : statusList) {
			if (status.contains("New")) {
				log.info("In new :->Status is :->" + status);
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public boolean checkRO_Status_Rejected() throws Exception {
		rejectedFilter.click();
		Thread.sleep(1000);
		Set<String> statusList = new HashSet<String>();
		for (WebElement statusObject : filterStatusList) {
			statusList.add(statusObject.getAttribute("content-desc"));
		}
		for (String status : statusList) {
			if (status.contains("Rejected")) {
				log.info("In Rejected :->Status is :->" + status);
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public boolean checkRO_Status_All() throws Exception {
	    allFilter.click();
	    Thread.sleep(2000);

	    for (WebElement statusObject : filterStatusList) {
	        if (!(statusObject.getAttribute("content-desc").equals("Sent")
	                || statusObject.getAttribute("content-desc").equals("New")
	                || statusObject.getAttribute("content-desc").equals("For Review")
	                || statusObject.getAttribute("content-desc").equals("Viewed"))) {
	            return false;
	        }
	    }

	    return true;
	}

	public boolean checkRO_Status_My() throws Exception {
		myFilter.click();
		Thread.sleep(1000);
		for (WebElement statusObject : filterStatusList) {
			statusObject.click();
			if (technicianName.equals("￼Name: Disha Gupta")) {
				log.info("The RO in My Filter is of Login technician");
				Thread.sleep(1000);
				backButton_RODetails.click();
				log.info("Return back to ROList screen");
				System.out.println("Return back to ROList screen");
			}
			backButton_RODetails.click();
			return true;
		}
		{
			log.info("The RO in My Filter is of Login technician");
			return false;
		}
	}

	public boolean checkNavigationTo_Chat() throws InterruptedException {
		Thread.sleep(2000);
		chatFooterTab.click();
		ChatListPage chatPage = new ChatListPage(driver);
		if (chatPage.getChat_Title().isDisplayed()) {
			log.info("user is navigated to the chat screen");
			return true;
		} else {
			return false;
		}
	}

	public boolean checkNavigationTo_Messages() {
		messageFooterTab.click();
		MessagesListPage messagePage = new MessagesListPage(driver);
		if (messagePage.getMessage_Title().isDisplayed()) {
			log.info("user is navigated to the Messages screen");
			return true;
		} else {
			return false;
		}
	}

	public boolean checkNavigationTo_Contacts() {
		contactsFooterTab.click();
		ContactsListPage contactPage = new ContactsListPage(driver);
		if (contactPage.getContacts_Title().isDisplayed()) {
			log.info("user is navigated to the Contacts screen");
			return true;
		} else {
			return false;
		}
	}

	public boolean checkNavigationBackTo_Order() {
		ordersFooterTab.click();
		if (orders_PageTitle.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkNavigationToProfileIcon() throws InterruptedException {
		Thread.sleep(6000);
		profileIcon.click();
		log.info("Clicked on profile icon");
		ProfileIconScreen profileScreen = new ProfileIconScreen(driver);
		if (profileScreen.getLogOut_Button().isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkNavigationTo_AddOrder_Page() {
		createButton.click();
		AddOrderPage addOrderPage = new AddOrderPage(driver);
		if (addOrderPage.getAddOrder_Title().isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void createROcheckDefaultCountry()
	{
		createButton.click();
		log.info("Clicked on Create RO button");
		
	}
}
