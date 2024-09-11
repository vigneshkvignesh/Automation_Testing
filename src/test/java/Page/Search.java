package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {

	
	WebDriver driver;
	By SEserch=By.name("search");
	
	
	public Search(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String search)
	{
		//driver.findElement(onname).sendKeys(firstname);
	}
	
	public void Tosearch()//
	{
		
		 
	driver.findElement(By.xpath("//*[@id=\"search_query\"]")).sendKeys("shirts");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[3]/div[1]/div/div[1]")));
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[3]/div[1]/div/div[1]")).click();
		
		
		}


	
}
