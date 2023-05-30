package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.POM.POM_AddOrderPage;
import flutter.Truvideo.POM.POM_ROListPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RO_ListPage extends POM_ROListPage {

	AppiumDriver<WebElement> driver;
	
	@AndroidFindBy(accessibility = "Orders")
	private WebElement orders_PageTitle;
	
	public WebElement getOrderPageTitle() {
		return orders_PageTitle;
	}

	public RO_ListPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public boolean checkAllFooterTab() throws Exception {
		Thread.sleep(1000);
		log.info("inside Footer tab method");
		if(chatFooterTab.isDisplayed() && POM_ROListPage.messageFooterTab.isDisplayed()
				&& POM_ROListPage.contactsFooterTab.isDisplayed() && POM_ROListPage.createButton.isDisplayed()) {
			log.info("All Footer tabs & Create button are Present on RO Screen");
			
			return true;
		}else {
			log.info("All Footer tabs & Create button are not Present on RO Screen");
			return false;
		}
	}
	public void contact() {
		contactsFooterTab.click();
	}
	
	public boolean checkSearchFunction(String roNumber) throws InterruptedException {
		//POM_ROListPage.seachButton.get(0).click();
		//POM_ROListPage.seachBarCancelButton.click();
		//log.info("ROSearch--  SearchBar Closed ");
		POM_ROListPage.seachButton.get(0).click();
		System.out.println("test  source treee");
		((HidesKeyboard) driver).hideKeyboard();
		POM_ROListPage.seachBar.sendKeys(roNumber);
		Thread.sleep(4000);
	String searchResultText=POM_ROListPage.firstSearchresult.get(7).getAttribute("content-desc");
		if(searchResultText.contains(roNumber)) {
			log.info("Searched RO is at First index : Search Function Passed");
			POM_ROListPage.seachBarBackButton.get(3).click();
			return true;
		}else {
			POM_ROListPage.seachBarBackButton.get(3).click();
			log.info("Searched RO is not at First index : Search Function Failed");
			return false;
		}
	}
	
	
	public boolean checkRO_Status_New() throws Exception {
		POM_ROListPage.newFilter.click();
		Thread.sleep(1000);
		for(WebElement statusObject:POM_ROListPage.filterStatusList) {
			if(statusObject.getAttribute("content-desc").equals("New")){
				log.info("Status is : "+statusObject.getAttribute("content-desc"));
				log.info("In New Filter, All Status of RO is New ");
			}return true;
		}{
			log.info("In New Filter, All Status of RO is not New ");
			return false;
		}
		
	}
	
	public boolean checkRO_Status_Rejected() throws Exception {
		POM_ROListPage.rejectedFilter.click();
		Thread.sleep(1000);
		for(WebElement statusObject:POM_ROListPage.filterStatusList) {
			if(statusObject.getAttribute("content-desc").equals("Rejected")){
				log.info("Status is : "+statusObject.getAttribute("content-desc"));
				log.info("In Rejected Filter, All Status of RO is Rejected ");
			}return true;
		}{
			log.info("In Rejected Filter, All Status of RO is not Rejected ");
			return false;
		}
	}
	
	public boolean checkRO_Status_All() throws Exception {
		POM_ROListPage.allFilter.click();
		Thread.sleep(2000);
		for(WebElement statusObject:POM_ROListPage.filterStatusList) {
			if(statusObject.getAttribute("content-desc").equals("Sent")
					|| statusObject.getAttribute("content-desc").equals("New")
					||statusObject.getAttribute("content-desc").equals("For Review")
					||statusObject.getAttribute("content-desc").equals("Viewed")){
				log.info("Status is : "+statusObject.getAttribute("content-desc"));
				log.info("In New Filter, All Status of RO is New ");
			}return true;
		}{
			log.info("In New Filter, All Status of RO is not New ");
			return false;
		}
	}
	
	public boolean checkRO_Status_My() throws Exception {
		POM_ROListPage.myFilter.click();
		Thread.sleep(1000);
		for(WebElement statusObject:POM_ROListPage.filterStatusList) {
			statusObject.click();
			if(POM_ROListPage.technicianName.equals("￼Name: Disha Gupta")) {
				log.info("The RO in My Filter is of Login technician");
				Thread.sleep(1000);
				POM_ROListPage.backButton_RODetails.click();
				log.info("Return back to ROList screen");
				System.out.println("Return back to ROList screen");
			}return true;
		}{
			log.info("The RO in My Filter is of Login technician");
			return false;
		}
	}
	
	public boolean checkNavigationToCreateNew_RO() throws Exception {
		navigateToAddOrderScreen(driver);
		if(POM_AddOrderPage.addOrderScreenTitle.isDisplayed()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public AddOrderPage navigateToAddOrderScreen(AppiumDriver<WebElement> driver) throws Exception {
		POM_ROListPage.createButton.click();
		Thread.sleep(1000);
		return new AddOrderPage(driver);
	}
	

	

}
