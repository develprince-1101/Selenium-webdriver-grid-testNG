package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertEquals {
	
	WebDriver driver;
	

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Default.DESKTOP-LCLRU6G\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
	}

	@Test
	public void testEquality() {
		Assert.assertEquals(true, isEqual(11, 10));
		System.out.println("TRUTH!");
	}

	public boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}

	}
	
	@Test
	public void compareTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		assert(title.equalsIgnoreCase("gmail"));
	}
	
	
}
