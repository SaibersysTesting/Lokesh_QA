package project1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://www.infibeam.com/");
        
        driver.findElement(By.linkText("LOGIN / REGISTER")).click();
        
        driver.findElement(By.xpath(".//*[@id='new-account-btn']")).click();
        
        List <WebElement> e = driver.findElements(By.xpath(".//*[@id='password']"));
        
        int i=e.size();
        
        System.out.println(i);
        
        e.get(1).sendKeys("ravi123");
        
	}

}
