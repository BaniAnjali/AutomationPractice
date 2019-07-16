package epam.com.automationPractice;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import epam.com.automationPractice.pages.AddToCartPage;
import epam.com.automationPractice.pages.AuthenticationPage;
import epam.com.automationPractice.pages.HomePage;
import epam.com.automationPractice.pages.LoginPage;
import epam.com.automationPractice.pages.PersnalInfoPage;


public class RegisterUserFactoryPattern {
	DriverManager driverManager;
	WebDriver driver;

	private HomePage homePage;
	private AuthenticationPage authenticationPage;
	private PersnalInfoPage persnalInfoPage;
	private LoginPage loginPage;
	private AddToCartPage addToCartPage;

	@BeforeTest
	public void beforeTest() {
		driverManager = DriverMangerFactory.getManager(DriverType.CHROME);

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = driverManager.getDriver();
	}

	@Test(priority = 1)
	public void launchTestAutomation() {
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();

	}

	
	/*@Test(priority = 2)
	public void chooseSignIn() {
		homePage = new HomePage(driver);
		homePage.clickSignIn();
	}

	@Test(priority = 3)
	public void createAnAccount() {
		authenticationPage = new AuthenticationPage(driver);
		authenticationPage.createAccount("test_acc@yopmail.com");
	}

	@Test(priority = 4)

	public void persnalInformation() {
		persnalInfoPage = new PersnalInfoPage(driver);
		persnalInfoPage.persnalInformation("Test", "Bani", "12345", "10", "July", "2019", "epam", "Knowladge City",
				"Opposite inorbit mall", "Hyderabad", "Telangna", "50032", "India", "manidspace", "1234567876",
				"453645678", "in orbit mall");
		}*/
	
	
	@Test(priority = 1)
	public void chooseLogin() {
		loginPage=new LoginPage(driver);
		loginPage.loginClick("anjali_bani@epam.com","11111");
		
		}

	@Test(priority = 2)
	public void addProduct() {
		addToCartPage = new AddToCartPage(driver);
		addToCartPage.proccedForCheckOut();
	}
	@AfterTest
	public void afterMethod() {
		driverManager.quitDriver();
	}

}
