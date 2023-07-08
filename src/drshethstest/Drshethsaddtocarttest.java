package drshethstest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drshethspages.Drshethsaddtocart;

public class Drshethsaddtocarttest  {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.drsheths.com/");
	}
	
	@Test
	public void test() throws IOException, InterruptedException
	{
		Drshethsaddtocart ob1= new Drshethsaddtocart(driver);
		Thread.sleep(3000);
		ob1.productclick();
		ob1.addtocartclick();
	}

}
