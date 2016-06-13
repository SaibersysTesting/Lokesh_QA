package project1;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class a {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd= new FirefoxDriver();

		wd.get("http://www.gmail.com/");

		wd.findElement(By.xpath("//*[@id=&#39;Email&#39;]")).sendKeys("akhilreddyhyd@gmail.com");

		wd.findElement(By.xpath("//*[@id=&#39;Passwd&#39;]")).sendKeys("venkanna14");

		wd.findElement(By.xpath("//*[@id=&#39;signIn&#39;]")).click();

		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=&#39;:b7&#39;]/div/div")).click();

		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=&#39;:14i&#39;]")).sendKeys("akhilreddyhyd@gmail.com");

		wd.findElement(By.xpath("//*[@id=&#39;:161&#39;]")).sendKeys("Hi h r u");

		wd.findElement(By.xpath("//*[@id=&#39;:16i&#39;]")).click();

		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=&#39;gbgs4d&#39;]/span[2]")).click();

		wd.findElement(By.xpath("//*[@id=&#39;gb_71&#39;]")).click();
		// TODO Auto-generated method stub

	}

}
