package BasicsMain;

import org.testng.annotations.Test;

//Priority least will execute first
//if No priority is given then it consider default priority as 0
//if both priority has same digit then alphabetic order is considered

public class TestNGBasicsPriority {
	
	@Test(priority=1)
	public void okj()
	{
		System.out.println("Priority 1 is printed ");
	}
	
	@Test(priority=0)
	public void abc()
	{
		System.out.println("Priority 0 and abc is printed ");
	}
	
	@Test(priority=-1)
	public void ghi()
	{
		System.out.println("Priority -1 is printed ");
	}
	
	@Test(priority=-2)
	public void jkz()
	{
		System.out.println("Priority -2 jkz is printed ");
	}
	

	@Test(priority=-2)
	public void jkm()
	{
		System.out.println("Priority -2 jkm is printed ");
	}
	
	@Test
	public void def()
	{
		System.out.println("No Priority is printed ");
	}
	
	

}
