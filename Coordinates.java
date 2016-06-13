package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Coordinates {

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("http://www.w3schools.com/tags/ref_eventattributes.asp");
		Point p=wd.findElement(By.xpath(".//*[@id='main']/h2[4]")).getLocation();
		System.out.println(p.x);
		System.out.println(p.y);

		// TODO Auto-generated method stub

	}

}
