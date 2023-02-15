package com.mohs10.base;


import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class StartBrowser {
	public static WebDriver driver;
	
	  //set up report
	  
	  public static ExtentReports 
	 extent; public static ExtentTest parentTest; 
	 public static ExtentTest childTest; 
	 ExtentSparkReporter sparkReporter;
	  
	  @BeforeTest public void generateReport() { sparkReporter = new
	  ExtentSparkReporter("Report/AutomationReport.html");
	  extent = new ExtentReports(); 
	  extent.attachReporter(sparkReporter); }
	  
	  @BeforeMethod 
	  public void methodName(Method method) { 
		  parentTest =extent.createTest(method.getName()); }
	 
	
	  @Parameters("browser")
	  
	  @Test public static WebDriver aunchapp(String browser,String Url) throws MalformedURLException { 
		  String URL = "//button[@aria-label='Search']";
	  
	    if (browser.equalsIgnoreCase("firefox")) {
	  System.out.println(" Executing on FireFox");
	  String Node ="http://localhost:4444/wd/hub";
	  DesiredCapabilities cap =DesiredCapabilities.firefox(); 
	  cap.setBrowserName("firefox");
	  cap.setPlatform(Platform.ANY);
	  
	  driver = new RemoteWebDriver(new URL(Node), cap);
	  // Puts an Implicit wait,
	  // Will wait for 10 seconds before throwing exceptio
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  // Launch website
	  driver.navigate().to(URL);
	  driver.manage().window().maximize(); 
	  }
	    
	    
	    else if(browser.equalsIgnoreCase("chrome")) {
	  System.out.println(" Executing on CHROME");
	  String Node = "http://localhost:4444/wd/hub"; 
	  DesiredCapabilities cap = DesiredCapabilities.chrome(); 
	  cap.setBrowserName("chrome");
	  cap.setPlatform(Platform.WIN10);
	  
	  driver = new RemoteWebDriver(new URL(Node), cap);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  // Launch website 
	  driver.navigate().to(URL);
	  driver.manage().window().maximize(); }
	  
	  else if(browser.equalsIgnoreCase("msedge")) {
		   System.out.println(" Executing on edge");
	  DesiredCapabilities cap =DesiredCapabilities.edge(); 
	  cap.setBrowserName("msedge");
	  cap.setPlatform(Platform.WIN10); String Node = "http://localhost:4444/wd/hub";
	  
	  driver = new RemoteWebDriver(new URL(Node), cap);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  // Launch website
	  driver.navigate().to(URL);
	  driver.manage().window().maximize();
	  }
	  else {
		  throw new IllegalArgumentException("The Browser Type is Undefined");
		  }
	  return driver; }
	 
	
	  @Test(priority = 2) public static WebDriver beforeClass(String Browser ,
	  String url) { if(Browser.equals("firefox")) { driver= new FirefoxDriver(); }
	  else if(Browser.equals("chrome")) { System.setProperty("webdriver.chrome.driver", "chromedriver.exe");driver=new ChromeDriver(); } else
	  if(Browser.equalsIgnoreCase("edge")) {System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
driver= new EdgeDriver(); }
	  driver.manage().window().maximize(); driver.get(url); return driver;
	  
	  
	  }
	  
	  
	  
	  
	  
	  @AfterClass public void afterClass() { driver.quit(); extent.flush(); }
	  
	 

}

