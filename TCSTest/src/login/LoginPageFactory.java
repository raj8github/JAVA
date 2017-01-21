package login;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {

	@FindBy(how = How.ID, using = "email")
	WebElement emailID;

	@FindBy(how = How.ID, using = "passwd")
	WebElement passWD;
	
	@FindBy(how = How.ID, using = "SubmitLogin")
	WebElement subbtn;

	public void enteremailID(String emailText) {
		emailID.sendKeys(emailText);
	}

	public void enterpassWD(String passText) {
		passWD.sendKeys(passText);
	}
	
	public void sublogin() {
		subbtn.submit();
	}
}
