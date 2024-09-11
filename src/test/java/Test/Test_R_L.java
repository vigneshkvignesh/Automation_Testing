package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Reg_Log;





public class Test_R_L {
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
	  // driver.get("https://www.only.in/login?login_with=register");//
	   driver.get("https://www.only.in/login?login_with=email");
	   //driver.get("https://www.only.in/login?login_with=telephone");
	  
	   
	   
   }
   @Test
   public void test()
   {
//	  Reg_Log ob=new Reg_Log(driver);
//	   ob.setvalues("Vignesh k","vigneshkuttikkatil@gmail.com","7034968966","Appu@123","30/05/1999");
//	   ob.register();
	   
	   
	   Reg_Log ab=new Reg_Log(driver);
	   ab.setvalues("vigneshkuttikkatil@gmail.com","Appu@123");
       ab.login();
   }

}