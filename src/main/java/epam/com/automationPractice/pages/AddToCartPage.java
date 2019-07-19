package epam.com.automationPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	
	private WebDriver driver;

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void proccedForCheckOut() {

		WebElement categoryTypeTab = driver.findElement(By.xpath("//a[@title='Women']"));
		categoryTypeTab.click();
		
       ScrollByVisibleElement scroll=new ScrollByVisibleElement();
	
       
       WebElement product=driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
       product.click();
		
   
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Submit")));
		
		 driver.switchTo().frame("fancybox-frame1563355183970"); // replace by your frame name
		     driver.findElement(By.className("exclusive")).click();
		   // String parentWindow=driver.getWindowHandle();
			//Go back to Parent window
		   // driver.switchTo().window(parentWindow);

	}

}
