package epam.com.automationPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import epam.com.automationPractice.pages.AuthenticationPage;
import epam.com.automationPractice.pages.HomePage;
import epam.com.automationPractice.pages.PersnalInfoPage;

public class RegisterUser {
	private WebDriver driver;
	private HomePage homePage;
	private AuthenticationPage authenticationPage;
	private PersnalInfoPage persnalInfoPage;
	

	@BeforeTest
	public void beforeTest() {
		driver = DriverSetup.getDriverInstance("CHROME");
		DriverSetup.launchApplication(driver, "http://automationpractice.com");
	}

	@Test(priority = 1)
	public void chooseSignIn() {
		homePage = new HomePage(driver);
		homePage.clickSignIn();
	}

	@Test(priority = 2)
	public void createAnAccount() {
	  authenticationPage = new AuthenticationPage(driver);
	  authenticationPage.createAccount("test_account@yopmail.com");
  }

	
	@Test(priority =3)
	
	public void persnalInformation() {
		
		persnalInfoPage=new PersnalInfoPage(driver);
		persnalInfoPage.persnalInformation("Anjali", "Bani", "1111", "10", "July", "2019", "epam", "Knowladge City", "Opposite inorbit mall","Hyderabad", "Telangna","50032","India","manidspace","1234567876","453645678", "in orbit mall");
		
		
	}
	
	
	

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}


}
