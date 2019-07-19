package epam.com.automationPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import epam.com.automationPractice.pages.AuthenticationPage;
import epam.com.automationPractice.pages.HomePage;
import epam.com.automationPractice.pages.PersnalInfoPage;

public class RegisterUser extends BaseTestClass {

	private HomePage homePage;
	private AuthenticationPage authenticationPage;
	private PersnalInfoPage persnalInfoPage;

	@Test(priority = 1)
	public void chooseSignIn() {
		homePage = new HomePage(driver);
		homePage.clickSignIn();
	}

	@Test(priority = 2)
	public void createAnAccount() {
		authenticationPage = new AuthenticationPage(driver);
		authenticationPage.createAccount("test_acc@yopmail.com");
	}

	@Test(priority = 3)
	public void persnalInformation() {
		persnalInfoPage = new PersnalInfoPage(driver);
		persnalInfoPage.persnalInformation("Test", "Bani", "12345", "10", "July", "2019", "epam", "Knowladge City",
				"Opposite inorbit mall", "Hyderabad", "Telangna", "50032", "India", "manidspace", "1234567876",
				"453645678", "in orbit mall");
	}

	@AfterTest
	public void afterMethod() {
		driverManager.quitDriver();
	}

}
