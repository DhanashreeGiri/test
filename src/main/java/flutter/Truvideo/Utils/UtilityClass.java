package flutter.Truvideo.Utils;

import java.security.SecureRandom;
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
	
	public static String randomNumber() {
		Random rnd = new Random();
		int random = rnd.nextInt(999999);
		String roNum = "RO " + String.valueOf(random);
		return roNum;
	}

	public String generateRandomNumber(int length) {
		String character="0123456789";
		SecureRandom secureRandom=new SecureRandom();
		 StringBuilder sb = new StringBuilder();
		 for (int i = 0; i < length; i++) {
	            int index = secureRandom.nextInt(character.length());
	            sb.append(character.charAt(index));
	        }
		 return sb.toString();
		
	}
	
	
	public static String generateRandomString(int length) {
		final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = secureRandom.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

	



}
