import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TravelCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']"));
		driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']")).click();
		//Select static dropdown 
		Select select= new Select(dropdown);
		select.selectByIndex(3);
	    System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("AED");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("INR");
		System.out.println(select.getFirstSelectedOption().getText());
		
		//No of Adults travelling (+) icon
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		
		//Dynamic Dropdown
		
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		//driver.close();
		
		//Auto Suggestions
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(3000);
		List <WebElement> elements =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement element:elements)
		{
			if(element.getText().equalsIgnoreCase("india"))
					{
				      element.click();
				      break;
					}
			
		}
		//Clicking Checkbox-ctl00_mainContent_chk_friendsandfamily,ctl00_mainContent_chk_SeniorCitizenDiscount
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		
		
	}

}
