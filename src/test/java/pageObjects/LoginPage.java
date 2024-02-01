package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="username")
	WebElement user;

	@FindBy(name="password")
	WebElement pass;

	@FindBy(xpath = "//button")
	WebElement btnLogin;
	
	@FindBy(xpath="//h6")
	WebElement account;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
	WebElement logout;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	WebElement logout_01;
	public void setuserName(String email) {
		user.sendKeys(email);
	}

	public void setPassword(String pwd) {
		pass.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	public boolean AccountExists() {
		
		try {
			return (account.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
		
	}
	
	public void logout1() {
		
		logout.click();
		
	}
   

	public void logout2() {
		// TODO Auto-generated method stub
		logout_01.click();
		
		
	}

}
