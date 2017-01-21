package login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class input {

	//private static WebDriver driver;

	public static void Data(WebDriver driver) throws IOException {
		
		FileReader fire = new FileReader(new File("./src/data.txt"));

		BufferedReader bure = new BufferedReader(fire);

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		LoginPageFactory loginpf = PageFactory.initElements(driver, LoginPageFactory.class);

		loginpf.enteremailID(bure.readLine().trim());
		loginpf.enterpassWD(bure.readLine().trim());
		loginpf.sublogin();
		
		bure.close();
		driver.close();
	}

}
