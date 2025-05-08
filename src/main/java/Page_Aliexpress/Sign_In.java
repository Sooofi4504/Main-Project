package Page_Aliexpress;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='my-account--menuItem--1GDZChA my-account--newMenuItem--bSu9Hkj']") WebElement signinbutton;
	@FindBy(xpath = "//button[@class='my-account--signin--RiPQVPB']") WebElement signin;
	@FindBy(xpath = "//input[@class='cosmos-input']") WebElement emailid;
	@FindBy(xpath = "//span[text()='Continue']")WebElement countinuebutton;
	@FindBy(xpath = "//input[@name='fm-login-password']") WebElement password;
	@FindBy(xpath = "//button[@aria-label='Sign in']" )WebElement signintoex;
public Sign_In(WebDriver driver) {
   this.driver=driver;
PageFactory.initElements(driver, this);
}
public void registerpage() {
Actions act=new Actions(driver);
act.moveToElement(signinbutton);
act.build().perform();
signin.click();
emailid.sendKeys("sufiyanku4504@gmail.com",Keys.ENTER);
password.sendKeys("Sufiyan@4504");
signintoex.click();
driver.navigate().back();
}

}

