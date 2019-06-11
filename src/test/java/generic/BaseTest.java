package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst{
	public static WebDriver driver;
	//A precondition for all the test scripts
	@BeforeMethod
	public void preCondition() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	//Postcondition for all scripts
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
