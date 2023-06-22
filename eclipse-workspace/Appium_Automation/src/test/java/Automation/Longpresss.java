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
import org.testng.asserts.Assertion;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Longpresss
{
	@Test
	public void testing() throws Throwable
	{
		
			File f = new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
			AppiumDriverLocalService service = new  AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(30)).build();
			service.start();


			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
			dc.setCapability(MobileCapabilityType.UDID,"fd806b6d");
			dc.setCapability("appPackage","io.appium.android.apis");
			dc.setCapability("appActivity",".ApiDemos");
			URL u = new URL("http://localhost:4723");
			AndroidDriver driver = new AndroidDriver(u, dc);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
			driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
			WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
			
			((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
					"elementId", ((RemoteWebElement) ele).getId(),
					"duration",2000
					));
			service.stop();
			WebElement ele1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sample menu']"));
			String t = ele1.getText();
			System.out.println(t);
			Assertion a = new Assertion();
			a.assertEquals("Sample menu", t);
		}
	}

