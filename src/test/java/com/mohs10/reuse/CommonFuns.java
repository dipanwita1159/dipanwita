package com.mohs10.reuse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class CommonFuns {

	public Action aDriver;
	public  WebDriver driver;

	public CommonFuns() {
		aDriver = new Action();
		driver = StartBrowser.driver;
	}

	public void browserInvoke() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("login");
		
		aDriver.
		
	
		aDriver.click(HomePage.aboutUs, "click on click");
		// aDriver.mouseOverElement(driver, (WebElement) HomePage.aboutUs);
		/*
		 * aDriver.click(HomePage.who_we_are, "click on who we are");
		 * aDriver.navigateToApplication("https://mohs10.io/the-team/");
		 * aDriver.click(HomePage.aboutUs, "click on click");
		 * aDriver.click(HomePage.Our_family, "click on family"); JavascriptExecutor js
		 * = (JavascriptExecutor) driver; js.executeScript("window.scroll(0,1500)");
		 */

		aDriver.click(HomePage.LinkDin_profile, "click on linkdin");
		aDriver.navigateToApplication("https://mohs10.io/the-team/");
		
		

	
		
		aDriver.click(HomePage.Resources, "click on Resources");
		aDriver.click(HomePage.event, "click on event");

		driver.getWindowHandle();
		aDriver.click(HomePage.gac_click, "click on gac");

		driver.getWindowHandles();

		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scroll(0,1500)");
		driver.navigate().back();
		Thread.sleep(5000);
		/* aDriver.click(HomePage.register, "click on register Button"); */

	}

	public void resource2(String name, String company, String email,String location, String experience,String mobile) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("login");
		aDriver.click(HomePage.Resources, "click on Resources");
		aDriver.click(HomePage.event, "click on event");
		aDriver.click(HomePage.Pro_talk, "click on protalk");
		// driver.get("https://protalk.mohs10.io/");
		aDriver.click(HomePage.Register_proTAlk, "click on protalk");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3500)");

		aDriver.type(HomePage.Name_pro, name, "click on namePro");
		aDriver.type(HomePage.Email_pro, company, "click on REmail_pro");
		aDriver.type(HomePage.company_pro, email, "click on company_pro");
		aDriver.click(HomePage.button_reg, "click on button_reg");
		System.out.print("test complete");
		driver.navigate().back();
		Thread.sleep(5000);
		
	
//case study//
		aDriver.click(HomePage.Resources, "click on Resources");
		aDriver.click(HomePage.case_study_click, "case_study_click");
		aDriver.click(HomePage.Case_study_download, "click on case study");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scroll(0,1000)");
		aDriver.type(HomePage.popUp_name, name, "click on  popUp_name");
		aDriver.type(HomePage.popUp_Email, email, "click on Email");
		aDriver.click(HomePage.DownloadButton, "click on DownloadButton");
		driver.navigate().back();
	
	}
	public void Apply(String name, String email, String mobile, String location, String experience) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("login");

		aDriver.click(HomePage.carrer, "click on Resources");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		aDriver.click(HomePage.aplly, "case_study_click");
		

		aDriver.type(HomePage.A_NAme, name, "click on case study");
		aDriver.type(HomePage.A_email, email, "click on case study");
		aDriver.type(HomePage.A_phone, mobile, "click on case study");
		aDriver.type(HomePage.A_loca, location, "click on case study");
		aDriver.type(HomePage.A_experienxe, experience, "click on case study");
		/* aDriver.click(HomePage.A_resume,"click on case study"); */
		aDriver.click(HomePage.submit, "click on case study");
		

	}

	
	  public void contactus(String name,String Email,String mobile,String
	  company,String location, String textinput ) throws Exception {
	  StartBrowser.childTest=StartBrowser.parentTest.createNode("contactus");
	  aDriver.click(HomePage.contactus, "click on contactus");
	  aDriver.type(HomePage.email,Email, "click on case study");
	  aDriver.type(HomePage.phone,mobile, "enter mobile number ");
	  aDriver.type(HomePage.companyname,company, "click on contactus");
	  aDriver.type(HomePage.countryname, location,"click on contactus");
	  aDriver.click(HomePage.Interested_in,"clickon dropDown");

	  
		/* aDriver.type(HomePage.account,Acc,"click on contactus"); */ 
	  aDriver.type(HomePage.text,textinput,"click on contactus"); 
	 
	  aDriver.click(HomePage.sendnow, "click on contactus");
	  aDriver.navigateToApplication("https://mohs10.io/");
	  
	  }
	 
	public void blog() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("blog");
		aDriver.click(HomePage.Resources, "click on Resources");
		aDriver.click(HomePage.Blog, "blog");
		aDriver.click(HomePage.taf, "blog");
		driver.navigate().back();

	}
public void search(String input) throws Exception {
	StartBrowser.childTest = StartBrowser.parentTest.createNode("blog");
	aDriver.click(HomePage.search, "null");
	aDriver.type(HomePage.search, input, "input null");
	
}
	
}
