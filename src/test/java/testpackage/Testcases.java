package testpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pompackage.Searching;

import testdata.Excelsheet;

public class Testcases extends Baseclass{
	Searching Obj;
	List<String>names;
	List<WebElement>namesElements;
	ArrayList<String> namess;
	public Testcases() {
		super();
	}
	@BeforeMethod
	public void initialsetup() throws InterruptedException {
		initiate();
		Thread.sleep(3000);
		 Obj=new Searching();
		 }
	@DataProvider
	public Object[][]Details() {
		Object result[][]=Excelsheet.readdata("Sheet1");
		return result;
		}
	@Test(dataProvider="Details")
	public void searchfieldchecking(String keyword) {
		Obj.search(keyword);
		Obj.clicksearch();
	}
	@Test
	public void naviagationtonextpage() throws InterruptedException {
		Obj.search("tshirt");
		Obj.clicksearch();
		Thread.sleep(3000);
		Obj.clicknext();
	}
	@Test
	public void relevantproducts() {
		Obj.entertext();
		Obj.clicksearch();
		Obj.verifyproducts();
		Obj.verify();
		}
	@Test
	public void filtering() throws InterruptedException {
		Obj.entertext();
		Obj.clicksearch();
		Obj.rating();
	}
	@Test
	public void brand() {
		Obj.entertext();
		Obj.clicksearch();
		Obj.brand();
		}
	@Test
	public void price() {
		Obj.entertext();
		Obj.clicksearch();
		Obj.price();
	}
	@Test
	public void availability() {
		Obj.entertext();
		Obj.clicksearch();
		Obj.availability();
		}
	@Test
	public void sorting() throws InterruptedException {
		Obj.entertext();
		Obj.clicksearch();
		Thread.sleep(3000);
		Obj.sorting();
		Obj.newarrivalssorting();
	}
	@Test
	public void sortingandfiltering() throws InterruptedException {
		Obj.entertext();
		Obj.clicksearch();
		Thread.sleep(3000);
		Obj.sorting();
		Obj.newarrivalssorting();
		Thread.sleep(3000);
		Obj.brand();
		}
	@Test
	public void pagination() throws InterruptedException {
		Obj.entertext();
		Obj.clicksearch();
		WebElement nextbutton=	driver.findElement(By.linkText("Next"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,12000)","");
		Thread.sleep(3000);
	List<WebElement>namesElements=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		names=new ArrayList <String>();
		for(WebElement namesElement:namesElements) {
			names.add(namesElement.getText());
			Thread.sleep(3000);
			System.out.println(namesElement.getText());
			
		}
		System.out.println("***********************");
		
    	while(true) {
		Thread.sleep(3000);
		nextbutton.click();
		js.executeScript("window.scrollBy(0,10000)","");
		Thread.sleep(3000);
		namesElements=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		for(WebElement namesElement:namesElements) {
			names.add(namesElement.getText());
			System.out.println(namesElement.getText());
			
		}
		System.out.println("*******************");
		try {
		nextbutton=driver.findElement(By.linkText("Next"));}
		catch(Exception e) {
			System.out.println("no more products now");
			break;
		}
		System.out.println("*******************");
	}
    
    		
    	}
	@Test
	public void noofitemsinpage() throws InterruptedException {
		Obj.entertext();
		Obj.clicksearch();
		WebElement nextbutton=	driver.findElement(By.linkText("Next"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,12000)","");
		Thread.sleep(3000);
	List<WebElement>namesElements=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		names=new ArrayList<String>();
		for(WebElement namesElement:namesElements) {
			names.add(namesElement.getText());
			
		}
		System.out.println("Number of products: "+namesElements.size());
		System.out.println("***********************");
		
    	while(true) {
		Thread.sleep(3000);
		nextbutton.click();
		js.executeScript("window.scrollBy(0,10000)","");
		Thread.sleep(3000);
		namesElements=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		for(WebElement namesElement:namesElements) {
			names.add(namesElement.getText());
			
		}
		System.out.println("Number of products: "+namesElements.size());
		System.out.println("*******************");
		try {
		nextbutton=driver.findElement(By.linkText("Next"));}
		catch(Exception e) {
			System.out.println("no more products now");
			break;
		}
		System.out.println("*******************");
		
		
	}}
	@Test
	public void duplicatevalue() throws InterruptedException {
		Obj.entertext();
		Obj.clicksearch();
		WebElement nextbutton=	driver.findElement(By.linkText("Next"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,12000)","");
		Thread.sleep(3000);
	List<WebElement>namesElements=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		names=new ArrayList <String>();
		for(WebElement namesElement:namesElements) {
			names.add(namesElement.getText());
			//Thread.sleep(3000);
			
			
		}
		
		
    	while(true) {
		Thread.sleep(3000);
		nextbutton.click();
		js.executeScript("window.scrollBy(0,10000)","");
		Thread.sleep(3000);
		namesElements=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		for(WebElement namesElement:namesElements) {
			names.add(namesElement.getText());
			//System.out.println(namesElement.getText());
			
		}
		System.out.println("Number of products: "+namesElements.size());
		System.out.println("*******************");
		try {
		nextbutton=driver.findElement(By.linkText("Next"));}
		catch(Exception e) {
			System.out.println("no more products now");
			break;
		}}
		
		LinkedHashSet<String>linkedhashset=new LinkedHashSet<String>(names);
		List<String>newarraywithoutduplicate=new ArrayList <String>(linkedhashset);
		System.out.println(newarraywithoutduplicate);
    	System.out.println("Number of products: "+newarraywithoutduplicate.size());
        Assert.assertEquals("Number of products: "+names.size(),"Number of products: "+newarraywithoutduplicate.size() );
		
	
	}
		
	
	

	@AfterMethod
    public void close() {
	driver.close();
	}}
