package BasicsMain;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependsOnGroups {
	
	@Test(dependsOnGroups="Motor")
	public void test1()
	{
		System.out.println("second executed");
		
	}
	
	

	@Test(groups= {"Motor"})
	public void test4()
	{
		System.out.println("Test Motor group");
		
	}
	
	@Test(groups= {"Motor"})
	public void test3()
	{
		Assert.fail();
		
	}

}
