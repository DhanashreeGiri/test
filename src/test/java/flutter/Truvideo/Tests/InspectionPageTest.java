package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.InspectionPage;

public class InspectionPageTest extends BaseClass {
	InspectionPage inspectionPage;

	@Test(priority = 1)
	public void verifyVisibleTemplates() throws Exception {
		inspectionPage = new InspectionPage(driver);
		Assert.assertTrue(inspectionPage.checkVisibleTemplates());

	}

	@Test(priority = 2)
	public void verifyChangeTemplate() throws Exception {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkChangeTemplate();
	}
	
	@Test(priority=3)
	public void verifycheckChecklistInterior_Exterior()throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkChecklistInterior_Exterior();
	}
	
	@Test(priority=4)
	public void verifycheckChecklistAdditionalRecommandations() throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkChecklistAdditionalRecommandations();
	}
	@Test(priority=5)
	public void verifycheckChecklistOpenRecalls() throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkChecklistOpenRecalls();
	}
	@Test(priority=6)
	public void verifycheckchkListInterior_Exterior()  throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkChecklistInterior_Exterior();
	}
	@Test(priority=7)
	public void verifycheckchkListUnderHood()  throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkchkListUnderHood();
	}
	
	@Test(priority=8)
	public void verifycheckchkListUnderVehicle()  throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkCheckListUnderVehicle();
	}
	
	@Test(priority=9)
	public void verifycheckChecklistAdditionalRecommandations_1()   throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkChecklistAdditionalRecommandations_1() ;
	}
	
	@Test(priority=10)
	public void verifycheckchkListCheckTires_MeasureTireThreadDepth()  throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkchkListCheckTires_MeasureTireThreadDepth() ;
	}
	
	
	@Test(priority=11)
	public void verifycheckchkListMeasureFront_RearBrakeLinings()  throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkchkListMeasureFront_RearBrakeLinings();
	}
	
	@Test(priority=12)
	public void verifycheckchkListCheckBatteryPerformance()  throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkchkListCheckBatteryPerformance();
	}
	
	@Test(priority=13)
	public void verifycheckSubmitInspection()throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkSubmitInspection();
	}
	@Test(priority=14)
	public void verifycheckMarkAllAsGreenButtonFunctionality()throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkMarkAllAsGreenButtonFunctionality();
	}
	@Test(priority=15)
	public void verifycheckMulti_inspectionFunctionality()throws InterruptedException {
		inspectionPage = new InspectionPage(driver);
		inspectionPage.checkMulti_inspectionFunctionality();
	}
	
	
	
}