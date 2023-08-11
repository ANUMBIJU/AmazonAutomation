package testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Signin;
import pompackage.Youraccount;
import pompackage.Youraddress;
import pompackage.Yourorders;
import testdata.ExcelSheets;
import testdata.Excelsheetss;

public class Testyouraddress extends Baseclass {
	Yourorders objec;
	Signin obj;
	Youraccount obje;
	Youraddress add;
	public Testyouraddress(){
		super();
	}
	@BeforeMethod
	public void initiation() throws InterruptedException {
		initiate();
		Thread.sleep(3000);
		 objec=new Yourorders();
		 obj=new Signin();
		 obje=new Youraccount();
		 add=new Youraddress();
	}
	@Test
	public void verify() throws InterruptedException {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		obje.clickonhello();
		Thread.sleep(3000);
		obje.youraddress();
		add.clickaddaddress();
		add.verify();
		}
	@DataProvider
	public Object[][]Details2() {
		Object result[][]=ExcelSheets.readdata("Sheet1");
		return result;}
@Test(dataProvider="Details2")
public void address(String name,String value,String address,String city,String code) throws InterruptedException {
obj.hellosignin();
obj.username();
obj.Continue();
obj.password();
obj.Signinn();
obje.clickonhello();
Thread.sleep(3000);
obje.youraddress();
add.clickaddaddress();
add.enterfullname(name);
add.enterphonenumber(value);
add.enteraddress(address);
add.entercity(city);
add.clickprovince();
add.postalcode(code);
add.defaultaddress();
add.addaddressbutton();

}
@DataProvider
public Object[][]Details3() {
	Object result[][]=Excelsheetss.readdata("Sheet1");
	return result;}

@Test(dataProvider="Details3")
public void addresssugestion(String name,String value,String address,String city,String code) throws InterruptedException {
	obj.hellosignin();
	obj.username();
	obj.Continue();
	obj.password();
	obj.Signinn();
	obje.clickonhello();
	Thread.sleep(3000);
	obje.youraddress();
	add.clickaddaddress();
	add.enterfullname(name);
	add.enterphonenumber(value);
	add.enteraddress(address);
	add.entercity(city);
	add.clickprovince();
	add.postalcode(code);
	Thread.sleep(3000);
	add.addaddressbutton();
	Thread.sleep(3000);
	add.verifysuggestion();
	add.suggestedaddress();
	add.saveaddress();
	
}
@AfterMethod
public void close() {
	driver.close();
}

}
