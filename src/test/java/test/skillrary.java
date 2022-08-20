package test;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import pom.Skillrary;
import pom.Skillrarylogo;

public class skillrary extends Baseclass {

	@Test
	
	public void test1() {
		Skillrary s= new Skillrary(driver);
		s.us("admin");
		s.pw("admin");
		s.ln();
		Skillrarylogo s1=new Skillrarylogo(driver);
		w.mouseHovering(driver,s1.getLogo());
	}
}
