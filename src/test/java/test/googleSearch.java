package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googleSearch {
	WebDriver driver;
	
	@BeforeTest
	public void browserOpen() {
		String driverName = "webdriver.gecko.driver";
		String driverLocation = "./browser/geckodriver.exe";
		System.setProperty(driverName, driverLocation);
		driver = new FirefoxDriver();
	}
	
	@Test
	public void googlePageSearch() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Bangladesh Football", Keys.ENTER);
	}
	
	@AfterTest
	public void browserClose() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test Case Passed");
		driver.close();
		driver.quit();
		Thread.sleep(3000);
	}
	
}
