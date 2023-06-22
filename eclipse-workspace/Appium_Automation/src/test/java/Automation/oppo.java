package Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class oppo 
{
	@Test
	public void test() throws Throwable
	{
		
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A83");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
			dc.setCapability(MobileCapabilityType.UDID,"GIA6IJVKLJI7FQEM");
			dc.setCapability("appPackage","com.meesho.supply");
			dc.setCapability("appActivity",".Meesho");

			URL u = new URL("http://localhost:4723");
			AndroidDriver driver = new AndroidDriver(u, dc);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}


