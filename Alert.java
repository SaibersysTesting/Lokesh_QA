package project1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
		WebDriver wd =new FirefoxDriver();
		wd.get("http://www.gmail.com");
		wd.findElement(By.xpath(".//*[@id='Email']")).sendKeys("akhilreddyhyd@gmail.com");
		wd.findElement(By.xpath(".//*[@id='Email']")).sendKeys(Keys.TAB);
		wd.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("venkanna143");
		wd.findElement(By.xpath(".//*[@id='signIn']")).sendKeys(Keys.ENTER);

		// TODO Auto-generated method stub

	}

}
