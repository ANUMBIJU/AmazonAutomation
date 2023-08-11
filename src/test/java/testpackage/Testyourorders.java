package testpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Signin;
import pompackage.Youraccount;
import pompackage.Yourorders;

public class Testyourorders extends Baseclass{
	Yourorders objec;
	Signin obj;
	Youraccount obje;
	public Testyourorders() {
		super();
	}
	@BeforeMethod
	public void initialsetup() throws InterruptedException {
		initiate();
		Thread.sleep(3000);
		 objec=new Yourorders();
		 obj=new Signin();
		 obje=new Youraccount();
		 
			 
		 }
	
	@Test
	public void selectmonths() throws InterruptedException {
		Thread.sleep(3000);
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		obje.clickonhello();
		obje.yourorders();
		objec.clickorder();
		objec.selectmonth();
		objec.veriffy();
	}
	@Test
	public void buyagainoptions() {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		obje.clickonhello();
		obje.yourorders();
		objec.clickbuyagain();
	}
	@Test
	public void notyetshippedoption() {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		obje.clickonhello();
		obje.yourorders();
		objec.notyetshipped();
		objec.notyetshippedmessage();
		
	}
	@Test
	public void cancelledorder() throws InterruptedException {
		Thread.sleep(3000);
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		obje.clickonhello();
		obje.yourorders();
		objec.cancelledordersclick();
		objec.cancelledmessage();
	}
		
	}
