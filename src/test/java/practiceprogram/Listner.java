package practiceprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener{

	public void onTestFailure(ITestResult result) {
		TakesScreenshot t = (TakesScreenshot)Screen1.driver;
	File source=t.getScreenshotAs(OutputType.FILE);
	File destination = new File("./screenshot/"+"apple.png");
	try {
		FileUtils.copyFile(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}
