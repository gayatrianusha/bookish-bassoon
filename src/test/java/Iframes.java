import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Program Files//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		/*1. Enter Text in textbox
		2. Select the checkbox
		3. Update entered text in textbox
		4. Select value from dropdown */
		
		driver.get("https://chercher.tech/practice/frames");
		WebElement frame1=driver.findElement(By.id("frame1"));
		WebElement frame2=driver.findElement(By.id("frame2"));
		//WebElement frame3=driver.findElement(By.id("frame3"));
		
		//From Main content to frame 1
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.tagName("input")).sendKeys("text");
		WebElement frame3=driver.findElement(By.id("frame3"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).sendKeys("Updated text");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		Select dropdown= new Select(driver.findElement(By.id("animals")));
		dropdown.selectByVisibleText("Baby Cat");
			
		driver.switchTo().defaultContent();
		
		
		
		
		
		

	}

}
