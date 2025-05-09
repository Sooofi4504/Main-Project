package Test_Aliexpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.Base_Aliexpress;
import Page_Aliexpress.Cart_Page;
import Page_Aliexpress.Homepage;
import Page_Aliexpress.SellerRegistration;
import Page_Aliexpress.Shipping_Address;
import Page_Aliexpress.Sign_In;

public class Test extends Base_Aliexpress{
	@org.testng.annotations.Test(priority = 0)
	public void Registration_test() {
		String acturl=("https://www.aliexpress.com/");
		String expurl=driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl,"The homepage is verified");
	Sign_In si=new Sign_In(driver);
	si.registerpage();
	}
    @org.testng.annotations.Test(priority = 1)
	public void productpage() {
	Homepage homepageproduct=new Homepage(driver);
	homepageproduct.productpage1();
	}
    @org.testng.annotations.Test(priority =2)
    public void product2() {
    	Homepage homepageproduct1=new Homepage(driver);	
    	homepageproduct1.productpage2();
    }
    @org.testng.annotations.Test(priority = 3)
    public void shippingdetails() throws InterruptedException {
    	Shipping_Address sd=new Shipping_Address(driver);
    	sd.selectcountry();
    	Thread.sleep(3000);
    }
    @org.testng.annotations.Test(priority = 4)
    public void cartpage()  {
    	Cart_Page cp=new Cart_Page(driver);
    	cp.cartpagefunctionality();
    }
   @org.testng.annotations.Test(priority = 5)
   public void sellerregisteration() {
	   SellerRegistration sr=new SellerRegistration(driver);
	   sr.sellerlogin();
	   
   }
   
}
