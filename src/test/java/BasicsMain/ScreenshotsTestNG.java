package BasicsMain;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtility.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsTestNG {
	
	WebDriver driver;
	
	@Test
	public void test() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("JavaPoint");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
	    String path=Utility.getScreenshot(driver);
		/*TakesScreenshot screen= (TakesScreenshot)driver;
		File fin=screen.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")+ "//src//test//java//Screenshots/" +System.currentTimeMillis()+".png";
		FileUtils.copyFile(fin,new File(path));*/
		
	}

}
