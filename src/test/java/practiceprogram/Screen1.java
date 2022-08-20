package practiceprogram;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import pom.Skillrary;
@Listeners(practiceprogram.Listner.class)
public class Screen1  extends Baseclass {
@Test
	
	public void test1() {
		Skillrary s= new Skillrary(driver);
		s.us("admin");
		s.pw("admin");
		s.ln();
		Assert.fail();
}
}