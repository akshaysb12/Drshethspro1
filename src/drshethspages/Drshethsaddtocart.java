package drshethspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Drshethsaddtocart {
	
	WebDriver driver;
	
	By product = By.xpath("//*[@id=\"products-grid\"]/div[1]/div/div[4]/div/div/div[1]/a/div[2]/img");
	By addtocart = By.xpath("//*[@id=\"product-main-form\"]/div[3]/div[1]/div[2]/div[1]/div/div/button");
	
	public Drshethsaddtocart(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public void productclick()
	{
		driver.findElement(product).click();
	}
	
	public void addtocartclick()
	{
		driver.findElement(addtocart).click();
	}

}
