package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RecordingVideoAndImagesActionsPage extends UtilityClass{
	AppiumDriver<WebElement> driver;
	
	public RecordingVideoAndImagesActionsPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Videos")
	private WebElement videos_Title;
	
	public WebElement getVideos_Title() {
		return videos_Title;
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Duration')]")
	private WebElement firstVideo;
	
	public WebElement getFirstVideo() {
		return firstVideo;
	}
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View")
	private WebElement x_Button;
	
	public WebElement getX_Button() {
		return x_Button;
	}
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Duration')]")
	private WebElement firstImage;
	
	
	private void syso() {
		// TODO Auto-generated method stub

	}
}
