package BasicsMain;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDataProvider {

	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void paramatercheck(String browser)
	{
		System.out.println("browser:"+browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
		     driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.get("https://mvnrepository.com/");
		}
		else 
		{
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
			driver.get("https://www.simplilearn.com/know-about-testng-annotations-in-selenium-webdriver-article");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
		
	}
	
	
	@Test(dataProvider="getdata")
	public void dataprovidervalidation(String name, String Password)
	{
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("radius")).click();
		System.out.println("Username is:"+name+"Passoword is:"+Password);
		
		
	}
	
	
	@DataProvider(name="getdata")
	public Object[][] check()
	{
		return new Object[][]
				{
			
			{"login1","password1"},
			{"login2","password2"},
			{"login3","password3"}
			
				};
				
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
}
