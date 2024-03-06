package practice;

import org.testng.annotations.Test;

public class Demo 
{
	@Test(groups = "smoke")
	
	public void method1_Test()
	{
		System.out.println("====Papdi Chat====");
	}
	
	@Test(groups = "system")
	
	public void method2_Test()
	{
		System.out.println("====TEST SCRIPT 02====");
	}

}
