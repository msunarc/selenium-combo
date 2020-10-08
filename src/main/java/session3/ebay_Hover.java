
package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




  public class ebay_Hover {
  
  WebDriver driver;
  
  @Before public void Launchbrowser() {
  System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
  driver=new ChromeDriver(); driver.get("https://www.ebay.com/");
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  
  }@Test public void ebay_page() throws InterruptedException {
  
  WebElement motors_locator=
  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
  Actions action=new Actions(driver);
  action.moveToElement(motors_locator).build().perform();
  
  WebElement motors_Powersports_locator=driver.findElement(By.xpath(
  "//a[contains(text(),'Powersports')]")); //Thread.sleep(2000);
  action.moveToElement(motors_Powersports_locator).build().perform();
  Thread.sleep(2000); WebElement
  motors_Boats_locator=driver.findElement(By.xpath(
  "//a[contains(text(),'Boats')]"));
  action.moveToElement(motors_Boats_locator).build().perform();
  action.clickAndHold(motors_Boats_locator);
  action.sendKeys(Keys.ENTER).click();
  
  
  
  
  
  
  } }
 
