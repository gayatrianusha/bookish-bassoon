import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Start {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://Program Files//chromedriver.exe");//setting path of chrome driver
		WebDriver driver= new ChromeDriver(); // WebDriver is an Interface , so all the methods can be used in ChromDriver class,firefox class, etc.
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //By.classs name means any one class can be given(By.classname("simple") //if By.xpath then entire class name should be given Classname="simple check"
	// type='Password' in HTML webpage/for css selector we can give [type*='Pass'] but for xpath [contains(@type,'Pass')]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	  driver.findElement(By.id("inputUsername")).sendKeys("GayatriAnusha");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test");
	  driver.findElement(By.className("signInBtn")).click();
	 // Thread.sleep(1000);
	  String test=driver.findElement(By.className("error")).getText();
	  System.out.println(test);
	 driver.close();
      

	}
	
}

//Urls to Practice
//https://rahulshettyacademy.com/dropdownsPractise/
