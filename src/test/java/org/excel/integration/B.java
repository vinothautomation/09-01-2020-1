package org.excel.integration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B extends A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARES\\selenium\\WORKED_FILED\\eclipse-workspace_selenium_projrcts\\Demo\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	WebElement usename = driver.findElement(By.id("email"));
	usename.sendKeys(getData(1,0));
	
	WebElement Password = driver.findElement(By.id("pass"));
	Password.sendKeys(getData(1,1));

}
}
