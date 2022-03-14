package org.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javas {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\javascript\\driver\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement textuser = driver.findElement(By.id("email"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		Thread.sleep(4000);
		
		executor.executeScript("arguments[0].setAttribute('value','hello')", textuser);
		
		Object s = executor.executeScript("return arguments[0].getAttribute('value')", textuser);
		
		System.out.println(s);
		
		
	WebElement passcode = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','rishikeshan')",passcode );
		
	}
}
