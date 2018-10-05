package com.java.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;



public class Login {
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
  driver.findElement(By.xpath("//a[contains(@class,'c24-button c24-meinkonto-reflink c24-meinkonto-login-link')]")).click();;
        
  //Login 
  driver.findElement(By.id("email")).sendKeys("niranjanveluru100@gmail.com");
  driver.findElement(By.id("password")).sendKeys("veluru100");
  driver.findElement(By.name("login")).click();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  
  //Verify Hallo Text Present
  String helloText=driver.findElement(By.xpath("//div[@class='page-header salutation']//h1")).getText().trim();
       System.out.println(helloText);
 }

}