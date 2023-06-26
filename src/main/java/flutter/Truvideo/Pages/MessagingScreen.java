package flutter.Truvideo.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class MessagingScreen extends UtilityClass {
	AppiumDriver<WebElement> driver;

	public MessagingScreen(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(accessibility = "Messages")
	@iOSXCUITFindBy(accessibility = "Messages")
	private WebElement message_Title;
	
	public WebElement getMessage_Title() {
		return message_Title;
	}

	@AndroidFindBy(accessibility = "THIS CONVERSATION IS OPEN")
	private WebElement thisConversationIsOpen_text;
	
	public WebElement getConversationStatus_Open() {
		return thisConversationIsOpen_text;
	}

	@AndroidFindBy(accessibility = "YOU’VE ALREADY RESPONDED.")
	private WebElement youHaveAlreadyResponded_text;

	@AndroidFindBy(accessibility = "THIS CONVERSATION IS CLOSED")
	private WebElement thisConversationClosed_text;

	@AndroidFindBy(accessibility = "NO ITEMS FOUND")
	private WebElement noItemsFound_text;

	@AndroidFindBy(accessibility = "CONVERSATION STATUS")
	private WebElement conversationStatus_text;

	@AndroidFindBy(accessibility = "Responded")
	private WebElement responded_Status;

	@AndroidFindBy(accessibility = "Closed")
	private WebElement Closed_Status;

	@AndroidFindBy(accessibility = "Open")
	private WebElement Open_Status;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement messageTextBox;

	@AndroidFindBy(xpath = "//android.view.View[9]")
	private WebElement sendButton;

	@AndroidFindBy(xpath = "//android.view.View/android.view.View[4]/android.view.View/android.view.View[1]")
	private WebElement firstSentMessage;
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View[4]/android.view.View/android.view.View")
	private List<WebElement> messages_Sent_Received;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	private WebElement backButton;
	
	public WebElement getBackButton() {
		return backButton;
	}

	public boolean checkDefaultScreenDuringNewConversation() {
		if (thisConversationIsOpen_text.isDisplayed() && noItemsFound_text.isDisplayed()
				&& conversationStatus_text.isDisplayed()) {
			log.info("This conversation is Open, No itemes found, Convesation Status is displayed");
			log.info("Send button is Displayed and disabled ");
			return true;
		} else {
			return false;
		}
	}

	public boolean checkSendMessage() throws InterruptedException {
		messageTextBox.click();
		messageTextBox.sendKeys("message from Automation");
		sendButton.click();
		message_Title.click();// hiding keyboard
		Thread.sleep(5000);
		if (messages_Sent_Received.get(messages_Sent_Received.size()-1).isDisplayed() && youHaveAlreadyResponded_text.isDisplayed()) {
			log.info("Sent Message is :->" + messages_Sent_Received.get(messages_Sent_Received.size()-1).getAttribute("content-desc"));
			log.info("message sent and Staus changed to Responded");
			return true;
		} else {
			log.info("message sent and Staus changed to Responded");
			return false;
		}
	}
	
	public void checkConversationStatus() {
		SoftAssert soft=new SoftAssert();
		Open_Status.click();
		soft.assertTrue(thisConversationIsOpen_text.isDisplayed());
		Closed_Status.click();
		soft.assertTrue(thisConversationClosed_text.isDisplayed());
		responded_Status.click();
		soft.assertTrue(youHaveAlreadyResponded_text.isDisplayed());
		soft.assertAll();
	}

}
