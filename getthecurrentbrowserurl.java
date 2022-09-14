package pratcise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogramme {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(https://www.google.com/);
			Thread.sleep(100);
		
		
		driver.manage().deleteAllCookies();
		driver.quit();
		
		

	}

	
}
 