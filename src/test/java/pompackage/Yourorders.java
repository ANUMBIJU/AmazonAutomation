package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Yourorders extends Baseclass {
	@FindBy(id="a-autoid-1-announce")WebElement Orderplaced;
	@FindBy(linkText="past 3 months")WebElement months;
	@FindBy(linkText="2023")WebElement year;
	@FindBy(id="time-filter_3")WebElement archivedorder;
	@FindBy(linkText="Buy Again")WebElement buyagain;
	@FindBy(linkText="Not Yet Shipped")WebElement notyetshipped;
	@FindBy(linkText="Cancelled Orders")WebElement cancelledorders;
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div/div[8]/div")WebElement message;
	@FindBy(xpath="//*[@id=\"ordersContainer\"]/div[1]/div")WebElement shippingmessage;
	@FindBy(xpath="//*[@id=\"ordersContainer\"]/div[1]/div")WebElement cancelledmessage;
	
	public Yourorders() {
		PageFactory.initElements(driver, this);
	}
	public void clickorder() {
		Orderplaced.click();
	}
	public void selectmonth() {
		months.click();
	}
	public void clickbuyagain() {
		buyagain.click();
	}
	public void notyetshipped() {
		notyetshipped.click();
	}
	public void cancelledordersclick() {
		cancelledorders.click();
		
	}
	public void veriffy() {
		boolean d=message.isDisplayed();
		System.out.println(d);
	}
	public void notyetshippedmessage() {
		boolean e=shippingmessage.isDisplayed();
		System.out.println(e);
			
		}
	public void cancelledmessage() {
		boolean f=cancelledmessage.isDisplayed();
				System.out.println(f);
	}
}
