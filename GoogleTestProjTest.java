package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Driverutils.DriverClass;
import Page.GoogleLandingPage;

public class GoogleTestProjTest extends DriverClass {
	
	
	@Test()
	public void test() {
		System.out.println("Test");
	}

}
