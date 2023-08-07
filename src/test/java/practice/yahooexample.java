package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yahooexample {

	public static void main(String[] args) throws InterruptedException 
	
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		//Launch site using base URL
		driver.get("https://login.yahoo.com");
		Thread.sleep(5000);
		//login details
		driver.findElement(By.id("login-username")).sendKeys("Prasanna2");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.xpath("//textarea[@id='g-recaptcha-response']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("Vedansh@15");
		Thread.sleep(5000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		//navigate to mails
		driver.findElement(By.id("root_1")).click();
		Thread.sleep(5000);
		// mail writing
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("prassudivya24@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("Simple example");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hi ,/nHow are you");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Selenium interview questions.docx");

	}

}
