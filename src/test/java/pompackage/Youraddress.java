package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Youraddress extends Baseclass {
	@FindBy(id="ya-myab-plus-address-icon")WebElement Addaddress;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-countryCode\"]/span/span")WebElement country;
	@FindBy(id="address-ui-widgets-enterAddressFullName")WebElement fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")WebElement phonenumber;
	@FindBy(id="address-ui-widgets-enterAddressLine1")WebElement Addressline1;
	@FindBy(id="address-ui-widgets-enterAddressLine2")WebElement Addressline2;
	@FindBy(id="address-ui-widgets-enterAddressCity")WebElement city;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span")WebElement province;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8")WebElement ontario;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")WebElement postalcode;
	@FindBy(name="address-ui-widgets-use-as-my-default")WebElement defaultaddress;
	@FindBy(linkText="Add preferences, notes, access codes and more")WebElement accesscode;
	@FindBy(linkText="What do we need to enter and deliver to this building?")WebElement buildingcode;
	
	@FindBy(name="securityCode")WebElement securitycode;
	@FindBy(name="callBox")WebElement callbox;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")WebElement addaddressbutton;
	@FindBy(linkText="Add a new address")WebElement suggestion;
	@FindBy(id="address-ui-widgets-original-address-block_id-input")WebElement originaladdress;
	@FindBy(name="address-ui-widgets-suggested-address-selection")WebElement suggestedaddress;
	@FindBy(name="address-ui-widgets-saveOriginalOrSuggestedAddress")WebElement saveaddress;
	@FindBy(id="address-ui-address-form")WebElement chooseaddress;
	
	public Youraddress() {
		PageFactory.initElements(driver, this);
	}
	public void clickaddaddress() {
		Addaddress.click();
	}
	public void enterfullname(String name) {
		fullname.sendKeys(name);
	}
	public void verify() {
		boolean a=country.isDisplayed();
		System.out.println(a);
	}
	public void enterphonenumber(String value) {
		phonenumber.sendKeys(value);
		
	}
	public void enteraddress(String address) {
		Addressline1.sendKeys(address);
	}
	public void entercity(String name1) {
		city.sendKeys(name1);
	}
	public void clickprovince() {
		province.click();
		ontario.click();
		
	}
	public void postalcode(String code) {
		postalcode.sendKeys(code);
	}
	public void defaultaddress() {
		defaultaddress.click();
	}
	public void accesscode() {
		accesscode.click();
	}
	public void buildingcode() {
		buildingcode.click();
	}
	public void securitycode() {
		accesscode.sendKeys(prop.getProperty("securitycode"));
	}
	public void callboxnumber() {
		securitycode.sendKeys(prop.getProperty("callboxnumber"));
	}
	public void addaddressbutton() {
		addaddressbutton.click();
	}
	public void verifysuggestion() {
		boolean b=chooseaddress.isDisplayed();
		System.out.println(b);}
	public void suggestedaddress() {
		suggestedaddress.click();}
	public void saveaddress() {
		saveaddress.click();
		}
	
	
	
}

