package testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Shoppingcart;
import pompackage.Signin;

public class Testaddtocart extends Baseclass {
	Signin obj;
	Shoppingcart cart;
	
	
	public Testaddtocart() {
		super();
	}
	@BeforeMethod
	public void initiation() {
		initiate();
		 obj=new Signin();
		 cart=new Shoppingcart();
		 
		 }
	@Test
	public void addtocart() throws InterruptedException {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		Thread.sleep(3000);
		cart.navigate();
		cart.clicktshirt();
		cart.addtocartoption();
		}
	@Test
	public void increasequantity() throws InterruptedException {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		Thread.sleep(3000);
		cart.navigatetocart();
		cart.clickquantity();
		cart.increasequantity();
		cart.price();
		
	}
	@Test
	public void addingsameitemsagain() throws InterruptedException {
		obj.hellosignin();
		Thread.sleep(3000);
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		Thread.sleep(3000);
		cart.navigate();
		cart.clicktshirt();
	cart.addtocartoption();
	cart.navigateback();
	cart.addtocartoption();
	cart.navigateback();
	cart.addtocartoption();
	cart.sameitem();}
	@Test
	public void addingdifferentitems() throws InterruptedException {
		obj.hellosignin();
		Thread.sleep(3000);
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		Thread.sleep(3000);
		cart.navigate();
		cart.differentitems();}
	@Test
	public void removingoneitem() throws InterruptedException {
			obj.hellosignin();
			Thread.sleep(3000);
	        obj.username();
			obj.Continue();
			obj.password();
			obj.Signinn();
			cart.clickoncart();
			cart.clickondelete();}
	@Test
	public void removingallitems() throws InterruptedException {
		obj.hellosignin();
		Thread.sleep(3000);
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		cart.clickoncart();
		cart.clickdelete3();
		cart.clickondelete();
		cart.clickdelete2();
		}
	@Test
	public void getdetailsfromcart() throws InterruptedException {
		obj.hellosignin();
		Thread.sleep(3000);
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		cart.clickoncart();
		cart.itemincartclick();
		}
	@Test
	public void closingbrowser() throws InterruptedException {
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		Thread.sleep(3000);
		cart.navigate();
		cart.clickonitem2();
		cart.addtocartoption();
		driver.close();
		initiate();
		obj.hellosignin();
        obj.username();
		obj.Continue();
		obj.password();
		obj.Signinn();
		cart.clickoncart();
		
		
	}
		@AfterMethod
	public void close() {
		driver.close();
	
	}}


