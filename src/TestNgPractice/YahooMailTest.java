package TestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooMailTest {
	
	// Revised
	
//	launch Firefox browser
//	login to app
//	compose mail test
//	log out from the app
//	login to app
//	delete Mail Test
//	log out from the app
//	login to app
//	search Mail Test
//	log out from the app
//	Quit the browser
	
	
	//@BC,@BM,@Test,@AM,@AC --- order of execution of the TestNg assertions.
	// After completing all the @Test assertions then @AC will execute.
	
	// 1
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch Firefox browser");
	}
	
	// 2 // 5 
	@BeforeMethod
	public void login() {
		System.out.println("login to app");
	}

	// 3
	@Test(priority = 1)
	public void composeMailTest() {
		System.out.println("compose mail test");
	}
	
	// 6
	@Test(priority = 2, enabled = true)
	public void deleteMailTest() {
		System.out.println("delete Mail Test");
	}
	
	
	@Test(priority = 3)
	public void searchMailTest() {
			System.out.println("search Mail Test");
//			int i = 9/0;
	}
	
	@Test(priority=4)
	public void sentItemsMailList() {
		System.out.println("sent Items Mail List");
	}
	
	// 4 // 7
	@AfterMethod
	public void logout() {
		System.out.println("log out from the app");
	}
	
	// 8
	@AfterClass
	public void quitBrowser() {
		System.out.println("Quit the browser");
		
	}
}
