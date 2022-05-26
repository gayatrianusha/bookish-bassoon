package BasicsMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTest {
	
	WebDriver driver;
	@Test
	public void test() {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 //System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerLinks=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerLinks.findElements(By.tagName("a")).size());
		WebElement footerpartLinks=footerLinks.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerpartLinks.findElements(By.tagName("a")).size());
		
	}

}
