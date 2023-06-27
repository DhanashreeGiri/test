package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.MessagingScreen;

public class MessagingScreenTest extends BaseClass {
	MessagingScreen messageScreen;

	@Test(priority = 1)
	public void verifyDefaultScreenDuringNew_Conversation() {
		messageScreen = new MessagingScreen(driver);
		Assert.assertTrue(messageScreen.checkDefaultScreenDuringNewConversation());
	}

	@Test(priority = 2)
	public void verifySendMessageFunction() throws InterruptedException {
		messageScreen = new MessagingScreen(driver);
		Assert.assertTrue(messageScreen.checkSendMessage());
	}

	@Test(priority = 3)
	public void verifyConversationStatus() throws InterruptedException {
		messageScreen = new MessagingScreen(driver);
		messageScreen.checkConversationStatus();
	}

	
}
