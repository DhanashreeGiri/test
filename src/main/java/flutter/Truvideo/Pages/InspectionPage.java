package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class InspectionPage extends UtilityClass {
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

	@iOSXCUITFindBy(accessibility = "Standard Multipoint Inspection - Mazda")
	private WebElement tempOne;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Mazda Full Circle Inspection\"])[1]")
	private WebElement tempTwo;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Mazda Full Circle Inspection\"])[2]")
	private WebElement tempThree;

	@iOSXCUITFindBy(accessibility = "Full Circle Inspection (Basic Version)")
	private WebElement tempFour;

	@iOSXCUITFindBy(accessibility = "EXPAND ALL")
	private WebElement btnExpandAll;

	@iOSXCUITFindBy(accessibility = "Change template")
	private WebElement btnChangeTemplate;

	@iOSXCUITFindBy(accessibility = "Are you sure?")
	private WebElement confirmMsg;

	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement btnCancel;

	@iOSXCUITFindBy(accessibility = "YES")
	private WebElement btnYes;

	@iOSXCUITFindBy(accessibility = "Interior / Exterior\n" + "0/6")

	private WebElement chkListIntExt;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2][@index='2']")
	private WebElement chkWindshield;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5][@index='6']")
	private WebElement chkWiper;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[6][@index='7']")
	private WebElement chkWasherSpray;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[9][@index='11']")
	private WebElement chkHorn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[10][@index='13']")
	private WebElement chkHVACOperation;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[7][@index='8']")
	private WebElement chkInspection;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[3][@index='9']")
	private WebElement extraNotes;

	@iOSXCUITFindBy(accessibility = "Insert comments")
	private WebElement insertComments;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@index='2']")
	private WebElement insertCommentsBox;

	@iOSXCUITFindBy(accessibility = "CLOSE")
	private WebElement btnCloseComment;

	@iOSXCUITFindBy(accessibility = "Interior / Exterior\n" + "6/6")

	private WebElement closeChkListIntExt;

	@iOSXCUITFindBy(accessibility = "Additional Recommendations\n" + "0/2")

	private WebElement chkListAddRecommendations;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[2][@value='NO']")
	private WebElement rotateTires;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[6][@value='YES']")
	private WebElement schMaintenance;

	@iOSXCUITFindBy(accessibility = "Additional Recommendations\n" + "2/2")

	private WebElement closeChkListAddRecommendations;

	@iOSXCUITFindBy(accessibility = "Open Recalls\n" + "0/1")

	private WebElement chkListOpenRecalls;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3][@index='3']")
	private WebElement openRecalls;

	@iOSXCUITFindBy(accessibility = "Open Recalls\n" + "1/1")

	private WebElement closeChkListOpenRecalls;

	@iOSXCUITFindBy(accessibility = "Interior / Exterior\n" + "0/1")
	private WebElement chkListInterior_Exterior;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2][@index='2']")
	private WebElement chkParkingBrake;

	@iOSXCUITFindBy(accessibility = "Interior / Exterior\n" + "1/1")
	private WebElement closeChkListInterior_Exterior;

	@iOSXCUITFindBy(accessibility = "Under Hood\n" + "0/11")
	private WebElement ChkListUnderhood;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2][@index='2']")
	private WebElement chkWasherFluid;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5][@index='6']")
	private WebElement chkBrakeFluid;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[6][@index='7']")
	private WebElement transmissionFluid;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[9][@index='11']")
	private WebElement powerSteeringFluid;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[10][@index='13']")
	private WebElement coolantRecovery;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[6][@index='8']")
	private WebElement engineOilLevel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[10][@index='13']")
	private WebElement exhaustFluid;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[13][@index='17']")
	private WebElement coolingSystem;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5][@index='6']")
	private WebElement driveBelts;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[9][@index='11']")
	private WebElement oilLeaks;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[12][@index='15']")
	private WebElement airFilter;

	@iOSXCUITFindBy(accessibility = "Under Hood\n" + "11/11")
	private WebElement closeChkListUnderhood;

	@iOSXCUITFindBy(accessibility = "Under Vehicle\n" + "0/6")
	private WebElement chkListUnderVehicle;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2][@index='2']")
	private WebElement constantVelocity;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[7][@index='8']")
	private WebElement clutchOperation;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[10][@index='11']")
	private WebElement steering;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[14][@index='16']")
	private WebElement suspension;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5][@index='6']")
	private WebElement exhaustSystem;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[9][@index='11']")
	private WebElement brakeLine;

	@iOSXCUITFindBy(accessibility = "Under Vehicle\n" + "6/6")
	private WebElement closeChkListUnderVehicle;

	@iOSXCUITFindBy(accessibility = "Additional Recommendations\n" + "0/3")

	private WebElement chkListAdditionalRecommendations;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"NO\"])[1]")
	private WebElement brakes;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"YES\"])[2]")
	private WebElement cabinAirFilter;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"NO\"])[3]")
	private WebElement timingBelt;

	@iOSXCUITFindBy(accessibility = "Additional Recommendations\n" + "3/3")

	private WebElement closeChkListAdditionalRecommendations;

	@iOSXCUITFindBy(accessibility = "Check Tires / Measure Tire Tread Depth\n" + "0/5")

	private WebElement chkListCheckTires_MeasureTireThreadDepth;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5][@index='5']")
	private WebElement lF;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[8][@index='9']")
	private WebElement rF;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1\"]")
	private WebElement tapOne;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[12][@index='17']")
	private WebElement lR;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"2\"])[2]")
	private WebElement tapTwo;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[17][@index='27']")
	private WebElement rR;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"YES\"]")
	private WebElement declinedTires;

	@iOSXCUITFindBy(accessibility = "Check Tires / Measure Tire Tread Depth\n" + "5/5")

	private WebElement closeChkListCheckTires_MeasureTireThreadDepth;

	@iOSXCUITFindBy(accessibility = "Measure Front / Rear Brake Linings\n" + "0/6")

	private WebElement chkListMeasureFront_RearBrakeLinings;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4][@index='4']")
	private WebElement LF;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"10\"]")
	private WebElement tapTen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[8][@index='12']")
	private WebElement RF;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"0\"])[2]")
	private WebElement tapZero;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[9][@index='12']")
	private WebElement LR;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[13][@index='17']")
	private WebElement RR;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NO INSPD\"]")
	private WebElement measurement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NO\"]")
	private WebElement declinedTyres;

	@iOSXCUITFindBy(accessibility = "Measure Front / Rear Brake Linings\n" + "6/6")

	private WebElement closeChkListMeasureFront_RearBrakeLinings;

	@iOSXCUITFindBy(accessibility = "Check Battery Performance\n" + "0/4")

	private WebElement chkListCheckBatteryPerformance;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2][@index='2']")
	private WebElement txtboxColdCranking;

	@iOSXCUITFindBy(accessibility = "1")
	private WebElement one;

	@iOSXCUITFindBy(accessibility = "2")
	private WebElement two;

	@iOSXCUITFindBy(accessibility = "3")
	private WebElement three;

	@iOSXCUITFindBy(accessibility = "4")
	private WebElement four;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement btnBack;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NO\"]")
	private WebElement declinedBattery;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"BAD\"]")
	private WebElement terminalCondition;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3][@index='10']")
	private WebElement stateOfCharge;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement btnBackAgain;

	@iOSXCUITFindBy(accessibility = "Check Battery Performance\n" + "4/4")

	private WebElement closeChkListCheckBatteryPerformance;

	@iOSXCUITFindBy(accessibility = "SUBMIT INSPECTION")
	private WebElement btnSubmit;

	@iOSXCUITFindBy(accessibility = "Success")
	private WebElement lblSuccess;

	@iOSXCUITFindBy(accessibility = "Inspection submitted successfully!")
	private WebElement submitMessage;

	@iOSXCUITFindBy(accessibility = "CLOSE")
	private WebElement btnClose;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'SUBMITTED')]")
	private WebElement statusSubmitted;

	// @iOSXCUITFindBy(accessibility="DEPRECATED-Mazda Full Circle Inspection")
	// private WebElement tempFive;

	public boolean checkVisibleTemplates() throws Exception {
		Thread.sleep(1000);
		if (getInspection_Title().isDisplayed() && tempOne.isDisplayed() && tempTwo.isDisplayed()
				&& tempThree.isDisplayed() && tempFour.isDisplayed()) {
			log.info("Label inspection and all the templates are displayed");
			return true;
		} else {
			log.info("Label inspection and all the templates are not displayed");
			return false;
		}

	}

	public void checkChangeTemplate() throws Exception {
		Thread.sleep(2000);
		tempOne.click();
		btnChangeTemplate.click();
		if (confirmMsg.isDisplayed()) {
			btnYes.click();
			log.info("User is navigated back to templates to change the template");
		}
	}

	public void checkChecklistInterior_Exterior() throws InterruptedException {
		tempOne.click();
		Thread.sleep(2000);
		if (chkListIntExt.isDisplayed()) {
			chkListIntExt.click();
			log.info("Fill the checklist Interior/Exterior");
			chkWindshield.click();
			chkWiper.click();
			screenScroll();
			screenScroll();

			Thread.sleep(2000);
			chkWasherSpray.click();
			chkHorn.click();
			chkHVACOperation.click();
			screenScroll();
			screenScroll();
			Thread.sleep(2000);
			chkInspection.click();
			Thread.sleep(1000);
			if (extraNotes.isDisplayed()) {
				extraNotes.click();
				insertComments.click();
				log.info("User is navigated to insert comment textbox");
				insertCommentsBox.click();
				insertCommentsBox.sendKeys("This is testing comment");
				btnCloseComment.click();
				log.info("User is navigated back to checklist");
			}

			scrollUp();
			scrollUp();
			Thread.sleep(1000);
			scrollUp();
			scrollUp();
			scrollUp();
			Thread.sleep(3000);
			closeChkListIntExt.click();

		}
	}

	public void checkChecklistAdditionalRecommandations() throws InterruptedException {
		if (chkListAddRecommendations.isDisplayed()) {
			chkListAddRecommendations.click();
			log.info("Fill the checklist Additional recommendations");
			rotateTires.click();
			screenScroll();
			Thread.sleep(1000);
			schMaintenance.click();
			scrollUp();
			Thread.sleep(2000);
			closeChkListAddRecommendations.click();

		}
	}

	public void checkChecklistOpenRecalls() throws InterruptedException {
		if (chkListOpenRecalls.isDisplayed()) {
			chkListOpenRecalls.click();
			log.info("Fill the checklist Open Recalls");
			openRecalls.click();
			Thread.sleep(2000);
			closeChkListOpenRecalls.click();

		}

	}

	public void checkchkListInterior_Exterior() throws InterruptedException {
		if (chkListInterior_Exterior.isDisplayed()) {
			chkListInterior_Exterior.click();
			log.info("Fill the checklist Interior/Exterior");
			screenScroll();
			Thread.sleep(2000);
			chkParkingBrake.click();
			Thread.sleep(2000);
			closeChkListInterior_Exterior.click();

		}
	}

	public void checkchkListUnderHood() throws InterruptedException {
		if (ChkListUnderhood.isDisplayed()) {
			ChkListUnderhood.click();
			log.info("Fill the checklist Underhood");

			chkWasherFluid.click();
			chkBrakeFluid.click();
			screenScroll();
			screenScroll();
			Thread.sleep(2000);
			transmissionFluid.click();
			powerSteeringFluid.click();
			coolantRecovery.click();
			screenScroll();
			screenScroll();
			Thread.sleep(2000);
			engineOilLevel.click();
			exhaustFluid.click();
			coolingSystem.click();
			screenScroll();
			screenScroll();
			screenScroll();
			Thread.sleep(2000);
			driveBelts.click();
			oilLeaks.click();
			airFilter.click();
			scrollUp();
			scrollUp();
			scrollUp();
			scrollUp();
			scrollUp();
			scrollUp();
			scrollUp();
			Thread.sleep(2000);
			closeChkListUnderhood.click();
		}
	}

	public void checkCheckListUnderVehicle() throws InterruptedException {
		if (chkListUnderVehicle.isDisplayed()) {
			chkListUnderVehicle.click();
			log.info("Fill the checklist UnderVehicle");
			constantVelocity.click();
			clutchOperation.click();
			screenScroll();
			screenScroll();
			Thread.sleep(2000);
			steering.click();
			suspension.click();
			screenScroll();
			screenScroll();
			Thread.sleep(2000);

			exhaustSystem.click();
			brakeLine.click();

			scrollUp();
			scrollUp();
			scrollUp();
			scrollUp();
			Thread.sleep(2000);
			closeChkListUnderVehicle.click();
		}
	}

	public void checkChecklistAdditionalRecommandations_1() throws InterruptedException {
		if (chkListAdditionalRecommendations.isDisplayed()) {
			chkListAdditionalRecommendations.click();
			log.info("Fill the checklist Additional recommendations");
			Thread.sleep(2000);
			brakes.click();
			screenScroll();
			screenScroll();
			Thread.sleep(2000);
			cabinAirFilter.click();
			timingBelt.click();
			scrollUp();
			scrollUp();
			Thread.sleep(2000);
			closeChkListAdditionalRecommendations.click();

		}
	}

	public void checkchkListCheckTires_MeasureTireThreadDepth() throws InterruptedException {
		if (chkListCheckTires_MeasureTireThreadDepth.isDisplayed()) {
			chkListCheckTires_MeasureTireThreadDepth.click();
			log.info("Fill the checklist ChecK Tires/Measure Tire Thead Depth");
			screenScroll();
			Thread.sleep(2000);
			lF.click();
			rF.click();
			tapOne.click();
			screenScroll();
			screenScroll();
			Thread.sleep(2000);
			lR.click();
			tapTwo.click();
			rR.click();
			screenScroll();
			Thread.sleep(5000);
			declinedTires.click();
			scrollUp();
			scrollUp();
			scrollUp();
			Thread.sleep(2000);
			closeChkListCheckTires_MeasureTireThreadDepth.click();

		}
	}

	public void checkchkListMeasureFront_RearBrakeLinings() throws InterruptedException {

		if (chkListMeasureFront_RearBrakeLinings.isDisplayed()) {
			chkListMeasureFront_RearBrakeLinings.click();
			log.info("Fill the checklist MeasureFront/Rear Brake Linings");
			Thread.sleep(2000);
			screenScroll();

			Thread.sleep(2000);
			LF.click();
			tapTen.click();
			RF.click();
			tapZero.click();
			screenScroll();
			screenScroll();
			screenScroll();
			Thread.sleep(4000);
			LR.click();
			RR.click();
			screenScroll();
			Thread.sleep(3000);
			measurement.click();
			declinedTyres.click();
			scrollUp();
			scrollUp();
			scrollUp();
			scrollUp();
			Thread.sleep(2000);
			closeChkListMeasureFront_RearBrakeLinings.click();

		}
	}

	public void checkchkListCheckBatteryPerformance() throws InterruptedException {

		if (chkListCheckBatteryPerformance.isDisplayed()) {
			chkListCheckBatteryPerformance.click();
			log.info("Fill the checklist check battery performance");
			Thread.sleep(2000);
			screenScroll();
			screenScroll();
			Thread.sleep(2000);
			txtboxColdCranking.click();
			one.click();
			two.click();
			three.click();
			four.click();
			btnBack.click();
			declinedBattery.click();
			terminalCondition.click();
			screenScroll();
			Thread.sleep(2000);
			stateOfCharge.click();
			one.click();
			two.click();
			three.click();
			four.click();
			btnBackAgain.click();
			scrollUp();
			scrollUp();
			Thread.sleep(2000);
			closeChkListCheckBatteryPerformance.click();
			Thread.sleep(5000);

		}
	}
	private void syso() {
		// TODO Auto-generated method stub

	}
}
