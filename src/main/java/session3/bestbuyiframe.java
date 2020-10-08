package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bestbuyiframe {
	WebDriver driver;
	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	  public void frames() {
	  
	  driver.switchTo().frame("a077aa5e"); 
	  driver.findElement(By.xpath("/html/body/a/img")).click();
	  
	  
	
	  
	
	}
	  
	 
	
	
	
	
	}


