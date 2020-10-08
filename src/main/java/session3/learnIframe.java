package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnIframe {
	WebDriver driver;

	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html"); 
		driver.manage().window().maximize();// without this it will not run
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
@Test
public void test() {
	driver.switchTo().frame("SingleFrame");
//driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("SMART SUNITA");




}
	
}
