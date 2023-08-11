package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Homepage extends Baseclass {
	
	@FindBy(id="nav-link-accountList")WebElement Accountsandlist;
	@FindBy(linkText="Your Account")WebElement youraccount;
	public Homepage() {
		PageFactory.initElements(driver,this);
	}
	
}
