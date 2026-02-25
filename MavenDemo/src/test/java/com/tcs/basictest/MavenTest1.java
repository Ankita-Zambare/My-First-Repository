package com.tcs.basictest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello maven");
		// 1. Set ChromeDriver path
				//System.setProperty("webdriver.chrome.driver",
					//	"C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

				// 2. Launch Chrome browser
				//WebDriver driver = new ChromeDriver(); // Upcasting
		
		WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

				// Maximize browser window
				driver.manage().window().maximize();

				// Delete all cookies (fresh session)
				driver.manage().deleteAllCookies();

				// Page load timeout
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// 3. Open URL
				driver.get("https://www.google.com");

				// 4. Get and print title
				System.out.println("Title is: " + driver.getTitle());

				// 5. Close browser
			//	driver.quit();
				
				driver.close();

	}

}
