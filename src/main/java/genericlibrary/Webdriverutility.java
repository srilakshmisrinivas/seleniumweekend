package genericlibrary;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdriverutility {
public static WebDriver driver;
	
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHovering(WebDriver driver,WebElement ele2) {
		Actions a=new Actions(driver);
		a.moveToElement(ele2).perform();		
	}
	
	public void doubleClick(WebDriver driver ,WebElement ele3) {
		Actions a=new Actions(driver);
		a.doubleClick(ele3).perform();;
	}
	
	public void frameSwitch(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void frameSwitchBack(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void popUpAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchWindow(WebDriver driver) {
		Set<String> allwin = driver.getWindowHandles();
		for(String all:allwin) {
			driver.switchTo().window(all);
		}
}
}