package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class w3school {
	WebDriver driver;
	@Before
	public void browser() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
@Test
public void Element_content() {
	driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")).click();
	driver.findElement(By.cssSelector("#nav_tutorials > div > div:nth-child(2) > a:nth-child(11)")).click();
	driver.findElement(By.xpath("//*[@id=\"topnavbtn_tutorials\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/span")).click();
	driver.findElement(By.name("ex1")).sendKeys("System");
	driver.findElement(By.name("ex2")).sendKeys("out");
	driver.findElement(By.name("ex3")).sendKeys("println");
	driver.findElement(By.xpath("//*[@id=\"w3-exerciseform\"]/div/button")).click();
	driver.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();
}
//*[@id="answerbutton"]
}
