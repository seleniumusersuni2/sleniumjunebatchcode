package TESTNGFW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BeforeAfterMethodExample {
	
	  @BeforeTest
	  public void login() {
		  System.out.println("login");
		  
	  }

	  /*@AfterClass
	  public void logout() {
		  System.out.println("logout");
	  }
*/
	  
  @Test(priority=1,groups="smoke")
  public void verifydept() {
	  System.out.println("verifydept");
	
  }
  @Test
  public void verifylang() {
	  System.out.println("verifylang");
	//  Assert.assertEquals(1, 2);
  }
  @Test(priority=3,groups="reg",invocationCount=6)
  public void verifycart() {
	  System.out.println("verifycart");
  }
  
  

}
