package SeleniumWebdrive.WebelementOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxOperations {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement emailbox=driver.findElement(By.id("email"));		
		emailbox.sendKeys("testusername@gmail.com");
		
//		driver.findElement(By.id("email")).sendKeys("testusername@gmail.com");
		
		Thread.sleep(1900);
		
		//emailbox.clear();
		
		String	s=emailbox.getAttribute("data-testid");
		System.out.println("getAttribut->data-testid->"+s);
		
		
		boolean b=emailbox.isDisplayed();
		System.out.println("isDisplayed-"+b);
		
		System.out.println("isEnabled-"+emailbox.isEnabled());
		
		System.out.println("value="+emailbox.getAttribute("value"));
		

	}

}
