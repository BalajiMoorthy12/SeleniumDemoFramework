package Driverutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverClass {

	private static WebDriver driver;
	private String url = "https://www.google.com/";

	public DriverClass() {

	}

	@BeforeMethod
	public void initialiseTest() {
		String url = "https://www.amazon.in/"; 
		System.out.println("Before method");
		this.driver = new ChromeDriver();
		this.driver.get(this.url);
	}

	@AfterMethod
	public void finalTest() {
		System.out.println("After method");
		this.driver.quit();
	}

}
