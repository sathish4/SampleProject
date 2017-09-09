public class DevTest {
	
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
		ele.sendKeys("DevTest");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}
	
}
