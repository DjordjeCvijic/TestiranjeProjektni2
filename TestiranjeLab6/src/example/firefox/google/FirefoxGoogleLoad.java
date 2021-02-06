package example.firefox.google;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxGoogleLoad {
	 @Test
	  public void testGoogleSearch() throws InterruptedException {

	    System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.google.com/");
	    Thread.sleep(5000); 
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("GeckoDriver");
	    searchBox.submit();
	    Thread.sleep(5000); 
	    driver.quit();
	  }

}
