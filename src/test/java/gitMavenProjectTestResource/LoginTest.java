package gitMavenProjectTestResource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver = new ChromeDriver();
	
	@BeforeSuite
	public static void openWebsite() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://mail.google.com/");
	}
	@Test
	public static void ClickOnSignin() {
		WebElement SigninButton = driver.findElement(By.xpath("//a[text()='Sign in']"));
		SigninButton.click(); 
		WebElement EmailEntry = driver.findElement(By.cssSelector("input#identifierId"));
		EmailEntry.sendKeys("jai@gmail.com");
		
	}

}
