package testpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Signin;
import pompackage.Youraccount;

public class Testyouraccount extends Baseclass{
	Youraccount obje;
	Signin obj;
	public Testyouraccount() {
		super();
	}
	@BeforeMethod
	public void initialsetup() throws InterruptedException {
		initiate();
		Thread.sleep(3000);
		 obje=new Youraccount();
		 obj=new Signin();
	}
	@Test
	public void click() throws InterruptedException {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Rememberme();
		obj.Signinn();
		Thread.sleep(3000);
		obje.clickonhello();
	}
	@Test
	public void navigation() throws InterruptedException {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		obje.clickonhello();
		Thread.sleep(3000);
		obje.yourorders();
		String c=driver.getTitle();
		System.out.println(c);
	}
	
		
		
		
	}

	
