package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ChatListPage extends UtilityClass {
	AppiumDriver<WebElement> driver;
	
	public ChatListPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Chat")
	@iOSXCUITFindBy(accessibility = "Chat")
	private WebElement chat_Title;
	
	@AndroidFindBy(accessibility = "CREATE")
	private WebElement createChatButton;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Yash Modi')]")
	private WebElement yashUser;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Yash Modi')]/android.view.View")
	private WebElement callingIcon;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	private WebElement searchButton;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Adam TESTING TESTING\"]")
	private WebElement adamTesting;
	
	@AndroidFindBy(xpath = "//android.view.View/android.widget.EditText")
	private WebElement textbox;
	
	
	public WebElement getChat_Title() {
		return chat_Title;
	}
	
	public void navigateTocallingFunctionButton()
	{
		JointheRoomPage joinpage=new JointheRoomPage(driver);
		callingIcon.click();
		log.info("You clicked on calling button of Selected User :-Navigating to JOIN THE ROOM page");
		joinpage.verifyJoinTheRoom();
	}
	
	public void createNewChat()
	{
		createChatButton.click();
		log.info("Clicked on Create button : All User List is displaying");
		adamTesting.click();
		log.info("Clicked on Adam Test User name:-  Opening Adam message screen");
		textbox.sendKeys("Hello Adams");
		
		
	}
	
	public void serchFunctionOfUserChat(String userName)
	{
		searchButton.click();
		log.info("Clicked on Search button");
		searchButton.sendKeys(userName);
		log.info(userName+" is displaying");
	}

}

