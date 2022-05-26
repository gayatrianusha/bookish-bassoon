package BasicsMain;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportsCheck {

	 WebDriver driver;
	 ExtentReports report;
	 ExtentSparkReporter spark;
	 ExtentTest etest;
	 
    @BeforeTest
	public void beforeTest()
	{
		
		report= new ExtentReports();
		spark= new ExtentSparkReporter("target/sparkreports.html");
		report.attachReporter(spark);
	}
    
    @BeforeMethod
    public void setup()
    {
    	WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
    }
		@Test
		public void test()
		{
			etest= report.createTest("JavaTpoint");
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("JavaTPoint");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			driver.manage().window().maximize();
		}
		
		
		@AfterTest
		public void teardown()
		{
			report.flush();
			driver.close();
		}
	}
	
	
	
