package practice;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 
{

	public static void main(String[] args) 
	{
		WebDriverManager obj1=WebDriverManager.chromedriver();
		WebDriverManager obj2=obj1.driverVersion("112.0.5615.49");
		obj2.setup();
		WebDriverManager.chromedriver().browserVersion("112").setup();
		WebDriverManager.chromedriver().driverVersion("112.0.5615.49").arch64().setup();
	}
}
