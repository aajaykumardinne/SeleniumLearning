package TestNgConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	// Revised

	// Pre-Conditions annotations -- starting with @Before
	
	// @annotations order of execution -- @BS,@BT,@BC,@BM,@Test,@AM,@AC,@AT,@AS
	
	@BeforeSuite // 1
	public void setUp() {
		System.out.println("@BeforeSuite -- setup system property for chrome");
	}

	@BeforeTest // 2
	public void launchBrowser() {
		System.out.println("@BeforeTest -- Launch Chrome Browser");
	}
	
	@BeforeClass  // 3
	public void login() {
		System.out.println("@BeforeClass -- login to app");
	}
	
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("@BeforeMethod  -- enter URL");
		
	}
	
	// test cases -- starting with @Test
	// @BM
	// @Test-1
	// @AM
	
	// BM
	// @Test-2
	// @AM
	
   @Test // 5
	public void googleTitleTest() {
		System.out.println("@Test -- Google Title Test");
	}
   
   @Test 
   public void googleLogoTest() {
	   System.out.println("@Test --  google Logo test");
   }
   
   
//   @Test 
//   public void searchTest() {
//	   System.out.println("@Test --  search test");
//   }
   
	
	// post conditions  -- starting with @After
	@AfterMethod // 6 
	public void logOut() {
		System.out.println("@AfterMethod  -- logout from app");
	}
	
	
	@AfterTest // 8
	public void deleteAllCookies() {
		System.out.println("@AfterTest -- deleteAllCookies");
		
	}
	
	@AfterClass // 7
	public void closeBrowser() {
		System.out.println("@AfterClass  -- Close browser");
	}
	
	
	@AfterSuite // 9
	public void generateTestReport() {
		System.out.println("@AfterSuite -- generateTestReport");
	}
	
	
	
	
	
}
