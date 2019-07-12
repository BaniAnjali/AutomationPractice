package epam.com.automationPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersnalInfoPage {
	
	private WebDriver driver;
	private String radioBtnId = "uniform-id_gender2";

	public PersnalInfoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void persnalInformation(String firstNameStr,String lastNameStr,String passwordStr,String dateStr,String monthStr, String yearStr,String companyStr,String addressStr,String address2Str,String cityStr,String stateStr,String postCodeStr,String countryStr,String addtionalInfoStr,String phoneNoStr,String mobileNoStr,String aliasAddressStr) {

		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(radioBtnId))).click();
		
		WebElement radioBtn = driver.findElement(By.id(radioBtnId));
		radioBtn.click();

		WebElement firstName=driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys(firstNameStr);
		
		WebElement lastName=driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys(lastNameStr);
		
		WebElement password=driver.findElement(By.id("passwd"));
		password.sendKeys(passwordStr);

		WebElement date=driver.findElement(By.id("days"));
		date.sendKeys(dateStr);

		WebElement month=driver.findElement(By.id("months"));
		month.sendKeys(monthStr);
		
		WebElement year=driver.findElement(By.id("years"));
		year.sendKeys(yearStr);

		WebElement checkBox = driver.findElement(By.id("uniform-newsletter"));
		checkBox.click();

		WebElement company=driver.findElement(By.id("company"));
		company.sendKeys(companyStr);
		
		
		WebElement address=driver.findElement(By.id("address1"));
		address.sendKeys(addressStr);
		
		WebElement address2=driver.findElement(By.id("address2"));
		address2.sendKeys(address2Str);
		
		
		WebElement city=driver.findElement(By.id("city"));
		city.sendKeys(cityStr);
		
		WebElement state=driver.findElement(By.id("id_state"));
		state.sendKeys(stateStr);

		WebElement zipCode=driver.findElement(By.id("postcode"));
		zipCode.sendKeys(postCodeStr);

		WebElement countary=driver.findElement(By.id("id_country"));
		countary.sendKeys(countryStr);
		
		
			WebElement additionalInfo=driver.findElement(By.id("other"));
			additionalInfo.sendKeys(addtionalInfoStr);

			WebElement phoneNo=driver.findElement(By.id("phone"));
			phoneNo.sendKeys(phoneNoStr);
			
			

			WebElement mobileNo=driver.findElement(By.id("phone_mobile"));
			mobileNo.sendKeys(mobileNoStr);

		WebElement aliasAddress=driver.findElement(By.id("alias"));
		aliasAddress.sendKeys(aliasAddressStr);

		driver.findElement(By.id("submitAccount")).click();

		driver.findElement(By.className("logout")).click();

	
		}

	
	
}
