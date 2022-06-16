package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTesting {

	public static void main(String[] args)
	{
		  String path = System.getProperty("user.dir");
		  System.setProperty("webdriver.edge.driver", path+"\\drivers\\EdgeDriver\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.ebay.com");
		  driver.findElement(By.id("gh-ac")).sendKeys("Books");
		  driver.findElement(By.id("gh-btn")).click();
		  driver.close();
		  driver.quit();

	}

}
