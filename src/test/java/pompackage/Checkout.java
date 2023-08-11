package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Checkout extends Baseclass{
	@FindBy(name="proceedToRetailCheckout")WebElement checkoutbutton;
	@FindBy(xpath="//*[@id=\"shipToThisAddressButton\"]/span/input")WebElement shiptoaddressbutton;
	@FindBy(linkText="Add a credit or debit card")WebElement addcard;
	@FindBy(css="#pp-5AACfe-16")WebElement cardnumber;
	@FindBy(name="ppw-accountHolderName")WebElement name;
	@FindBy(xpath="//*[@id=\"pp-xJKbaE-22\"]/span/span")WebElement month;
	@FindBy(xpath="//*[@id=\"pp-xJKbaE-19_4\"]")WebElement cardmonth;
	@FindBy(xpath="//*[@id=\"pp-xJKbaE-23\"]/span/span")WebElement year;
	@FindBy(xpath="//*[@id=\"pp-xJKbaE-21_0\"]")WebElement cardyear;
	@FindBy(name="addCreditCardVerificationNumber")WebElement cvv;
	@FindBy(name="ppw-setBuyingPreference")WebElement defaultcard;
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")WebElement addcardoption;
	
	//@FindBy(
public Checkout() {
	PageFactory.initElements(driver,this);
}
public void clickcheckout() {
	checkoutbutton.click();
}
public void clickshipptoaddress() {
	shiptoaddressbutton.click();
}
public void addcard() {
	addcard.click();
}
public void cardnumber() {
	cardnumber.sendKeys(prop.getProperty("cardnumber1"));
}
public void name() {
	name.sendKeys(prop.getProperty("cardname1"));
}
public void clickmonth() {
	cardmonth.click();
}
public void entermonth() {
	month.click();
}
public void clickyear() {
	year.click();
}
public void enteryear() {
	cardyear.click();
}
public void cvv() {
	cvv.sendKeys(prop.getProperty("cvv"));
}
public void defaultcard() {
	defaultcard.click();
}
public void addcardoption() {
	addcardoption.click();
}
}

