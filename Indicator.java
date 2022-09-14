package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indicator {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
	
driver.get("https://www.google.com/");
driver.findElement(By.className("need-to-know-inner__h1")).click();
Thread.sleep(100);

driver.close();
}
}
