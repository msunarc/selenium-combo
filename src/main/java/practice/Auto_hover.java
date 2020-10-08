package practice;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Auto_hover {
 WebDriver driver;
@Before
 public void init() {
	 System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Frames.html");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 driver.manage().deleteAllCookies();
 
 }
@Test
 public void hoverover() throws InterruptedException {
	WebElement INTERACTION_LOCATOR=driver.findElement(By.xpath("//a[contains(text(),'Interactions ')]"));
	WebElement DRAGNDROP_LOCATOR=driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop ')]"));
	WebElement STATIC_LOCATOR=driver.findElement(By.xpath("//a[contains(text(),'Static ')]"));

 Actions act=new Actions(driver);
 act.moveToElement(INTERACTION_LOCATOR).build().perform();;
 Thread.sleep(2000);
 act.moveToElement(DRAGNDROP_LOCATOR).build().perform();;
 
 act.moveToElement(STATIC_LOCATOR).click();
 
 
 
 
 
   
 
 
 
 
 }
}
