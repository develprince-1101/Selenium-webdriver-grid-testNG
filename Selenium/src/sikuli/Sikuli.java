package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {
	
	WebDriver driver;
	Screen myScreen;
	
	public static void main (String args[]) {
		Sikuli sk =new Sikuli();
		sk.openBrower();
	}
	public void openBrower() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Default.DESKTOP-LCLRU6G\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://google.com");
		searchUsingImages();
		
		
	}
	
	public void searchUsingImages() {
		
		
		try {
			Pattern searchBar = new Pattern("C:\\Users\\Default.DESKTOP-LCLRU6G\\Pictures\\Snipping tools\\bar.PNG");
			Pattern searchButton = new Pattern("C:\\Users\\Default.DESKTOP-LCLRU6G\\Pictures\\Snipping tools\\button.PNG");
			Pattern lnk = new Pattern("C:\\Users\\Default.DESKTOP-LCLRU6G\\Pictures\\Snipping tools\\link.PNG");
			
			myScreen = new Screen();
			myScreen.wait(searchBar,3);
			myScreen.type(searchBar,"Java");
			myScreen.wait(searchButton,3);
			myScreen.click(searchButton);
			myScreen.wait(lnk,3);
			myScreen.click(lnk);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
