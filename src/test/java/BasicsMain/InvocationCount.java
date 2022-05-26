package BasicsMain;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=5)
	public void count()
	{
		System.out.println("Invocation Count");
	}

}
