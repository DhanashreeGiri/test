package flutter.Truvideo.Tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.UserListPage;
import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DealerCodePageTest_Old extends BaseClass {
	AppiumDriver<WebElement> driver;
	RO_ListPage userList =new RO_ListPage(driver) ;
	
//	@BeforeMethod
//	public void setUp() throws IOException, ParseException, InterruptedException {
//		driver=setUpApplication();
//		userList=loadDealerPage().navigateToUserListScreen(driver).navigateToRO_ListPage(driver);
//	}
//	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
	
	@Test
	public void verifyEnterDealerCodeFunction() throws Exception {
		
		log.info("inside verifyEnterDealerCodeFunction");
		Thread.sleep(5000);
		userList.checkAllFooterTab();
	}
	
	@Test
	public void verifyContactTabFunction() throws InterruptedException {
		
		userList.contact();
	}

}
