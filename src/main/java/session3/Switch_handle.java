package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switch_handle {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test

	public void webtest() throws InterruptedException {
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());

		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("xpath");
		driver.findElement(By.xpath("//button[@id='header-desktop-search-button']")).click();

		Thread.sleep(2000);
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();

		System.out.println(driver.getWindowHandles());
		for (String i : driver.getWindowHandles()) {
			System.out.println(i);
			driver.switchTo().window(i);
		}
		// System.out.println("hi");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("CSS")).click();
		// System.out.println("hello");
		String actual = "Start learning CSS now »";

		String expected = driver.findElement(By.xpath("//a[contains(text(),'Start learning CSS now »')]")).getText();
		Assert.assertEquals(expected, actual);
		System.out.println("confirmed");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Start learning CSS now »')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Start learning CSS now »')]")).click();
				 
			}
}
