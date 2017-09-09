package SeleniumAutomation.Git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Git\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();

	}
	@Test
	public void verifyLogin(){
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Hello");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}
	
}