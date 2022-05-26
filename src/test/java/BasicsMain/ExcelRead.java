package BasicsMain;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelRead {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		
		
		
	}
	
	/*@Test
	public void userLoginTest() throws IOException
	{
		
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys();
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.className("radius")).click();
		
	}*/
		
	
	
	
	@Test	
	public void test() throws IOException {
		//String objPath="";
		String path= System.getProperty("user.dir")+"//src//test//resources//test data//ExcelData.xlsx";
		File fin= new File(path);
		FileInputStream fis= new FileInputStream(fin);
		XSSFWorkbook check = new XSSFWorkbook(fis);
		XSSFSheet sheet= check.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell= row.getCell(0);
		
		System.out.println("Print first row:" +sheet.getRow(0).getCell(0));
		
		/* int rowNum=sheet.getLastRowNum();
		 for(int i=1;i<=rowNum;i++)
		 {
			 XSSFRow row= sheet.getRow(i);
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(objName))
			{
				objPath=row.getCell(1).getStringCellValue();
			}
			 
		 }
		 return objPath;
		 }
	}*/
	
	

}
}