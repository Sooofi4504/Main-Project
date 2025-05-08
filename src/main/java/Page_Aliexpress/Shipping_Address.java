package Page_Aliexpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Address {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='es--wrap--RYjm1RT']") WebElement shippingdetails;
	@FindBy(xpath = "//div[@class='select--text--1b85oDo']")WebElement country;
	@FindBy(xpath = "//div[@class='select--item--32FADYB']") WebElement countryselect;
	@FindBy(xpath = "//*[@id=\"_full_container_header_23_\"]/div[2]/div/div[2]/div[2]/div[2]/div[3]/div/div[1]") WebElement state;
	@FindBy(xpath = "//div[text()='California']") WebElement stateselect;
	@FindBy (xpath = "//span[text()='Abbeville']//parent::div") WebElement city;
	@FindBy(xpath = "//div[text()='Greenview']") WebElement cityselect;
	@FindBy(xpath = "//div[text()='Save']") WebElement save;
	
	
	public Shipping_Address(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void selectcountry() {
	shippingdetails.click();
	country.click();
	countryselect.click();
	state.click();
	stateselect.click();
	city.click();
	cityselect.click();
	save.click();
	}
	
	

}
