package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SecondNode {
	WebDriver driver;
	String nodeUrl;
  @Test
  public void f() {
		try {
			nodeUrl = "http://192.168.254.109:18494/wd/hub";
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeUrl),capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			searchArticle();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
  }
  
  public void searchArticle() {
		try {
			driver.get("http://google.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Java");
			driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[7]/div[3]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div[1]/a/h3")).click();
		

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
