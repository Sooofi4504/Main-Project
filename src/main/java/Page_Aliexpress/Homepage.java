package Page_Aliexpress;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Homepage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[7]/div/div/div/div[2]/div[1]") WebElement product1;
	@FindBy(xpath = "//*//*[@id=\"root\"]/div[2]/div[7]/div/div/div/div[2]/div[2]")WebElement product2;
	@FindBy(xpath = "//span[text()='Add to cart']")WebElement addtocart;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void productpage1() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView;",product1);
		product1.click();
		String parent=driver.getWindowHandle();
		Set<String> windowid=driver.getWindowHandles();
		for(String window:windowid) {
			if(!parent.equalsIgnoreCase(window)) {
				driver.switchTo().window(window);
				addtocart.click();	
			}
		}
		driver.close();
		driver.switchTo().window(parent);
	}
		public void productpage2() {
			driver.navigate().to("https://www.aliexpress.com/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView;",product2);
			product1.click();
			String parent=driver.getWindowHandle();
			Set<String> windowid=driver.getWindowHandles();
			for(String window:windowid) {
				if(!parent.equalsIgnoreCase(window)) {
					driver.switchTo().window(window);
					addtocart.click();
				}
			}
			driver.close();
			driver.switchTo().window(parent);
		}
}
