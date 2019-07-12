package epam.com.automationPractice.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;

		public HomePage(WebDriver driver) {
			this.driver = driver;
		}

		public void clickSignIn() {
			WebElement signInLink = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			signInLink.click();		
		}	
		
		
	


}
