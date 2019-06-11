package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	private WebElement userTxtBox;
	@FindBy(id="txtPassword")
	private WebElement pwdTxtBox;
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pimMenu;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement emp_ListBtn;
	@FindBy(id="firstName")
	private WebElement fName;
	@FindBy(id="lastName")
	private WebElement lName;
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstName1;
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement empListBtn;
	@FindBy(id="ohrmList_chkSelectRecord_2")
	private WebElement chkBox1;
	@FindBy(id="btnDelete")
	private WebElement removeEmpBtn;
	@FindBy(id="empsearch_employee_name_empName")
	private WebElement empSearchName;
	@FindBy(id="searchBtn")
	private WebElement srchBtn;
	
	public void setUserName(String un) {
		userTxtBox.sendKeys(un);
	}
	public void setPwd(String pwd) {
		pwdTxtBox.sendKeys(pwd);
	}
	public void clickLogin() {
		loginBtn.click();
	}
	public void clickPimMenu() {
		pimMenu.click();
	}
	public void clickEmpList() {
		emp_ListBtn.click();
	}
	public void clickAddEmp() {
		addEmp_Menu.click();
	}
	public void setFirstName(String fn) {
		fName.sendKeys(fn);
	}
	public void setLasttName(String ln) {
		lName.sendKeys(ln);
	}
	public void clickSaveBtn() {
		saveBtn.click();
	}
	public void verifyFirstName(String eFn) {
		String aFn = firstName1.getAttribute("value");
		Assert.assertEquals(eFn, aFn);
	}
	public void clickEmpListBtn() {
		empListBtn.click();
	}
	public void selectChkBox() {
		chkBox1.click();
	}
	public void clickRemoveEmp() {
		removeEmpBtn.click();
	}
	public void setEmpSearchName(String emSn) {
		empSearchName.sendKeys(emSn);
	}
	public void clickSearch() {
		srchBtn.click();
	}
	@FindBy(id="dialogDeleteBtn")
	private WebElement deleteConfirmPopupOK;	//popup confirmation OK button /id="dialogDeleteBtn"
	public void clickDeleteConfirmPopupOK() {
		deleteConfirmPopupOK.click();
	}
	
}
