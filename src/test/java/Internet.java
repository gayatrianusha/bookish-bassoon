import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Internet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Program Files//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
       WebElement search=driver.findElement(By.xpath("//input[@name='q']"));

       search.sendKeys("javascript");
      
       Thread.sleep(4000);
      List<WebElement>options= driver.findElements(By.cssSelector("ul[class='G43f7e'] li div[class='pcTkSc']"));
      Thread.sleep(4000);
    System.out.println(options.size());
     
     for(WebElement option:options)
     {
    	 
    	 if(option.getText().equalsIgnoreCase("javascript data types"))
    	 {
    		 System.out.println(option.getText());
    		 option.click();
    		 break;
    	 }
     }
       
		
		

	}

}
