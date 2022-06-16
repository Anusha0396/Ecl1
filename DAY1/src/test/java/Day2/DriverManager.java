package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager
{
  public static void main(String[] args)
  {  
//	  WebDriverManager.chromedriver().setup();
//	  WebDriver driver = new ChromeDriver();
//	  driver.get("https://www.ebay.com");
//	  driver.findElement(By.id("gh-ac")).sendKeys("Books");
//	  driver.findElement(By.id("gh-ac")).click();
//	  driver.close();
//	  driver.quit();
	  
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.ebay.com");
	  driver.findElement(By.id("gh-ac")).sendKeys("Books");
	  driver.findElement(By.id("gh-ac")).click();
	  driver.close();
	  driver.quit();
  }
}
