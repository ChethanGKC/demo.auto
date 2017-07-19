package com.chethan.demo.auto;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iosAppLaunch {
	AppiumDriver driver;

	@BeforeClass
	public void Setup() throws MalformedURLException {

		// set up appium against a local application
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				"10.1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Iphone");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
		capabilities.setCapability(MobileCapabilityType.UDID,
				"2b94842eaa517be8ef2c8cebe6be37e299a341d3");
		capabilities.setCapability("showXcodeLog", true);
		capabilities
				.setCapability("app",
						"/Users/philips/Desktop/iPA/uGrow-TestAutomation-v0.41.0-SNAPSHOT-3(71).ipa");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
				"XCUITest");
		capabilities.setCapability("xcodeConfigFile",
				"/Users/philips/code/dev.xcconfig");
		capabilities.setCapability("realDeviceLogger",
				"/usr/local/lib/node_modules/deviceconsole/deviceconsole");
		capabilities.setCapability("newCommandTimeout", "7200");
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("autoDismissAlerts", true);
		driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"),
				capabilities);

	}

	@Test
	public void SimpleTest() {
		Assert.assertNotNull(driver.getContext());
	}

}
