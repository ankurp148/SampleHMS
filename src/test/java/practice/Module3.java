package practice;

import org.testng.annotations.Test;

public class Module3 
{
	@Test(groups = "smoke")
	
	public void method1_Test()
	{
		System.out.println("====TEST SCRIPT 01====");
	}
	
	@Test(groups = "system")
	
	public void method2_Test()
	{
		System.out.println("====TEST SCRIPT 02====");
	}

}
