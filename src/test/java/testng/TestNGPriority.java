package testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPriority {

	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Run  BeforeSuite() via TestNG sucessfully");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before BeforeTest() Run Successfully");
	}
	
	@BeforeMethod
	public void BeforeEachMethod()
	{
		System.out.println("Run  BeforeEachMethod() via TestNG sucessfully");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Run  test1() via TestNG sucessfully");
		Assert.assertEquals("Sample", "Sample");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Run  test2() via TestNG sucessfully");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("Run  AfterMethod() via TestNG sucessfully");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("Before AfterTest() Run Successfully");
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("Run  AfterSuite() via TestNG sucessfully");
	}
	
}
