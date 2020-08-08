package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLoginTests {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		WebElement LoginLink = driver.findElement(By.xpath("//div[@ class='ast-button']"));
		LoginLink.click();

		WebElement EmailAddress = driver.findElement(By.id("email"));
		EmailAddress.sendKeys("test@email.com");
		
		WebElement PasswordField = driver.findElement(By.id("password"));
		PasswordField.sendKeys("abcabc");
		
		WebElement LoginButton = driver.findElement(By.xpath("//input[@ type='submit']"));
		LoginButton.click();
		

	}
}