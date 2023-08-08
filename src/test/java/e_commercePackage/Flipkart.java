package e_commercePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart 
{
  @Test
  public void flipkartTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening Amazon", true);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
