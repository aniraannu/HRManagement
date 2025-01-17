package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	//Global variable
	public static WebDriver driver;
	//Constructor for initiating driver
	public BasePage(WebDriver driver) {
		this.driver = driver;	
	}
	//Page Level Verification: Verify Page Title
	public static void verifyTitle(String eTitle) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title is matching :"+eTitle,true);
		}
		catch(Exception e){
			Reporter.log("Title is not matching",true);
		}
		
	}
	//Element level verification
	public static void verifyElementPresent(WebElement element) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is present :"+element,true);
		}
		catch(Exception e){
			Reporter.log("Element is not present",true);
		}
		
	}

}
