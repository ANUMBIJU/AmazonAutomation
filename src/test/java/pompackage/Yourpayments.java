package pompackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Yourpayments extends Baseclass  {
	
	@FindBy(id="pp-c6ZnWo-10")WebElement addpayment;
	@FindBy(name="ppw-accountHolderName")WebElement nameoncard;
	@FindBy(name="addCreditCardNumber")WebElement cardnumber;
	@FindBy(xpath="//*[@id=\"pp-VcH16V-21\"]/span/span")WebElement day;
	@FindBy(xpath="//*[@id=\"pp-VcH16V-22\"]/span/span")WebElement year;
	@FindBy(id="ppw-widgetEvent:AddCreditCardEvent")WebElement Addyourcard2;
	@FindBy(xpath="//*[@id=\"maple-banner-modal-trigger\"]")WebElement addyourcard1;
	@FindBy(linkText="Overview")WebElement overview;
	@FindBy(xpath="//*[@id=\"pp-J2vtV7-18_4\"]")WebElement approveddate;
	@FindBy(xpath="//*[@id=\"pp-J2vtV7-22\"]/span/span")WebElement approvedyear;
	
	public Yourpayments() {
		PageFactory.initElements(driver, this);
}
	public void clickonaddpayment() {
		addpayment.click();
	}
	public void cardname1() {
		nameoncard.sendKeys(prop.getProperty("cardname1"));
	}
	public void addcardnumber1() {
		cardnumber.sendKeys(prop.getProperty("cardnumber1"));
	}
	public void cardname2() {
		nameoncard.sendKeys(prop.getProperty("cardname2"));
	}
	public void cardnumber2() {
		cardnumber.sendKeys(prop.getProperty("cardnumber2"));
	}
	public void addday() {
		day.click();
	}
	public void addyear() {
		year.click();
	}
	public void addcardoptions() {
		Addyourcard2.click();
	}
	public void addyourcard() {
		addyourcard1.click();
	}
	public void overviewoption() {
		overview.click();
	}
	public void approvedclick() {
		approveddate.click();
	}
	public void approvedyear() {
		approvedyear.click();
	}
	public void popup() {
		Alert a=driver.switchTo().alert();
		nameoncard.sendKeys(prop.getProperty("cardname1"));
		cardnumber.sendKeys(prop.getProperty("cardnumber1"));
		day.click();
		approveddate.click();
		year.click();
		approvedyear.click();
		a.accept();
	}
	}
