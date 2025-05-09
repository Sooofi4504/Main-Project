package Page_Aliexpress;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Cart_Page {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='//www.aliexpress.com/p/shoppingcart/index.html']")WebElement cartpage;
	@FindBy(xpath = "//span[@class='cart-product-name-ope-trashCan']")WebElement removetheproduct;
	@FindBy(xpath = "//button[@class='comet-v2-btn comet-v2-btn-primary comet-v2-btn-important']") WebElement confirmremove;
	@FindBy(xpath = "//span[@class='comet-v2-checkbox-icon']")WebElement selectalltheproduct;
	@FindBy(xpath = "//span[text()='Checkout']//parent::button")WebElement checkout;
	
	public Cart_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void cartpagefunctionality() {
		cartpage.click();
		String acttitle="Shopping Cart";
    	String exptitle=driver.getTitle();
    	Assert.assertEquals(acttitle, exptitle,"The title doent match");
		driver.navigate().refresh();
		selectalltheproduct.click();
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.elementToBeClickable(checkout));
		checkout.click();	
	}
}
