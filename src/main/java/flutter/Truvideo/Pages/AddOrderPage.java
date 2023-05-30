package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.POM.POM_AddOrderPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddOrderPage extends POM_AddOrderPage{
	AppiumDriver<WebElement> driver;
	String roNumber="";

	public AddOrderPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public boolean createNewRO() throws Exception {
		naviagteBackToROListPage(driver);
		if(roNumber.equals(POM_AddOrderPage.roNumber_OrderDetails.getAttribute("text"))) {
			return true;
		}else {
			return false;
		}
	}
	

	public RO_ListPage naviagteBackToROListPage(AppiumDriver<WebElement> driver) throws Exception {
		Thread.sleep(5000);
		POM_AddOrderPage.orderTextBox.sendKeys(randomNumber());
	    roNumber.concat(POM_AddOrderPage.orderTextBox.getAttribute("text"));
		POM_AddOrderPage.fleetCustomerCheckBox.click();
		Thread.sleep(5000);
		POM_AddOrderPage.companyNameTextBox.sendKeys(randomNumber());
		POM_AddOrderPage.advisorDropDown.click();
		Thread.sleep(10000);
		POM_AddOrderPage.advisorSearchBar.sendKeys("Disha Gupta");
		Thread.sleep(5000);
		POM_AddOrderPage.advisorDishaGupta.get(9).click();
		Thread.sleep(5000);
		POM_AddOrderPage.firstNameTextBox.sendKeys("First"+randomNumber());
		((HidesKeyboard) driver).hideKeyboard();
		POM_AddOrderPage.lastNameTextBox.sendKeys("Last"+randomNumber());
		((HidesKeyboard) driver).hideKeyboard();
		//POM_AddOrderPage.mobileTextBox.sendKeys();
		//((HidesKeyboard) driver).hideKeyboard();
		POM_AddOrderPage.emailTextBox.sendKeys(""+randomNumber()+"@gmail.com");
		((HidesKeyboard) driver).hideKeyboard();
		POM_AddOrderPage.doNotSendDirectlyCheckBox.click();
		POM_AddOrderPage.createButton.click();
		Thread.sleep(5000);
		return new RO_ListPage(driver);
	}
}
