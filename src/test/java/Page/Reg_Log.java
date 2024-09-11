package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg_Log {
	ChromeDriver driver;
	//By onname=By.name("firstname");
	By onemail=By.name("email");
	//By onphone=By.name("telephone");
	By onpassword=By.name("password");
	//By ondob=By.name("dateofbirth");
	//By onregister=By.xpath("//*[@id=\"register-form\"]/div[2]/div[1]");
	 
	By onlogin=By.xpath("//*[@id=\"login-with-email\"]/form/div[3]/input");
	
	
	public Reg_Log(WebDriver driver)
	{
		this.driver= (ChromeDriver) driver;
	}
	//public void setvalues(String firstname,String email,String telephone,String password,String dateofbirth)
	
	public void setvalues(String email,String password)
	{
		//driver.findElement(onname).sendKeys(firstname);
		//driver.findElement(onemail).sendKeys(email);
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		//driver.findElement(By.xpath("//*[@id=\"input-registration-telephone\"]")).sendKeys(telephone);
		//driver.findElement(By.xpath("//*[@id=\"input-registration-password\"]")).sendKeys(password);
		//driver.findElement(ondob).sendKeys(dateofbirth);
		
		//login
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(password);
	}
	//public void register()//
	public void login()//
	{
		//driver.findElement(bdregister).click();
		 
		driver.findElement(onlogin).click();
	}
}