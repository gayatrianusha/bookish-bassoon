package BasicsMain;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class has been executed seventh");
	}
	
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("After Test has been exeuted eight");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite has been executed Nine");
		
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test is executed second");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class is executed Third");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite is executed first");
		
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method is executed Fourth");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test has been executed fifth");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method has been executed sixth");
	}

}

