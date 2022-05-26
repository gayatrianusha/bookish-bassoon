package BasicsMain;

import org.testng.annotations.Test;

public class TestNGEnabled {

	@Test(enabled=true)
	public void test() {
		System.out.println("Enabled");
	}
	
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("disabled");
	}
}
