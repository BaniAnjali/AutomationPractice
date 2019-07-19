package epam.com.automationPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTestClass {
	DriverManager driverManager;
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driverManager = DriverMangerFactory.getManager(DriverType.CHROME);
    }
	
	@BeforeMethod
	public void beforeMethod() {
		driver = driverManager.getDriver();
	}


	@Test
	public void launchTestAutomation() {
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
    }
	
	
}
