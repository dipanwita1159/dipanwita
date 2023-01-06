package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiple {
	 WebDriver driver;
	    String nodeURL;
	    
	    @Parameters({"Port"})
	    @Test
	    public void setUp(  @Optional String Port) throws MalformedURLException
	    {           
	        if(Port.equalsIgnoreCase("4445"))
	        {
	            nodeURL = " http://192.168.1.38:4444/wd/hub";
	            System.out.println("Chrome Browser Initiated");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();            
	            capabilities.setBrowserName("chrome");
	            capabilities.setPlatform(Platform.WINDOWS);
	            
	            driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
	            
	            driver.get("https://www.apple.com/");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	        
	        else if(Port.equalsIgnoreCase("5566"))
	            {nodeURL = " http://192.168.1.128:4444/wd/hub";
	                System.out.println("Firefox Browser Initiated");
	                DesiredCapabilities capabilities1 = DesiredCapabilities.firefox();
	                capabilities1.setBrowserName("firefox");
	                capabilities1.setPlatform(Platform.WINDOWS);
	                
	                driver = new RemoteWebDriver(new URL(nodeURL),capabilities1);   
	                
	                driver.get("https://www.apple.com/");
	                driver.manage().window().maximize();
	                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            }
	        
	    }	            
	       /* if(Port.equalsIgnoreCase("4547"))
	        {
	            nodeURL = "http://10.0.0.22:4547/wd/hub";
	            System.out.println("Internet Browser Initiated");
	            DesiredCapabilities capabilities2 = DesiredCapabilities.internetExplorer();
	            capabilities2.setBrowserName("internet explorer");
	            capabilities2.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	            capabilities2.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
	            capabilities2.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	            capabilities2.setCapability("ignoreProtectedModeSettings", true);
	            capabilities2.setCapability("nativeEvents", false);
	            capabilities2.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "");
	            capabilities2.setCapability(InternetExplorerDriver.LOG_LEVEL, "DEBUG");
	             
	            
	            capabilities2.setPlatform(Platform.WINDOWS);
	            
	            driver = new RemoteWebDriver(new URL(nodeURL),capabilities2);
	            
	            driver.get("https://www.apple.com/");
	            driver.manage().window().maximize();    
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	    }
	    */
			/*
			 * @Test(priority =1) public void appleSite() throws InterruptedException { try
			 * {
			 * 
			 * driver.findElement(By.xpath("//*[@id=\'ac-globalnav\']/div/ul[2]/li[3]")).
			 * click(); Thread.sleep(2000);
			 * 
			 * driver.findElement(By.
			 * cssSelector("#chapternav > div > ul > li.chapternav-item.chapternav-item-ipad-air > a > figure"
			 * )).click(); Thread.sleep(2000);
			 * 
			 * driver.findElement(By.linkText("Why iPad")).click(); Thread.sleep(2000); }
			 * 
			 * catch(Exception e) { System.out.println(e.getMessage()); } }
			 */

	    
			/*
			 * @Test(priority = 1) public void tearDown() { driver.quit();
			 * System.out.println("Browser Closed"); }
			 */
	}


