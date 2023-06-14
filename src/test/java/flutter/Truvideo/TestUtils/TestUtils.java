package flutter.Truvideo.TestUtils;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.AppiumDriver;


public class TestUtils {
	static ExtentReports extent;

	public static ExtentReports getReporterObject() {
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Reports";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("RC Truvideo");
		reporter.config().setDocumentTitle("Automation Test Result");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("5 Exceptions", "RC Truvideo");
		
		return extent;
		
	}
	
	public String getScreenShotPath(String testCaseName,AppiumDriver<WebElement> driver) throws IOException {
		File source=driver.getScreenshotAs(OutputType.FILE);
		String destinationField=System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationField));
		return destinationField;
	}

}
