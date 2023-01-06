package com.mohs10.scripts;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;

import com.mohs10.reuse.CommonFuns;

public class HomeTest extends StartBrowser {

	@Test (priority=0) public void browserInvoke() throws Exception { WebDriver
	  driver=StartBrowser.beforeClass("chrome", "https://mohs10.io/"); CommonFuns
	  veri = new CommonFuns(); veri.browserInvoke();
	  
	  Thread.sleep(10000); driver.close();}}

/*
 * @Test(priority=1) public void resources() throws Exception { WebDriver
 * driver=StartBrowser.beforeClass("chrome", "https://mohs10.io/"); CommonFuns
 * veri = new CommonFuns(); Thread.sleep(5000); driver.close();}
 * 
 * 
 * 
 * 
 * 
 * @Test(priority=2) public void blog() throws Exception { WebDriver
 * driver=StartBrowser.beforeClass("chrome", "https://mohs10.io/"); CommonFuns
 * veri = new CommonFuns();
 * 
 * veri.blog();
 * 
 * 
 * Thread.sleep(5000); driver.quit(); }
 * 
 * 
 * 
 * @Test(priority=3) public void carrerApply() throws Exception { WebDriver
 * driver=StartBrowser.beforeClass("chrome", "https://mohs10.io/"); CommonFuns
 * veri = new CommonFuns();
 * 
 * 
 * 
 * 
 * veri.Apply("r roy", "rroy@gmail.comc", "9090909090", "india","90");
 * 
 * Thread.sleep(5000); driver.close();
 * 
 * 
 * }
 * 
 * @Test(priority=4) public void contactUs() throws Exception { WebDriver
 * driver=StartBrowser.beforeClass("chrome", "https://mohs10.io/"); CommonFuns
 * veri = new CommonFuns(); veri.contactus("r roy", "null@gamil.com",
 * "98998998899", "m10", "india", "hii, it is checking"); Thread.sleep(5000);
 * driver.close();
 * 
 * }
 * 
 * 
 * 
 * 
 * @Test public void a() throws Exception { WebDriver
 * driver=StartBrowser.aunchapp("chrome", "https://www.selenium.dev/");
 * CommonFuns veri = new CommonFuns(); veri.search("uft"); Thread.sleep(12000);
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * @Test public void selenium() throws Exception { WebDriver
 * driver=StartBrowser.aunchapp("chrome", "https://mohs10.io/"); CommonFuns veri
 * = new CommonFuns(); veri.browserInvoke();
 * 
 * 
 * }
 * 
 * 
 * }
 * 
 * @Test(priority = 3) public void seleniummsedge() throws Exception { WebDriver
 * driver=StartBrowser.aunchapp("msedge", "https://mohs10.io/"); CommonFuns veri
 * = new CommonFuns(); veri.browserInvoke(); }
 * 
 * 
 * }
 * 
 * 
 * 
 * @Test public void cause() throws Exception { WebDriver
 * driver=StartBrowser.beforeClass("msedge",
 * "https://demowebshop.tricentis.com/");
 * 
 * 
 * 
 * CommonFuns veri = new CommonFuns();
 * 
 * veri.verify(); Thread.sleep(5000); } }
 * 
 * 
 */