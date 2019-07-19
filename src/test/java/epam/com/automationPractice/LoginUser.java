package epam.com.automationPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import epam.com.automationPractice.pages.AddToCartPage;
import epam.com.automationPractice.pages.HomePage;
import epam.com.automationPractice.pages.LoginPage;

public class LoginUser extends BaseTestClass{

	private LoginPage loginPage;
	private WebDriver driver;
	private AddToCartPage addToCartPage;
	private HomePage homePage;
	
	
	@Test(priority = 1)
	public void chooseSignIn() {
		homePage = new HomePage(driver);
		homePage.clickSignIn();
	}

	@Test(priority = 2)
	public void chooseLogin() {
		loginPage=new LoginPage(driver);
		loginPage.loginClick("anjali_bani@epam.com","11111");
		}

	@Test(priority = 3)
	public void addProduct() {
		addToCartPage = new AddToCartPage(driver);
		addToCartPage.proccedForCheckOut();
	}
	
	@AfterTest
	public void afterMethod() {
		driverManager.quitDriver();
	}
}
