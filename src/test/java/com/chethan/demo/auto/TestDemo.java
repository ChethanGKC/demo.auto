package com.chethan.demo.auto;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestDemo {

	// Create instance for Appium Driver
	AppiumDriver driver;

	@BeforeClass
	public void Setup() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "nexus_seven");
		capabilities.setCapability("app", "C://Users//310278065//Desktop//Demo_Ws//apk//app-test-apk.apk");
		capabilities.setCapability("platformVersion", "4.4.2");
		capabilities.setCapability("appPackage", "com.techbins.niki.beta");
		
		driver = new AndroidDriver(new URL(
				"http://localhost:4723/wd/hub"), capabilities);

	}

	@Test
	public void SimpleTest() {
		Assert.assertNotNull(driver.getContext());
         }
}
