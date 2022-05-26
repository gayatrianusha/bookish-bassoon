package BasicsMain;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(BasicsMain.Listeners.class)
public class TestNGDependsOnMethods {
	
	@Test(dependsOnMethods="getData")
	public void test()
	{
		System.out.println("Second Method executed after Main Method");
	}

	@Test
	public void getData() {
		Assert.fail();
		System.out.println("Main method first executed");
	}
}
