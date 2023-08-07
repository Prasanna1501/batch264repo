package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test8
{
	public static void main(String[] args) 
	{
		int x=10;
		System.out.println(x);
		
		String y="kalam";
		System.out.println(y);
		System.out.println(y.length());
		 
		int z[]= {12,35,67};
		System.out.println(z);
		System.out.println(z.length);
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("www.Yahoo.com");

	}

}
