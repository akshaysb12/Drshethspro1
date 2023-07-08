package drshethspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Drshethscreateaccount {
	
	WebDriver driver;
	
	By Account = By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	By Createaccount = By.xpath("//*[@id=\"customer_login\"]/div[2]/div[1]/button");
	By Firstname = By.xpath("//*[@id=\"FirstName\"]");
	By Lastname = By.xpath("//*[@id=\"LastName\"]");
	By Email = By.xpath("//*[@id=\"Email\"]");
	By Password = By.xpath("//*[@id=\"CreatePassword\"]");
	By Submit = By.xpath("//*[@id=\"create_customer\"]/div/div/div[2]/ul/li[3]/div/input");
	
	

	public Drshethscreateaccount(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public void accountclick()
	{
		driver.findElement(Account).click();
	}
	
	public void createaccountclick()
	{
		driver.findElement(Createaccount).click();
	}
	
	public void setvalues(String First , String Last , String Emailaddress , String pass)
	{
		driver.findElement(Firstname).sendKeys(First);
		driver.findElement(Lastname).sendKeys(Last);
		driver.findElement(Email).sendKeys(Emailaddress);
		driver.findElement(Password).sendKeys(pass);
	}
	
	public void submitclick()
	{
		driver.findElement(Submit).click();
	}
	
	
	

}
