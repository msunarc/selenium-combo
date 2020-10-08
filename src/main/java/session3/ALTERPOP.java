package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALTERPOP {
	WebDriver driver;
	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	

}
	
