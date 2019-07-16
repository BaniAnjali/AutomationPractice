package epam.com.automationPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginClick(String emailStr, String passStr) {

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(emailStr);

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys(passStr);

		WebElement createAccountBtn = driver.findElement(By.id("SubmitLogin"));
		createAccountBtn.click();

	}
}
