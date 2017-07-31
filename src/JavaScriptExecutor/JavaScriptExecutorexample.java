package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorexample {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(1900);
		WebElement ele=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		//ele.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement element=	driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		//JS
		js.executeScript("arguments[0].click();",ele);
		
		//SW for refresh
		//driver.navigate().refresh();
		//JS for refresh
		js.executeScript("history.go(0)");
		
		String sinnertext=js.executeScript("return document.documentElement.innerText;").toString();
		 System.out.println(sinnertext);
		 
		 //SW for get page title
		 System.out.println(driver.getTitle()); 
		 ////JS for get page title
		 String pagetitle=js.executeScript("return document.title;").toString();
		 System.out.println("pagetitle->"+pagetitle);
		 
		 //sw for maxi
		// driver.manage().window().maximize();
		 
		 js.executeScript("window.scrollBy(0,650)","");
		 Thread.sleep(2500);
		 js.executeScript("window.scrollBy(0,-650)","");
		 
		// driver.navigate().to("https://www.facebook.com/");
		 
		 js.executeScript("window.location='https://www.facebook.com/'");
		 
		 
		 
		 
		 
		 
		 String domainname=js.executeScript("return document.domain;").toString();
			System.out.println("domainname="+domainname);
			
			String surl=js.executeScript("return document.URL;").toString();
			System.out.println("URL="+surl);
			
			
			String stite=js.executeScript("return document.title;").toString();
			System.out.println("Title="+stite);
			Thread.sleep(2900);
			String links=js.executeScript("return document.links;").toString();
			System.out.println("links="+links);
		 
		 
			 driver.get("https://login.salesforce.com/");
				WebElement usernametxtbox=driver.findElement(By.id("username")) ;
				js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",usernametxtbox);
				Thread.sleep(1500);
	    		js.executeScript("arguments[0].setAttribute('style','border: 2px solid white;');",usernametxtbox);

		 
		 
		
		
		
		
		

	}

}
