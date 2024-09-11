package Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Page.ScrollDown;



public class Test_Down {
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
   public void test() throws Exception 
   {

	ScrollDown AC=new ScrollDown(driver);
	
	AC.Toscreen();
	
	 String url="https://www.only.in";
	 URL ob=new URL(url);
    
     HttpURLConnection con=(HttpURLConnection)ob.openConnection();
     int code=con.getResponseCode();
     System.out.println(code);
     con.connect();
     if(con.getResponseCode()==200)
     {
     System.out.println("valid url");
     }
     else
      {
     System.out.println("invalid");
          
      }
	
   }

}