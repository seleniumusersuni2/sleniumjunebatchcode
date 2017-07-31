package TESTNGFW;

import java.lang.reflect.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Testngexample {

	
	@Test(priority=1,description="this metod for login")
	public void E()
	{
		System.out.println("calling E method");
	}
	@Test(priority=2)
	public void C()
	{
		System.out.println("calling C method");
	}
	@Test(priority=3)
	public static void A() throws Exception
	{
		System.out.println("calling A method");
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		Thread.sleep(5600);		 
		driver.findElement(By.xpath("//input[@class='pole_plik']")).click();
		Thread.sleep(2600);
		Runtime.getRuntime().exec("C:\\Suneetha-latet backup\\Training\\TestData\\AutoITScript.exe");
*/
	}//m1 close
	
	@Test(priority=4)
	public void B() throws Exception
	{
		System.out.println("calling B method");
		/*InternetExplorerDriver driver = new InternetExplorerDriver(); 	
		
	 	  
		  driver.get("https://www.google.co.in/"); 
		//To zoom In page 4 time using CTRL and + keys.
		for(int i=0; i<4; i++){ 
			Thread.sleep(900);
			  driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));			  
			  }//for close
		
		//To zoom out page 4 time using CTRL and - keys.
		  for(int i=0; i<4; i++){
			  Thread.sleep(900);
			  driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
	}//for close
	*/
	} //m2() close
	
	
	@Test(priority=5)
	
	public void D()
	{
		System.out.println("calling D method");
	}
	
}
