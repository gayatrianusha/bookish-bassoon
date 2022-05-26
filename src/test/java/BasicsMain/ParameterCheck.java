package BasicsMain;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;



public class ParameterCheck {
	
	
	@Parameters({"School"})
	@Test
	public void test(String test1)
	{
		System.out.println("School" +test1);
	}
	
	@Test
	@Parameters({"Inter"})
	public void test1(String test2)
	{
		System.out.println("Inter" +test2);
	}

	@Parameters({"Degree"})
	@Test
	public void test3(String test3)
	{
		System.out.println("Degree" +test3);
	}
}
