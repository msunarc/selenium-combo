package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learn_handle {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
 public void browser() {
	 System.out.println(driver.getTitle());
	// System.out.println(driver.getWindowHandle());
	 
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("sql interview question");
	 Actions act= new Actions(driver);
	 act.sendKeys(Keys.ENTER).build().perform();
	 System.out.println(driver.getTitle());
	 
	 String Actual=driver.getTitle();
	 			 String expected="sql interview question - Google Search";
	  Assert.assertEquals(expected, Actual);
	  System.out.println("checked");
	 
	System.out.println(driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[5]/a")).getText());
	String Actual1=driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[5]/a")).getText();
	 String expected1="Shopping";
Assert.assertEquals(expected1, Actual1);
System.out.println("checked1");
	 
		/*
		 * driver.findElement(By.
		 * xpath("//h3[contains(text(),'SQL Interview Questions CHEAT SHEET (2020) - InterviewBit')]"
		 * )).click();
		 * 
		 * 
		 * System.out.println(driver.getWindowHandle());
		 * 
		 * for(String i :driver.getWindowHandles()) { System.out.println(i);
		 * driver.switchTo().window(i);}
		 */
	 
	 
	 
	 
	 
	 
	 
//	 String Actual_title ="InterviewBit Academy is now Scaler Academy!";
//	 String expected_title=driver.findElement(By.xpath("//span[contains(text(),'InterviewBit Academy is now Scaler Academy!')]")).getText();
//	 Assert.assertEquals(expected_title, Actual_title);
//	 System.out.println("good");
//	 String Actual_title1 ="Sign Up";
//	 String expected_title1=driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).getText();
//	 Assert.assertEquals(expected_title, Actual_title);
//	 System.out.println("did");
 }
}
