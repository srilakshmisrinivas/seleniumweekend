package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Skillrary;
import pom.Skillrarylogo;

public class Skillrary1 extends Baseclass{
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/login.php?type=login");
			
			Skillrary s= new Skillrary(driver);
			s.us("admin");
			s.pw("admin");
			s.ln();
			
			
	}

}
