package epam.com.automationPractice.pages;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
	
public class ScrollByVisibleElement {
	 WebDriver driver;
	    
	    public void ByVisibleElement() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        //Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));

	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	    }
	}





