package SeleniumWebdrive.WebelementOperation;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserOperations {

	public static void main(String[] args) throws Exception {
	
	//	ChromeDriver driver=new ChromeDriver();
	InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://login.salesforce.com/");	
		
		/*String pagetitle=driver.getTitle();
		System.out.println("pagetitle->"+pagetitle);
		
	//	System.out.println(driver.getTitle());
		
		System.out.println("getCurrentUrl ->"+driver.getCurrentUrl());
		
		//System.out.println("getPageSource() ->"+driver.getPageSource());
		
		driver.navigate().to("https://www.google.co.in/");
		System.out.println("pagetitle after  URL navigation ->"+driver.getTitle());

		driver.navigate().back();		
		System.out.println("backwards title->"+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("forward title->"+driver.getTitle());*/
		
		driver.manage().window().maximize();
		Thread.sleep(900);
		//driver.manage().window().setPosition(new Point(-2000, 0));
		
		driver.quit();
		
		
	}

}
