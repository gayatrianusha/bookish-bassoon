package TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	
	WebDriver driver;
	ExtentReports extentreports;
	ExtentSparkReporter extentspark;
	ExtentTest etest;
	
	@BeforeTest
	public void beforetest()
	{
		extentreports= new ExtentReports();
		extentspark= new ExtentSparkReporter("target/sparkreports.html");
		extentreports.attachReporter(extentspark);
			
	}
	@BeforeMethod
	public void setup()
	{
		  WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		  driver.manage().window().maximize();
	}
  @Test
  public void cypress() {
	  etest=extentreports.createTest("Cypress Test");
	  driver.get("https://www.google.com");
	  WebElement search= driver.findElement(By.name("q"));
	  search.sendKeys("cypress tutorial");
	  search.submit();
	  Assert.assertEquals(driver.getTitle(),"cypress tutorial - Google Search");
	 
  }
  
  @Test
  public void Java() {
	  etest= extentreports.createTest("Java Test");
	  driver.get("https://www.google.com");
	  WebElement search= driver.findElement(By.name("q"));
	  search.sendKeys("Java tutorial");
	  search.submit();
	  Assert.assertEquals(driver.getTitle(),"Java tutorial - Google Search");
	  
  }
  
  @Test
  public void selenium() {
	  etest =extentreports.createTest("Selenium Test");
	  driver.get("https://www.google.com");
	  WebElement search= driver.findElement(By.name("q"));
	  search.sendKeys("Selenium tutorial");
	  search.submit();
	  Assert.assertEquals(driver.getTitle(),"Selenium tutorial - Google Search");
	  
  }
  
  @AfterMethod
  public void teardown(ITestResult result)
  {
	  if(ITestResult.FAILURE==result.getStatus())
	  driver.close();
  }
  
  @AfterTest
  public void afterTest()
  {
	  extentreports.flush();
	  
  }
}
