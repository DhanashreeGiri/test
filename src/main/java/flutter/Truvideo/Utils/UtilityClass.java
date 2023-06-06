package flutter.Truvideo.Utils;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class UtilityClass {

	AppiumDriver<WebElement> driver;
	public Logger log = LogManager.getLogger(this.getClass().getName());

	public UtilityClass(AppiumDriver<WebElement> driver) {
		this.driver = driver;
	}
	
	public String randomWord() {
		Random rnd = new Random();
		int random = rnd.nextInt(999999);
		String generatedName = "Name" + String.valueOf(random);
		return generatedName;
	}


	public int randomNumber() {
		Random rnd = new Random();
		int number = rnd.nextInt(999999999);
		return number;
	}

}
