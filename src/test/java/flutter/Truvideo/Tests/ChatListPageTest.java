package flutter.Truvideo.Tests;

import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ChatListPage;

public class ChatListPageTest extends BaseClass {
	ChatListPage chatlistpage;
	
	@Test
	public void navigateToChatCallingPage()
	{
		chatlistpage=new ChatListPage(driver);
		chatlistpage.navigateTocallingFunctionButton();
	}
	private void syso() {
		// TODO Auto-generated method stub
        }
}
