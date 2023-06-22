package Automation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Animation
{
	 @Test
	 public void Ani() throws Throwable
	 {
		 File f = new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		 AppiumDriverLocalService ser = new  AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
		 ser.start();
		    DesiredCapabilities dc = new DesiredCapabilities();
		    dc.setCapability(MobileCapabilityType.PLATFORM_NAME ,"Android");
		    dc.setCapability(MobileCapabilityType.DEVICE_NAME,"OnePlus");
		    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		    dc.setCapability(MobileCapabilityType.UDID,"fd806b6d");
		    dc.setCapability("appPackage","io.appium.android.apis");
		    dc.setCapability("appActivity",".ApiDemos");
		      URL U = new URL("http://localhost:4723");
		       AndroidDriver driver = new AndroidDriver(U,dc);
		       driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
		       driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying")).click();
		       driver.findElement(AppiumBy.accessibilityId("Task Take out Trash")).click();
		       driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
	 }

}
