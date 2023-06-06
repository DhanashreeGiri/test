package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class InspectionPage extends UtilityClass{
	AppiumDriver<WebElement> driver;
	
	public InspectionPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Inspection")
	@iOSXCUITFindBy(accessibility = "Inspection")
	private WebElement inspection_Title;
	
	public WebElement getInspection_Title() {
		return inspection_Title;
	}
	
	  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	   @iOSXCUITFindBy(accessibility="INSPECTIONS")
	   private WebElement btnInspections;
	   
	   
	   @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText")
		@iOSXCUITFindBy(accessibility="Inspection")
	   private WebElement lblInspection;
	   
	   
	   @iOSXCUITFindBy(accessibility="Standard Multipoint Inspection - Mazda")
	   private WebElement tempOne;

	   @iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Mazda Full Circle Inspection\"])[1]")
	   private WebElement tempTwo;

	   @iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Mazda Full Circle Inspection\"])[2]")
	   private WebElement tempThree;
	   
	   @iOSXCUITFindBy(accessibility="Full Circle Inspection (Basic Version)")
	   private WebElement tempFour;
		
	   @iOSXCUITFindBy(accessibility="EXPAND ALL")
	   private WebElement btnExpandAll;
		
	   @iOSXCUITFindBy(accessibility="Change template")
	   private WebElement btnChangeTemplate;
	   
	   @iOSXCUITFindBy(accessibility="Are you sure?")
	   private WebElement confirmMsg;
	   
	   @iOSXCUITFindBy(accessibility="CANCEL")
	   private WebElement btnCancel;
	   
	   @iOSXCUITFindBy(accessibility="YES")
	   private WebElement btnYes;
	   
	   @iOSXCUITFindBy(accessibility="DEPRECATED-Mazda Full Circle Inspection")
	   private WebElement tempFive;
	   
	   public boolean checkVisibleTemplates() throws Exception {
			Thread.sleep(1000);
			if (lblInspection.isDisplayed() && tempOne.isDisplayed()
					 && tempTwo.isDisplayed()&& tempThree.isDisplayed()&&tempFour.isDisplayed()&&tempFive.isDisplayed()) {
				log.info("Label inspection and all the templates are displayed");
				return true;
			} else {
				log.info("Label inspection and all the templates are not displayed");
				return false;
			}

		}
	   
	   public void checkChangeTemplate() throws Exception {
		   Thread.sleep(1000);
	       tempOne.click();
	       btnChangeTemplate.click();
	       if (confirmMsg.isDisplayed()) {
	    	   btnYes.click();
	    	   log.info("User is navigated back to templates to change the template");
	       }
				
			 
				
		}
	    
	    
	    
		





	

}
