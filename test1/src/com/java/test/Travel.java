package com.java.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Travel{
	
	public static String url = "https://www.check24.de/";
	public static void main(String[] args) {

		 System.setProperty("webdriver.ie.driver",
		    "D:\\Niranjan 2\\Selenium\\Drivers\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");
		 
		   WebDriver driver= new InternetExplorerDriver();
		  // Launch Application

		   driver.get(url);
		   
		   // Wait For Page Loading
		   driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		   WebElement signIn=driver.findElement(By.xpath("//span[contains(text(),'Mein Konto')]"));
		   Actions act=new Actions(driver);
		   act.moveToElement(signIn).build().perform();
		   //driver.findElement(By.xpath("//a[contains(@class,'c24-button c24-meinkonto-reflink c24-meinkonto-login-link')]")).click();;
		   driver.findElement(By.xpath("//*[@id=\"c24-meinkonto-anmelden\"]")).click();;
		         
		   //Login 
		   driver.findElement(By.id("email")).clear();
		   driver.findElement(By.id("email")).sendKeys("niranjanveluru100@gmail.com");
		   driver.findElement(By.id("password")).sendKeys("veluru100");
		   driver.findElement(By.name("login")).click();
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		   
		   WebElement reisen=driver.findElement(By.xpath("//span[text()='Reise']"));
		   act.moveToElement(reisen).build().perform();
		   driver.findElement(By.xpath("//a[@title='Reise']/following-sibling::ul//a[@title='Frühbucher']")).click();
		   
		   driver.findElement(By.xpath("//input[@name='destination']")).click();
		   driver.findElement(By.xpath("//input[@name='destination']")).clear();
		   driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("berlin");
		   driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(Keys.TAB);
		   //driver.findElement(By.xpath("//span[contains(text(),'Berlin, Deutschland')]")).click();
		   
		   driver.findElement(By.xpath("//input[@name='airport-element']")).click();
		   driver.findElement(By.xpath("//input[@name='airport-element']")).clear();
		   driver.findElement(By.xpath("//input[@name='airport-element']")).sendKeys("fankfurt");
		   driver.findElement(By.xpath("//input[@name='airport-element']")).sendKeys(Keys.TAB);
		   driver.findElement(By.xpath("li[@class='list-item hover-state']//span[text()='Frankfurt am Main (FRA)']")).click();
		   
		   driver.findElement(By.id("traveller-roomcount-detail-btn")).click();
		   driver.findElement(By.xpath("//div[text()='Erwachsene']/following-sibling::span[text()='2']")).click();
		   
		   driver.findElement(By.id("js-get-traveller-btn")).click();
		   
		   driver.findElement(By.name("departureDate")).click();
		   driver.findElement(By.xpath("//div[@data-year-month='2018-11']//div[text()='30']")).click();
		   
		   //driver.findElement(By.name("returnDate")).click();
		   driver.findElement(By.xpath("//div[@data-year-month='2019-4']//div[text()='30']")).click();
		 
		   driver.findElement(By.name("searchButton")).click();
		   
		   String verificaitontxt = driver.findElement(By.xpath("//div[contains(@class,'headline-container')]//span[@class='suffix']")).getText().trim();
		   System.out.println(verificaitontxt);
		   
		   
		   
		   		   
		   
	}
}
			
