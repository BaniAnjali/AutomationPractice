package epam.com.automationPractice;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

	public class DriverSetup {

		public static WebDriver getDriverInstance(String browserType) {
			
			WebDriver driver = null;
			
			switch (browserType) {
			
			case "IE":
				System.setProperty("webdriver.ie.driver", "D:\\selenium file\\chromedriver_win32\\chromedriver.exe");
				driver = new InternetExplorerDriver();
				break;

			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "D:\\selenium file\\chromedriver_win32\\chromedriver.exe");
				driver =  new ChromeDriver();
				break;
				
			default:
				break;
			}
			
			return driver;		
			
		}

		public static void launchApplication(WebDriver driver, String appURL) {
			driver.get(appURL);
			
		}

	}



