package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Loginandsecurity extends Baseclass {
	@FindBy(id="auth-cnep-edit-name-button")WebElement edit;
	@FindBy(id="ap_customer_name")WebElement customername;
	@FindBy(id="auth-cnep-add-phone-button")WebElement phonenumber;
	@FindBy(id="cnep_1C_submit_button")WebElement savechanges;
	@FindBy(id="ap_phone_number")WebElement phonenumberfield;
	@FindBy(id="auth-continue")WebElement continuebutton;
	@FindBy(id="auth-change-phone-cancel")WebElement cancelbutton;
	public Loginandsecurity() {
		PageFactory.initElements(driver, this);
	}
	public void  clickonedit() {
		edit.click();
		
	}
	public void updatevalue() {
		customername.sendKeys(prop.getProperty("newname"));
	}
	public void addphonenumber() {
		phonenumber.click();
	}

}
