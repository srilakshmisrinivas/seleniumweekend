package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {

	@FindBy(id="email")
	private WebElement USN;
	
	
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement LN;
	
	public Skillrary(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void us(String u) {
		USN.sendKeys(u);
	}
	
	public void pw(String p) {
		pwd.sendKeys(p);
	}
	
	
	public void ln () {
		LN.click();
	}
	
}
