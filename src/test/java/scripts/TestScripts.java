package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.GenericUtils;
import pom.HomePage;

public class TestScripts extends BaseTest{
	@Test(enabled=false)
	public void testCreateEmployee() {
		HomePage pi = new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin123");
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPimMenu();
		pi.clickAddEmp();
		pi.setFirstName("Anu");
		pi.setLasttName("Joy");
		pi.clickSaveBtn();
		pi.verifyFirstName("Anu");
	}
	@Test(enabled=false)
	public void testSortListBox() {
		HomePage pi = new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin123");
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPimMenu();
		pi.clickEmpList();
		GenericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
		
	}
	@Test(enabled=true)
	public void testRemoveEmployee() {
		HomePage pi = new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin123");
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPimMenu();
		pi.clickEmpListBtn();
		pi.selectChkBox();
		pi.clickRemoveEmp();
		pi.clickDeleteConfirmPopupOK();
		//GenericUtils.alertPopUpAccept(driver);
		WebElement e = driver.findElement(By.xpath("//a[text()='Hannah']"));
		BasePage.verifyElementPresent(e);
	}
	

}
