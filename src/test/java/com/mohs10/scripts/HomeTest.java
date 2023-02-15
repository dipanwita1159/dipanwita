package com.mohs10.scripts;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;

import com.mohs10.reuse.CommonFuns;

public class HomeTest extends StartBrowser {

	
	  @Test public void chrome() throws Exception { WebDriver
	  driver=StartBrowser.beforeClass("chrome", "https://mohs10.io/"); CommonFuns
	  veri = new CommonFuns(); veri.browserInvoke();
	  
	  Thread.sleep(10000); driver.close();}
	  
	  @Test public void firefox() throws Exception { WebDriver
	  driver=StartBrowser.beforeClass("firefox", "https://mohs10.io/"); CommonFuns
	  veri = new CommonFuns(); Thread.sleep(5000); driver.close();}
	  
	 
	
	
	  @Test public void edge() throws Exception { WebDriver
	  driver=StartBrowser.beforeClass("edge", "https://mohs10.io/"); CommonFuns
	  veri = new CommonFuns(); Thread.sleep(5000); driver.close();}
	 
	 
}