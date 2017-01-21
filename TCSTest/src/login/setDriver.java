package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setDriver {
	
	static WebDriver driver = null;
	
	public static WebDriver set(String bName) {
		if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (bName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/edgedriver.exe");
			driver = new EdgeDriver();
		} else if (bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
}
