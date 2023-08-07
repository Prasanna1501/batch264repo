package org.magnitia.abdulkalam;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in");
		driver.get("https://www.gmail.co.in");
		Thread.sleep(5000);
		driver.close();

	}

}
