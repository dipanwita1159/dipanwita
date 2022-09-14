package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement
{

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
	
driver.get("https://demo.opencart.com/index.php?route=common/home");
driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("software");
driver.findElement(By.xpath("//*[@id=\"search\"]/button/i")).click();
//System.out.println(str);
Thread.sleep(3000);

//driver.close();
}}
