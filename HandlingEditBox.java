package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingEditBox {

	public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
          
          driver.get("https://www.gmail.com");
          //Enter a value
          driver.findElement(By.id("Email")).sendKeys("chravikanth.ste");
          String value = driver.findElement(By.id("Email")).getAttribute("value");
          System.out.println(value);
          //return type of the object
          
          String objectType = driver.findElement(By.id("Email")).getAttribute("Type");
          
          System.out.println(objectType);
          //retrun object display status
          
          boolean a = driver.findElement(By.id("Email")).isDisplayed();
          System.out.println(a);
          boolean b = driver.findElement(By.id("Email")).isEnabled();
          System.out.println(b);
          
          driver.findElement(By.id("Email")).clear();
		// TODO Auto-generated method stub

	}

}
