package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	
	
	WebDriver driver;
	String nodeUrl;
	

	public static void main(String[] args) {
		SeleniumGrid grid =new SeleniumGrid();
		grid.scriptForParallelTest();

	}
	
	public void scriptForParallelTest() {
		
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
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
