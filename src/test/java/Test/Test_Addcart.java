package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Add_cart;






public class Test_Addcart {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();	
	}
   @BeforeMethod
   public void url()
   {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

	   
	   driver.get("https://www.only.in");

	  
	   
	   
   }
   @Test
   public void test()
   {

	Add_cart AC=new Add_cart(driver);
	AC.ToCart();
	
   }

}