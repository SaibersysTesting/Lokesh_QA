package project1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assertions {

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("http:cleartrip.com");
		String expval="M";
		String actval=wd.findElement(By.xpath(".//*[@id='multi_city']")).getAttribute("value");
		System.out.println(expval.equals(actval)?"passed":"failed");

		// TODO Auto-generated method stub

	}

}
