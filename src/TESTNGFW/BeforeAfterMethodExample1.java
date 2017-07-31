package TESTNGFW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BeforeAfterMethodExample1 {
	 @Test(priority=1,groups="smoke")
	  public void verifyprodprice() {
		  System.out.println("verifyprodprice");
	  }
	  @Test(priority=2,groups="reg")
	  public void verifyprodimg() {
		  System.out.println("verifyprodimg");
	  }
	  @Test(priority=3,groups="smoke")
	  public void verifyprodava() {
		  System.out.println("verifyprodava");
	  }
	  
	  
	 /* @BeforeClass
	  public void login() {
		  System.out.println("login");
		  
	  }*/

	  @AfterTest
	  public void logout() {
		  System.out.println("logout");
	  }

}
