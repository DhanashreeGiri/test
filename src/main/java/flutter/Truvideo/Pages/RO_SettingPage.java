package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RO_SettingPage extends UtilityClass {
	AppiumDriver<WebElement> driver;
	
	public RO_SettingPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(accessibility = "Settings")
	private WebElement settings;
	
	@AndroidFindBy(xpath = "//android.view.View[@index=\"1\"][@clickable=\"true\"]")
	//@iOSXCUITFindBy(xpath="//*[@type='XCUIElementTypeStaticText'][2]")
	private WebElement fontSize;
	
	@AndroidFindBy(accessibility = "Small")
	private WebElement smallFont;
	
	@AndroidFindBy(accessibility = "Medium")
	private WebElement mediumFont;
	
	@AndroidFindBy(accessibility = "Large")
	private WebElement largeFont;
	
	@AndroidFindBy(xpath = "//android.view.View[@bounds='[0,671][1080,881]']")
	private WebElement themeMode;
	
	@AndroidFindBy(accessibility = "Dark")
	private WebElement darkTheme;
	
	@AndroidFindBy(accessibility = "Light")
	private WebElement lightTheme;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Biometric login')]")
	private WebElement biometric;
	
	@AndroidFindBy(accessibility = "1")
	private WebElement one;
	
	@AndroidFindBy(accessibility = "2")
	private WebElement two;
	
	@AndroidFindBy(accessibility = "3")
	private WebElement three;
	
	@AndroidFindBy(accessibility = "4")
	private WebElement four;
	
	@AndroidFindBy(accessibility = "5")
	private WebElement five;
	
	@AndroidFindBy(accessibility = "6")
	private WebElement six;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Default country')]")
	private WebElement countryOption;
	
	@AndroidFindBy(xpath = "//android.view.View/android.widget.EditText")
	private WebElement searchbox;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'91')]")
	private WebElement indiaCountry;
	
	@AndroidFindBy(accessibility = "Default country updated")
	private WebElement alertMessage;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	private WebElement backArrow;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Camera Quality')]")
	private WebElement camQualityOption;
	
	@AndroidFindBy(accessibility = "Low")
	private WebElement lowQuality;
	
	@AndroidFindBy(accessibility = "Medium")
	private WebElement mediumQuality;
	
	@AndroidFindBy(accessibility = "High")
	private WebElement highQuality;
	
	public WebElement getSettingsLabel() {
		   return settings;
	   }
	
	public boolean checkSmallFont() throws InterruptedException {
			Thread.sleep(2000);
		    fontSize.click();
		    log.info("Clicked on Font Button on Settings Screen");
		    log.info("Default Medium font is Selected");
		    String defaultFont = mediumFont.getAttribute("content-desc");
		    smallFont.click();
		    log.info("Changed Font Medium to small");
		    fontSize.click();
		    String changedFont = smallFont.getAttribute("content-desc");

		    if(!defaultFont.equals(changedFont))
		    {
		    	return true;   }
		    else{
		    	return false;
		    }
	}
	public boolean meduimFontCheck()
	{
	    log.info("Clicked on Font Button on Settings Screen");
	    String defaultFont = smallFont.getAttribute("content-desc");
	    largeFont.click();
	    log.info("Changed Font Small to Large");
	    fontSize.click();
	    String changedFont = largeFont.getAttribute("content-desc");

	    if(!defaultFont.equals(changedFont))
	    {
	    	return true;   }
	    else{
	    	return false;
	    }
	}
	public boolean largeFontCheck() throws InterruptedException
	{
	    log.info("Clicked on Font Button on Settings Screen");
	    String defaultFont = largeFont.getAttribute("content-desc");
	    mediumFont.click();
	    log.info("Changed Font Large to Medium");
	    fontSize.click();
	    String changedFont = mediumFont.getAttribute("content-desc");
	    Thread.sleep(8000);

	    if(!defaultFont.equals(changedFont))
	    {
	    	return true;   }
	    else{
	    	return false;
	    }
	}
	
	
	
