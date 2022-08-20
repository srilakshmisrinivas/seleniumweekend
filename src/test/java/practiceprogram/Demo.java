package practiceprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
       WebDriver driver;
       @Test
	public  void login () {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrry.com/login.php?type=login");
		String title =driver.getTitle();
		//SoftAssert s= new SoftAssert();
		//s.assertEquals(title, "SkillRary Courses");
		
		System.out.println(title);
driver.close();

}}
