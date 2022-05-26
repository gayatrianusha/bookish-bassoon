package BasicsMain;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAlwaysRun {
	
	
@Test(alwaysRun=true,dependsOnMethods="dependsOne")
public void alwaysattributetrue()
{
	System.out.println("Always attribute true method");
}


@Test(dependsOnMethods="dependsOne")
public void dependstwo()
{
System.out.println("dependent method");
}



@Test(alwaysRun=false)
public void alwaysattributefalse()
{
	System.out.println("Always attribute false method");
}

@Test
public void dependsOne()
{
	
	Assert.fail();

}
}