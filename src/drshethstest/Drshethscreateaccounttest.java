package drshethstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drshethspages.Drshethscreateaccount;

public class Drshethscreateaccounttest  {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.drsheths.com/");
	}
	
	@Test
	public void testing() throws InterruptedException
	{
		Drshethscreateaccount ob = new Drshethscreateaccount(driver);
		Thread.sleep(3000);
		ob.accountclick();
		ob.createaccountclick();
		ob.setvalues("Akshay", "S B", "akashakshay994@gmail.com", "akashakshay");
		ob.submitclick();
	}
	

}
