package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FastmailtoYahoo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Open browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver(); 
				//Launch site using base URL
				driver.get("https://login.fastmail.com");
				driver.findElement(By.name("username")).sendKeys("prasanna1");
				driver.findElement(By.name("password")).sendKeys("Vedansh@15");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				driver.findElement(By.xpath("//span[text()='Compose']")).click();
				

	}

}
