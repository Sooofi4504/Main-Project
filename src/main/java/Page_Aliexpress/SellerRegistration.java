package Page_Aliexpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SellerRegistration {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='my-account--menuItem--1GDZChA my-account--newMenuItem--bSu9Hkj']") WebElement signinbutton;
	@FindBy(xpath = "//a[text()='Seller Log In']") WebElement sellerlogin;
	@FindBy(xpath = "//span[text()='Register']")WebElement regiterbutton;
	@FindBy(xpath = "//input[@aria-label='select']")WebElement country;
	@FindBy(xpath = "//div[text()='Germany']")WebElement countryselect;
	@FindBy(xpath = "//input[@id='email']")WebElement email;
	@FindBy(xpath = "//input[@placeholder='Please enter password.']")WebElement password;
	@FindBy(xpath = "//input[@placeholder='Please enter password again.']")WebElement repassword;
	@FindBy(xpath = "//input[@id='protocols']")WebElement policy;
	@FindBy(xpath = "//button[text()='Register']")WebElement register;
	
	public SellerRegistration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void sellerlogin() {
		Actions act=new Actions(driver);
		act.moveToElement(signinbutton);
		act.build().perform();
		sellerlogin.click();
		regiterbutton.click();
		country.click();
		countryselect.click();
		email.sendKeys("sufiyan663@gmail.com");
		password.sendKeys("Aliexpress@1234");
		repassword.sendKeys("Aliexpress@1234");
		policy.click();
		register.click();	
	}
}

