package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
	@FindBy(name="q")
	private WebElement txtbox;

	public Pom1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void txtbox(String f) {
		txtbox.sendKeys(f);
	}

}
