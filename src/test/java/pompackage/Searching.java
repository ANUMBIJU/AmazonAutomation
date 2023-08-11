package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basepackage.Baseclass;

public class Searching extends Baseclass {

	@FindBy(id="twotabsearchtextbox")WebElement searchfield;
	@FindBy(id="nav-search-submit-button")WebElement searchbutton;
@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[66]/div/div/span/a[4]")WebElement Nextbutton;
@FindBy(xpath="//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div")WebElement searchresult;
@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")WebElement name;
@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[1]/div/span/a/div/img")WebElement image;
@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[2]/div[2]/div/span[2]/a/span")WebElement rating;
@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[2]/div[2]/div/span[1]/span/a/i[1]")WebElement stars;
@FindBy(xpath="//*[@id=\"p_72/11192170011\"]/span/a/section/i")WebElement filterrating;
@FindBy(xpath="//*[@id=\"p_89/Amazon Essentials\"]/span/a/div/label/i")WebElement filterbrand;
@FindBy(xpath="//*[@id=\"p_36/12035763011\"]/span/a/span")WebElement filterprice;
@FindBy(xpath="//*[@id=\"p_n_availability/12035748011\"]/span/a/div/label/i")WebElement filteravailability;
@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]")WebElement Sorting;
@FindBy(xpath="//*[@id=\"s-result-sort-select_4\"]")WebElement newarrivals;
@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[66]/div/div/span/a[4]")WebElement nextpage;

	public Searching () {
		PageFactory.initElements(driver, this);
		
	}
	public void search(String keyword) {
		searchfield.sendKeys(keyword);
	}
	public void clicksearch() {
		searchbutton.click();
	}
	public void clicknext()  {
		Nextbutton.click();
		
	}
	public void entertext() {
		searchfield.sendKeys(prop.getProperty("text"));
	}
	public void verifyproducts() {
		String a=searchresult.getText();
		System.out.println(a);
		Assert.assertEquals(a,"1-48 of over 100,000 results for \"t-shirt\"");
	}
	public void verify() {
	boolean b=	name.isDisplayed();
	System.out.println(b);
	boolean c=	image.isDisplayed();
	System.out.println(c);
	boolean d=rating.isDisplayed();
	System.out.println(d);
	boolean e=stars.isDisplayed();
	System.out.println(e);
	}
	public void rating()  {
		filterrating.click();}
	public void brand() {
		filterbrand.click();}
	public void price(){
		filterprice.click();}
	public void availability() {
		filteravailability.click();}
	public void sorting() {
		Sorting.click();}
	public void newarrivalssorting() {
		newarrivals.click();
	}
	public void nextpage() {
		nextpage.click();
	}
}
