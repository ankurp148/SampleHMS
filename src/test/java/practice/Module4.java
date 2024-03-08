package practice;

import org.testng.annotations.Test;

public class Module4 {
	@Test (groups = "system")
	
	public void method3_Test()
	{
		System.out.println("====TEST SCRIPT 03====");
	}
	
	@Test (groups = {"regression","smoke"})
	
	public void method4_Test()
	{
		System.out.println("====TEST SCRIPT 04====");
	}
	
	@Test(groups = "smoke")
	
	public void method5_Test()
	{
		System.out.println("====TEST SCRIPT 05====");
	}
	
	@Test (groups = "system")
	
	public void method6_Test()
	{
		System.out.println("====TEST SCRIPT 06====");
	}



}
