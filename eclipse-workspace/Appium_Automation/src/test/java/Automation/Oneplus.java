package Automation;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Oneplus 
{
	@Test
	public void test2() throws Throwable
	{
	
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
	dc.setCapability(MobileCapabilityType.UDID,"fd806b6d");
	dc.setCapability("appPackage","com.oneplus.calculator");
	dc.setCapability("appActivity",".Calculator");

	URL u = new URL("http://localhost:4723");
	AndroidDriver driver = new AndroidDriver(u, dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}



