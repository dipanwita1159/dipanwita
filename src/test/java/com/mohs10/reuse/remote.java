package com.mohs10.reuse;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

 class remote {
	
	WebDriver driver;
	@Test
	public void  grid() {
		String node=" http://192.168.1.19:4445/wd/hub";
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
		driver.get("https://www.browserstack.com/guide/selenium-grid-tutorial");
		driver.close();
	}

}
