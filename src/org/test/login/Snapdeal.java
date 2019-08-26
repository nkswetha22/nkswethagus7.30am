package org.test.login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\swetha\\Selenium\\nkswethagus7.30am\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com");
	WebElement tb = driver.findElement(By.id("inputValEnter"));
	tb.sendKeys("iphone6");
	WebElement search = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	search.click();
	WebElement phone = driver.findElement(By.xpath("(//p[@class='product-title '])[4]"));
	phone.click();
	String par = driver.getWindowHandle();
	Set<String> All = driver.getWindowHandles();
	System.out.println(par+"/n"+All);
	for(String x :All) {
		if (!x.equals(par)) {
			driver.switchTo().window(x);
		}
	}
	WebElement add = driver.findElement(By.xpath("//span[text()='add to cart']"));
	add.click();
	}

	}

