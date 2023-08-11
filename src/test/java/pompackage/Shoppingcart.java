package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basepackage.Baseclass;

public class Shoppingcart extends Baseclass{
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span[1]")WebElement tshirt;
	@FindBy(id="add-to-cart-button")WebElement addtocart;
	@FindBy(xpath="//*[@id=\"a-autoid-1-announce\"]")WebElement quantity;
	@FindBy(xpath="//*[@id=\"quantity_2\"]")WebElement increasequantity;
	@FindBy(xpath="//*[@id=\"sc-subtotal-amount-activecart\"]/span")WebElement price;
	@FindBy(xpath="//*[@id=\"sc-subtotal-label-activecart\"]")WebElement totalitems;
	@FindBy(xpath="//*[@id=\"sc-subtotal-amount-activecart\"]/span")WebElement totalprice;
	@FindBy(id="nav-cart-count-container")WebElement cart;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[2]/div[2]/h2/a/span[1]")WebElement item2;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div/div[2]/div[2]/h2/a/span[1]")WebElement item3;
	@FindBy(xpath="//*[@id=\"sc-active-1d731e3f-759f-4f8b-b2e3-cbdc743891ce\"]/div[4]/div/div[3]/div[1]/span[2]/span/input")WebElement delete;
	@FindBy(xpath="//*[@id=\"sc-active-432a895b-7205-4b78-b4fe-5b3dbadb3ea9\"]/div[4]/div/div[3]/div[1]/span[2]/span/input")WebElement delete2;
	@FindBy(xpath="//*[@id=\"sc-active-730aebaa-c500-4260-8d53-8fefe33a9b88\"]/div[4]/div/div[3]/div[1]/span[2]/span/input")WebElement delete3;
	@FindBy(xpath="//*[@id=\"sc-active-9bacf14a-1dfe-49bf-a563-78fcbf3b1c63\"]/div[4]/div/div[3]/ul/li[1]/span/a/span[1]/span/span[2]")WebElement itemincart;
	@FindBy(xpath="//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span[2]/span[2]/span[2]")WebElement details;
	public Shoppingcart() {
		PageFactory.initElements(driver, this);
}

public void navigate() {
	driver.navigate().to("https://www.amazon.ca/s?k=tshirt&crid=2HJKV7E37X3Y4&sprefix=tshirt%2Caps%2C116&ref=nb_sb_noss_2");
}
public void clicktshirt() {
	tshirt.click();
	}
public void addtocartoption() {
	addtocart.click();
}
public void navigatetocart() {
	driver.navigate().to("https://www.amazon.ca/gp/cart/view.html?ref_=nav_cart");
}
public void clickquantity(){
	quantity.click();
	}
public void increasequantity(){
	increasequantity.click();
	}
public void price() {
String a=	price.getText();
System.out.println(a);
Assert.assertEquals(a,"$37.38");
}
public void navigateback(){
	driver.navigate().back();
}
public void clickoncart() {
	cart.click();
}
public void clickondelete() {
	delete.click();
}
public void clickdelete2() {
	delete2.click();
}
public void clickdelete3() {
	delete3.click();
}
public void sameitem(){
	cart.click();
	String b=totalitems.getText();
	String c=totalprice.getText();
	System.out.println(b);
	System.out.println(c);
	Assert.assertEquals(b, "Subtotal (3 items):");
	Assert.assertEquals(c,"$56.07" );
}
public void differentitems(){
	tshirt.click();
	addtocart.click();
	driver.navigate().to("https://www.amazon.ca/s?k=tshirt&crid=3H5F4MH776BLU&sprefix=tshirt%2Caps%2C152&ref=nb_sb_noss_2");
	item2.click();
	addtocart.click();
	driver.navigate().to("https://www.amazon.ca/s?k=tshirt&crid=3H5F4MH776BLU&sprefix=tshirt%2Caps%2C152&ref=nb_sb_noss_2");
	item3.click();
	addtocart.click();
}
public void detailsofproduct(){
	boolean d=details.isDisplayed();
	System.out.println(d);
}
public void clickonitem2(){
	item2.click();
}
public void itemincartclick(){
	itemincart.click();
}

public void closingbrowser(){
	
	
	
}

//public void totalprice(){
	//String b=

{
	
}
}