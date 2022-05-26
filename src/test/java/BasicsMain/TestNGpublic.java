package BasicsMain;

import org.testng.annotations.Test;

@Test
public class TestNGpublic {
	
	public void test1()
	{
		System.out.println("test 1 is executed which is public");
	}
	
	public void test2()
	{
		System.out.println("test 2 is executed which is public");
	}
	
	private void test3()
	{
		System.out.println("test 3 is not executed which is private");
	}
	
	protected void test4()
	{
		System.out.println("test 4 is not executed which is protected");
	}
	
	

}
