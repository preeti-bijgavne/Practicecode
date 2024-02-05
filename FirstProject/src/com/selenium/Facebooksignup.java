package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooksignup {

	static WebElement driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser();
		creatNewAccount();
	}

	public static void launchbrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement signUp = driver.findElement(By.linkText("Create new account"));
		signUp.click();
	}

	public static void creatNewAccount() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// WebElement firstName = driver.findElement(By.name("firstname"));

		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstName.sendKeys("Preeti");

	}
}
