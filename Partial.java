package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial{

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
	
driver.get("https://demo.opencart.com/index.php?route=common/home");
driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("software");

Thread.sleep(3000);

driver.close();
}
}
