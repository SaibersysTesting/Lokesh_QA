package project1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
	       driver.get("http://www.newtours.demoaut.com/");
	       driver.findElement(By.linkText("REGISTER")).click();
	       
	       //driver.findElement(By.name("Country")).click();
	       
	       Select Country = new Select(driver.findElement(By.name("country")));
	       
	       List<WebElement> options = Country.getOptions();  
	       for(WebElement we:options)  
	       {  
	        System.out.println(we.getText());  
	       }  
	       
	       //Country.selectByIndex(4);
         
	}

}
