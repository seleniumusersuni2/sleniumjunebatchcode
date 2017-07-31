package SeleniumWebdrive;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstProgam {
	public static WebDriver driver;
	public static void main(String[] args) {	
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String ch=null;
		System.out.println("Enter String\n1. IE\n2. Chrome\n3. Firefox");
		System.out.println("Enter yo ur choice:");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextLine()){
			 ch = sc.nextLine();
			}
		switch(ch.toLowerCase()){
		
		case "firefox": driver=new FirefoxDriver();break;
		case "ie"	  : driver=new InternetExplorerDriver();break;
		case "chrome" : driver=new ChromeDriver();break;	
				}				
		
		driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fyour-account%3Fref_%3Dnav_ya_signin");
		 
		driver.findElement(By.id("ap_email")).sendKeys("seleniumuser@gmail.com");
		driver.findElement(By.name("password")).sendKeys("seleniumpassword");
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
		
		
		
		
		
		
		
		
	/*	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fyour-account%3Fref_%3Dnav_ya_signin");
		driver.findElement(By.id("ap_email")).sendKeys("seleniumuser@gmail.com");
		driver.findElement(By.name("password")).sendKeys("seleniumpassword");
		driver.findElement(By.id("signInSubmit")).click();*/
		
		 
		
		
/*		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fyour-account%3Fref_%3Dnav_ya_signin");
		ch.findElement(By.id("ap_email")).sendKeys("seleniumuser@gmail.com");
		ch.findElement(By.name("password")).sendKeys("seleniumpassword");
		ch.findElement(By.id("signInSubmit")).click();
		
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fyour-account%3Fref_%3Dnav_ya_signin");
		ie.findElement(By.id("ap_email")).sendKeys("seleniumuser@gmail.com");
		ie.findElement(By.name("password")).sendKeys("seleniumpassword");
		ie.findElement(By.id("signInSubmit")).click();
		
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fyour-account%3Fref_%3Dnav_ya_signin");
		ff.findElement(By.id("ap_email")).sendKeys("seleniumuser@gmail.com");
		ff.findElement(By.name("password")).sendKeys("seleniumpassword");
		ff.findElement(By.id("signInSubmit")).click();
		*/
		
		
	}

}
