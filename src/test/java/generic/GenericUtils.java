package generic;
//Generic methods
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class GenericUtils extends BaseTest{
	//Methods to handle list box
	//Handle ListBox by Index
	public static void gSelectByIndex(WebElement element, int n) {
		Select select = new Select(element);
		select.selectByIndex(n);
	}
	//Handle ListBox by Value
	public static void gSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	//Handle ListBox by Visible Text
	public static void gSelectByVisibleText(WebElement element, String v) {
		Select select = new Select(element);
		select.selectByVisibleText(v);
	}
	//Handle mouse hovering
	public static void hover(WebDriver driver,WebElement toElement) {
		Actions action = new Actions(driver);
		action.moveToElement(toElement).perform();
	}
	//Handle Context click
	public static void contextClick(WebDriver driver, WebElement element) {
		
		
	}
	//Windows 
	public static void alertPopUpAccept(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static void alertPopUpDismiss(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	} 
	public static void sortListBox(WebElement element) {
		Select select = new Select(element);
		List<WebElement> li = select.getOptions();
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> ar1 = new ArrayList<String>();
		//Sorting of the elements
		for(int i=1;i<li.size();i++) {
			String st = li.get(i).getText();
			ar.add(st);
			ar1.add(st);
		}
		Collections.sort(ar);
		//Comparing both elements or both arraylists
		for(int i=0;i<ar.size();i++) {
			if (!(ar.get(i)).equals(ar1.get(i))) {
				Reporter.log("List is not sorted: Fail",true);
			}
			else {
				Reporter.log("List is sorted: Pass",true);
			}
		}
	}

}
