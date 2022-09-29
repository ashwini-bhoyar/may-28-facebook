package facebook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeClass
	
	public void beforeClass() {
		System.out.println("Before Class");
	}
@BeforeClass
	
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test
    
    public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	
	public void test2() {
		System.out.println("Test 2");
	}
	
	@AfterMethod
	
	public void afterClass() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass1() {
		System.out.println("Before Class");
	}

}
