package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	WebDriver driver;

	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/en-us");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void test() {

		WebElement Products_Menu_Locator = driver.findElement(By.xpath("//*[@id=\"l1\"]"));
		String expected =" Products";
		//Assert.assertNotEquals(expected, Products_Menu_Locator);
			//System.out.println("done");	


				
				

               
            /*
		 * WebElement MONITOR_Menu_Locator =
		 * driver.findElement(By.xpath("//*[@id=\"l1_6\"]/span"));
		 * 
		 * WebElement MONITOR_Menu_HOME_LOCATOR = driver .findElement(By.xpath(
		 * "//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[1]/ul/li[10]/ul/li[1]/a/img"));
		 * 
		 * Actions action = new Actions(driver);
		 * action.moveToElement(Products_Menu_Locator).build().perform();
		 * action.moveToElement(MONITOR_Menu_Locator).build().perform();
		 * action.click(MONITOR_Menu_HOME_LOCATOR).click();
		 */
	}
		 
	}




