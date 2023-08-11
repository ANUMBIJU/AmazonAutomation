package testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Signin;
import testdata.Excelsheet;

public class Testsignin extends Baseclass {
	Signin obj;
	public Testsignin() {
		super();
	}
	@BeforeMethod
	public void initialsetup() throws InterruptedException {
		initiate();
		Thread.sleep(3000);
		 obj=new Signin();
	}

	@DataProvider
	public Object[][]Details1() {
		Object result[][]=Excelsheet.readdata("Sheet1");
		return result;}
@Test(priority=1)
public void signin() throws InterruptedException {
	obj.hellosignin();
	
}
@Test(priority=2,dataProvider="Details1")
public void usernamefield(String name,String Pass) throws InterruptedException {
	obj.hellosignin();
	Thread.sleep(3000);
	obj.Email(name);
	obj.Continue();
	obj.password(Pass);
	obj.Rememberme();
	obj.Signinn();
	}
@Test(priority=3)
public void verifyy() throws InterruptedException {
	obj.hellosignin();

	obj.username();
	obj.Continue();
	obj.password();
	obj.Rememberme();
	obj.Signinn();
	Thread.sleep(3000);
	obj.verify();
}
@AfterMethod
public void close() {
	driver.close();
}

}
	
