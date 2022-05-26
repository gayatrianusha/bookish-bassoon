package TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
	
	@BeforeMethod(groups= {"group1"})
	public  void beforemethod()
	{
		 WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		
	}
  @Test(enabled=false)
  public void Sample() {
	  driver.get("https://www.google.com");
	  WebElement search= driver.findElement(By.name("q"));
	  search.sendKeys("Java tutorial");
	  search.submit();
	  Assert.assertEquals(driver.getTitle(),"Java tutorial - Google Search");
	  
  }
  
  @Test(groups= {"group1"})
  
  public void Sample2()
  {
	  driver.get("https://www.google.com");
	  WebElement search= driver.findElement(By.name("q"));
	  search.sendKeys("Selenium tutorial");
	  search.submit();
	  Assert.assertEquals(driver.getTitle(),"Selenium tutorial - Google Search");
	  
	  
	  
  }
  
  @AfterMethod(groups= {"group1"})
  public void teardown()
  {
	  driver.close();  
	  
  }
}
