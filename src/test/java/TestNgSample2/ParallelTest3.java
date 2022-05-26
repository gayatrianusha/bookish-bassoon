package TestNgSample2;

import org.testng.annotations.Test;

public class ParallelTest3 {


		@Test
		public void test1()
		{
			
			long id= Thread.currentThread().getId();
			System.out.println("Sample 3-Test one:"+id);
			
		}
		@Test
		public void test2()
		{
			
			long id= Thread.currentThread().getId();
			System.out.println("Sample 3 -Test two:"+id);
			
		}
		@Test
		public void test3()
		{
			
			long id= Thread.currentThread().getId();
			System.out.println("Sample 3 -Test Three:"+id);
			
		}
		@Test
		public void test4()
		{
			
			long id= Thread.currentThread().getId();
			System.out.println("Sample 3-Test Four:"+id);
			
		}
		@Test
		public void test5()
		{
			
			long id= Thread.currentThread().getId();
			System.out.println("Sample 3 -Test Five:"+id);
			
		}
		@Test
		public void test6()
		{
			
			long id= Thread.currentThread().getId();
			System.out.println("Sample 3 -Test six:"+id);
			
		}


	
}
