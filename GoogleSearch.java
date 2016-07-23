package project1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GoogleSearch {
	static WebDriver driver;
	static Wait<WebDriver> wait;
	public static void main(String[] args) {
		 driver = new FirefoxDriver();
         wait = new WebDriverWait(driver, 30);
         driver.get("http://www.google.com/");
		  
		 boolean result;
		   try {
		 
		 	      result = firstPageContainsQAANet();
		       } 
		   catch(Exception e) 
		   {
		        e.printStackTrace();
		         result = false;
		   } 
		   finally 
		   {
		      driver.close();
		   }
		 
	   System.out.println("Test " + (result? "passed." : "failed."));
		 
		 	        if (!result) {
		 
		 	            System.exit(1);
		 
		 	        }
		// TODO Auto-generated method stub

	}
	private static boolean firstPageContainsQAANet()
	{
		  driver.findElement(By.name("q")).sendKeys("qa automation\n");
		  driver.findElement(By.name("btnG")).click();
	      wait.until(new ExpectedCondition<Boolean>() 
	      {
		
	      public Boolean apply(WebDriver webDriver)
	      {
		       System.out.println("Searching ...");
		       return webDriver.findElement(By.id("resultStats")) != null;
		   }
		
		 });
	
	     return driver.findElement(By.tagName("body")).getText().contains("qaautomation.net");
	
	}
}
