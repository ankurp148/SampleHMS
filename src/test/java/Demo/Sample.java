package Demo;

import org.testng.annotations.Test;

public class Sample {
	@Test (groups = "system")
	
	public void method3_Test()
	{
		System.out.println("====TEST SCRIPT 13====");
	}
	
	@Test (groups = {"regression","smoke"})
	
	public void method4_Test()
	{
		System.out.println("====TEST SCRIPT 14====");
	}
	
	@Test(groups = "smoke")
	
	public void method5_Test()
	{
		System.out.println("====TEST SCRIPT 15===");
	}
	
	@Test (groups = "system")
	
	public void method6_Test()
	{
		System.out.println("====TEST SCRIPT 16====");
	}



}
