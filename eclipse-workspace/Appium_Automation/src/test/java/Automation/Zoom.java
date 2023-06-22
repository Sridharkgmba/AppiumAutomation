package Automation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Zoom 
{
	@Test
	public void zooming() throws MalformedURLException
	{
		
				File f = new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
				AppiumDriverLocalService service = new  AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(30)).build();
				service.start();


				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
				dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus");
				dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
				dc.setCapability(MobileCapabilityType.UDID,"fd806b6d");
				dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
				dc.setCapability("appActivity",".MainActivity");
				URL u = new URL("http://localhost:4723");
				AndroidDriver driver = new AndroidDriver(u, dc);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/continue_button")).click();
				driver.findElement(AppiumBy.id("andorid:id/button")).click();
				driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
				WebElement ele = driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
				// zoom in
				((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) ele).getId(),
				    "percent", 0.75
				));
				// zoom out
				((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) ele).getId(),
				    "percent", 0.75
				));
	}

}
	
