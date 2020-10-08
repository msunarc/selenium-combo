package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class dell {


WebDriver driver;

@Before
public void webelement() {
	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dell.com/en-us");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}

@Test
public void test() {

	
	WebElement PRODUCTS_MENU_LOCATOR = driver.findElement(By.xpath("//*[@id=\"l1\"]"));
	WebElement MONITOR_Menu_Locator = driver.findElement(By.xpath("//*[@id=\"l1_6\"]/span"));

	String Actual = PRODUCTS_MENU_LOCATOR.getText();
	String expected = "Products";
	Assert.assertEquals(Actual, expected);
	System.out.println("great");
	Actions action = new Actions(driver);
	action.moveToElement(PRODUCTS_MENU_LOCATOR).build().perform();
	action.moveToElement(MONITOR_Menu_Locator).build().perform();
	// action.click(MONITOR_Menu_HOME_LOCATOR).click();
	String actual1 = MONITOR_Menu_Locator.getText();
	String expected1 = "Monitors";
	Assert.assertEquals(expected1, actual1);
	System.out.println("well done again");

	
}
}