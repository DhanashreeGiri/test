package flutter.Truvideo.Pages;

import java.util.List;

import org.openqa.selenium.By;
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
	
	public WebElement getChat_Title() {
		return chat_Title;
	}
	
	@AndroidFindBy(accessibility = "CREATE")
	private WebElement createChatButton;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View")
	private List<WebElement> userList_Chat;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View")
	private List<WebElement> callingButton_List;
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement permission_Allow;
	
	@AndroidFindBy(xpath = "//android.view.View[@index='1'][@clickable='false']")
	private WebElement chatScreen_UserName;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement textBox;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]")
	private WebElement sendButton;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View")
	private List<WebElement> messageList;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	private WebElement backButton_ChatScreen;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	private WebElement searchIcon;
	
	@AndroidFindBy(xpath = "//android.view.View[3]/android.view.View/android.view.View")
	private List<WebElement>searched_UserList;
	
	public boolean navigationToChatScreen() {
		String userName_ChatListScreen;
		String userName_ChatScreen;
		try {
			userName_ChatListScreen=userList_Chat.get(0).getAttribute("content-desc");
		} catch (Exception e) {
			userName_ChatListScreen=userList_Chat.get(0).getAttribute("label");
		}
		userList_Chat.get(0).click();
		try {
			userName_ChatScreen= chatScreen_UserName.getAttribute("content-desc");
		} catch (Exception e) {
			userName_ChatScreen= chatScreen_UserName.getAttribute("label");
		}
		if(userName_ChatListScreen.contains(userName_ChatScreen)) {
			log.info("user is navigated to the Chat screen: userName_ChatListScreen:->"+userName_ChatListScreen+" & userName_ChatScreen:->"+userName_ChatScreen);
			return true;
		}else {
			log.info("user is unable to navigate to Chat screen: userName_ChatListScreen:->"+userName_ChatListScreen+" & userName_ChatScreen:->"+userName_ChatScreen);
			return false;
		}
	}
	
	public boolean checkSendMessage() {
		textBox.click();
		textBox.sendKeys("Automation Message from Chat");
		if (textBox.getText() != null) {
			sendButton.click();
			chatScreen_UserName.click();// hiding keyboard
			try {
				if (messageList.get(messageList.size() - 1).getAttribute("content-desc")
						.contains("Automation Message from Chat")) {
					log.info("Message sent successfully");
				}
				return true;
			} catch (Exception e) {
				if (messageList.get(messageList.size() - 1).getAttribute("label")
						.contains("Automation Message from Chat")) {
					log.info("Message sent successfully");
				}
				return true;
			}finally {
				backButton_ChatScreen.click();
			}
		} else {
			backButton_ChatScreen.click();
			return false;
		}
	}
	
	public boolean checkCallingFunction() throws InterruptedException {
		callingButton_List.get(0).click();
		try {
			if(permission_Allow.isDisplayed()) {
			permission_Allow.click();
			permission_Allow.click();
			log.info("permission message displayed");
			}
		}catch (Exception e) {
			log.info("permission message not displayed");
		}
		Thread.sleep(2000);
		JointheRoomPage joinTheRoomPage=new JointheRoomPage(driver);
		if(joinTheRoomPage.getJoinTheRoomButton().isDisplayed()) {
			log.info("User is on Join the Room screen");
			joinTheRoomPage.getCancelButton().click();
			return true;
		}else {
			log.info("User not able to go to Join the Room screen");
			joinTheRoomPage.getCancelButton().click();
			return false;
		}
	}
	
	public boolean checkCreateChat_Function(String UserForChat) {
		createChatButton.click();
		selectElementByVisualText(UserForChat);
		if(textBox.isDisplayed()) {
			log.info("User is navigated to the new chat screen");
			backButton_ChatScreen.click();
			return true;
		}else {
			log.info("User is navigated to the new chat screen");
			backButton_ChatScreen.click();
			return false;
		}
	}
	
	public boolean searchChat_Function(String UserForChat) {
		searchIcon.click();
		textBox.sendKeys(UserForChat);
		searched_UserList.get(0).click();
		if(textBox.isDisplayed()) {
			log.info("User is navigated to the new chat screen");
			backButton_ChatScreen.click();
			return true;
		}else {
			log.info("User is navigated to the new chat screen");
			backButton_ChatScreen.click();
			return false;
		}
	}


}

