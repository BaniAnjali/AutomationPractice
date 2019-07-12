package epam.com.automationPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage {
	private WebDriver driver;

	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createAccount(String emailStr) {
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys(emailStr);
		
		WebElement createAccountBtn=driver.findElement(By.name("SubmitCreate"));
		createAccountBtn.click();
		}
	
	

}
