package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSelenium {
	
	WebDriver driver;

	public static void main(String[] args) {
		WebDriverSelenium webd= new WebDriverSelenium ();
		webd.openBrower();
		webd.searchArticle();
		
	}
	public void openBrower() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Default.DESKTOP-LCLRU6G\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://google.com");
		
		
	}
	
	public void searchArticle() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("q")).sendKeys("Java");
			driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
		

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
