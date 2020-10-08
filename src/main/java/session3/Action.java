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

public class Action {
	WebDriver driver;
	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe" );
	
	driver=new ChromeDriver();
	driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
	
	}
@Test
public void WebElement() {
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
driver.findElement(By.id("password")).sendKeys("abc123");

Actions act=new Actions(driver);
act.sendKeys(Keys.ENTER).build().perform();

String Actual_title="Dashboard";
String expected_Title=driver.findElement(By.xpath("//li[@class='active']/a/span")).getText();
System.out.println("check");
Assert.assertEquals("goodjob",expected_Title, Actual_title);
System.out.println("done");



String Actual="Appearance";
String expected=driver.findElement(By.xpath("//span[contains(text(),'Appearance ')]")).getText();
Assert.assertEquals("goodjob",expected, Actual);

System.out.println("second try");



}
}
