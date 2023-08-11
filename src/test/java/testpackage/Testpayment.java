package testpackage;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Checkout;
import pompackage.Shoppingcart;
import pompackage.Signin;
import pompackage.Yourpayments;

public class Testpayment extends Baseclass {
Signin obj;
Yourpayments pay;
Shoppingcart cart;
Checkout paym;

	public Testpayment() {
		super();
	}
@BeforeMethod
	public void initiation() {
		initiate();
		 obj=new Signin();
		 pay=new Yourpayments();
		 cart=new Shoppingcart();
		 paym=new Checkout();
}
@Test
public void addpayments() throws InterruptedException {
	obj.hellosignin();
	Thread.sleep(3000);
    obj.username();
	obj.Continue();
	obj.password();
	obj.Signinn();
	
	cart.navigate();
	cart.clickonitem2();
	cart.addtocartoption();
	Thread.sleep(3000);
paym.clickcheckout();
	Thread.sleep(3000);
	paym.clickshipptoaddress();
	Thread.sleep(5000);
	paym.addcard();
	try {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		if(wait.until(ExpectedConditions.alertIsPresent())==null) {
			System.out.println("Alert is not present");
		}
		
		else {
			driver.switchTo().alert();
		}}
		catch(Exception e) {
			System.out.println("no alert");
	
	Thread.sleep(3000);
    paym.cardnumber();
    Thread.sleep(5000);
	paym.name();
	paym.clickmonth();
	paym.entermonth();
	paym.clickyear();
	paym.entermonth();
	paym.cvv();
	paym.defaultcard();
	paym.addcardoption();
	

	

}}}