//	String defaultFont;
//	public boolean checkFontChange(WebElement fontElement) throws InterruptedException {
//	    log.info("Clicked on Font Button on Settings Screen +++++");
//	    defaultFont = mediumFont.getAttribute("content-desc");
//	    System.out.println(defaultFont);
//	    fontElement.click();
//	    log.info("Changed Font");
//
//	    // Sleep for a short duration to allow the font change to take effect
//	    Thread.sleep(2000);
//
//	    fontSize.click();
//	    String changedFont = fontElement.getAttribute("content-desc");
//	    System.out.println(changedFont);
//
//	    return defaultFont.equals(changedFont);
//	}
//
//	public void testFontChange() throws InterruptedException {
//	    Thread.sleep(2000); // Add sleep duration if necessary
//	    fontSize.click();
//
//	    Thread.sleep(5000);
//	    boolean isSmallFontChanged = checkFontChange(smallFont);
//	    if (isSmallFontChanged) {
//	        log.info("Small font changed successfully");
//	    } else {
//	        log.error("Small font change failed");
//	    }
//
//	    boolean isMediumFontChanged = checkFontChange(mediumFont);
//	    if (isMediumFontChanged) {
//	        log.info("Medium font changed successfully");
//	    } else {
//	        log.error("Medium font change failed");
//	    }
//
//	    boolean isLargeFontChanged = checkFontChange(largeFont);
//	    if (isLargeFontChanged) {
//	        log.info("Large font changed successfully");
//	    } else {
//	        log.error("Large font change failed");
//	    }
//	}

	public boolean checkTheme()
	{
		mediumFont.click();
		themeMode.click();
		log.info("Clicked on Theme mode :-Default System (Light) Theme is selected");
		String light=lightTheme.getAttribute("content-desc");
		System.out.println(light);
		darkTheme.click();
		//log.info("Changed theme Light to Dark");
		themeMode.click();
		String dark=darkTheme.getAttribute("content-desc");
		System.out.println(dark);
		if(!light.equals(dark))
		{
			log.info("Theme mode is changed from Light to Dark");
		}
		else
		{
			log.info("Theme is not changed from Light to Dark");
		}
		
		lightTheme.click();
		if(!light.equals(dark))
		{
		log.info("Changed theme to Dark to Light");
		return true;
		}
		else
		{
			log.info("Theme is not changed");
			return false;
		}
	}
	
	public void biometricConfiguration()
	{
		biometric.click();
		log.info("Clicked on BioMetric Login");
		log.info("Insert your User PIN");
		one.click();
		two.click();
		three.click();
		four.click();
		five.click();
		six.click();
		
		log.info("Navigated to Authrntication page  :---Due to Security Flag we can't Automate Authentication");
	}
	
	public boolean defaultCountry(String country) throws InterruptedException
	{
		countryOption.click();
		log.info("Clicked on Country dropdown ");
		searchbox.click();
	    searchbox.sendKeys(country);
	    log.info("Typed India Country");
	    indiaCountry.click();
	    log.info("Default country selectes popup id displayed ::Selected India as Country");
	    String text=alertMessage.getAttribute("content-desc");
	   System.out.println(text);
	    Thread.sleep(4000);
	    backArrow.click();
	    log.info("Clicked back button and now user is on RO list page");
	    if(text.equalsIgnoreCase("Default country updated"))
	    {
	    	return true;
	    }else {
	    	return false;
	    }
	}
	

	public void lowCameraQuality()
	{
		camQualityOption.click();
		log.info("Clicked on camera quality option:-'Low','Medium','High' option is displayed");
		lowQuality.click();
		log.info("Changed camera quality to LOW");
		backArrow.click();
		log.info("clicked on back arrow and user is navigated on RO List screen");
		
	}
}
