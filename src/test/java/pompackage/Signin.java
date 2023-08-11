package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class Signin extends Baseclass{
	
	@FindBy(linkText="Sign in")WebElement Text;
	@FindBy(id="ap_email")WebElement Email;
	@FindBy(id="continue")WebElement Continue;
	@FindBy(id="ap_password")WebElement Password;
	@FindBy(name="rememberMe")WebElement Rememberme;
	@FindBy(id="signInSubmit")WebElement Signinn;
	@FindBy(id="Account & Lists")WebElement Hello;
	
	public Signin() {
		PageFactory.initElements(driver,this);
		
	}

public void hellosignin(){
	Text.click();
	
}
public void Email(String name) {
	Email.sendKeys(name);
}
public void Continue() {
	Continue.click();
}
public void password(String pass) {
	Password.sendKeys(pass);
}
public void Rememberme() {
	Rememberme.click();
	
}
public void Signinn() {
	Signinn.click();
}
public void verify() {
	boolean a=driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
	System.out.print(a);
}
public void username() {
	Email.sendKeys(prop.getProperty("username"));

}
public void password() {
	Password.sendKeys(prop.getProperty("password"));
}
}