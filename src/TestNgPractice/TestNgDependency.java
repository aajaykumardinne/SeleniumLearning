package TestNgPractice;

import org.testng.annotations.Test;

public class TestNgDependency {
	
	
	// Revised
	// For achieving the TestNg Dependency use the dependsOnMethods() method
	
	@Test
	public void method1() {
		System.out.println("method1");
//		int i =9/0;
	}

	@Test(dependsOnMethods = {"method1"})
	public void method2() {
		System.out.println("method 2");
	}
	
}


// if method 1 is failed then method 2 will be skipped.

// if method 1 is passed then method 2 will be executed.