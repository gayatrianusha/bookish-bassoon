package BasicsMain;

import org.testng.annotations.Test;

public class TestNGGroups {

	@Test(groups= {"Car","Metro"})
	public void groupTest()
	{
		System.out.println("Car and Metro group-Test Case1");
	}
	
	@Test(groups= {"Bike"})
	public void groupTest2()
	{
		System.out.println("Bike group-Test Case1");
		
	}
	
	@Test(groups= {"Metro"})
	public void groupTest1()
	{
		System.out.println("Metro group-Test Case1");
	}
	
	@Test(groups= {"Bicycle"})
	public void groupTest3()
	{
		System.out.println("Bicycle group-Test Case1");
		
	}
	
	
}
