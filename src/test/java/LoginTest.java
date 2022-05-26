import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod(groups= {"group1"})
	public  void beforemethod()
	{
		 WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		
	}
	
	
	
	
	@Test(dataProvider="loginData")
	public void userLoginPage(String uname, String paswd)
	{
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(paswd);
		
	}
}
