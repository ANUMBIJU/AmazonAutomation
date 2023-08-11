package testpackage;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Signin;
import pompackage.Youraccount;
import pompackage.Yourpayments;

public class Testaccounts extends Baseclass {
	Signin obj;
	Youraccount obje;
	Yourpayments pay;
	public Testaccounts() {
		super();
			
		}
	@BeforeMethod
	public void initiation() {
		initiate();
		 obj=new Signin();
		 obje=new Youraccount();
		 pay=new Yourpayments();
		 
	}
	@Test
	public void navigationtopage() {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		obje.clickonhello();
		obje.Yourpayments();
		pay.overviewoption();
		
	}
	@Test
	public void addingcarddetails() throws InterruptedException {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		obje.clickonhello();
		Thread.sleep(3000);
		obje.Yourpayments();
		pay.overviewoption();
		Alert a=driver.switchTo().alert();
	a.accept();

	}
	}


