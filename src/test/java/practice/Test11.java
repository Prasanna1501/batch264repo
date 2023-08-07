package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) throws InterruptedException 
	{
		//open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("http://www.sentia.in"); //base url
				Thread.sleep(5000);
				//get current url of the page
				String x=driver.getCurrentUrl();
				System.out.println(x);
				if(x.startsWith("https"))
				{
					System.out.println("secured site");
				}
				else
				{
					System.out.println("Unsecured site");
				}
				//close site
				driver.close();


	}

}
