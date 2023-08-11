package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Youraccount extends Baseclass {
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2")WebElement yourorders;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")WebElement youraddress;
	@FindBy(linkText="Login & security")WebElement loginandsecurity;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/h2")WebElement yourpayments;
	@FindBy(id="nav-link-accountList-nav-line-1")WebElement helloaccount;
	
	public Youraccount() {
		PageFactory.initElements(driver, this);

}
public void yourorders() {
	yourorders.click();
}
public void youraddress() {
	youraddress.click();
}
public void Loginandsecurity() {
	loginandsecurity.click();
}
public void Yourpayments() {
	yourpayments.click();
}
public void clickonhello() {
	helloaccount.click();


}
}