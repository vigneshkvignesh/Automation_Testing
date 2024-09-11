package Page;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollDown {

	
	WebDriver driver;
	//By SEserch=By.name("search");
	
	
	public ScrollDown(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String search)
	{
		//driver.findElement(onname).sendKeys(firstname);
	}
	
	public void Toscreen() throws IOException//
	{
		
		
					//scroll down to the bottom of page and click about us
						
	JavascriptExecutor j=(JavascriptExecutor) driver;//use this interface
	j.executeScript("window.scrollBy(0,5000)", "");
				
 driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/div/div[3]/div/div/div/div/div/div/div[5]/a[1]")).click();
						
				
				
				
	
		
		}


	
}
