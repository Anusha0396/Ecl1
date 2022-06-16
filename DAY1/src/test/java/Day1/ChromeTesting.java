package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTesting 
{
  public static void main(String[] args) 
  {
	  String path = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", path+"\\drivers\\ChromeDriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ebay.com");
	 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.id("gh-ac")).sendKeys("Books");
	  driver.findElement(By.id("gh-btn")).click();
	  driver.close();
	  driver.quit();
  }
}
