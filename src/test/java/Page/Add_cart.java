package Page;  

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_cart {

	
	WebDriver driver;
	//By SEserch=By.name("search");
	
	
	public Add_cart(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String search)
	{
		//driver.findElement(onname).sendKeys(firstname);
	}
	
	public void ToCart()//
	{
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/div[3]/div/div[2]/div/div/ul/li[12]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main-cat-heading\"]/i")).click();		
		driver.findElement(By.xpath("//*[@id=\"category390188\"]/ul/li[1]/span/a/span[1]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"category0390189\"]/ul[1]/li/a")).click();
		driver.findElement(By.xpath("//*[@id=\"carousel-401502\"]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[3]/div/a[3]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/div[2]/div[4]/div[4]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/div[2]/span/div[3]/button")).click();
		
		}


	
}
