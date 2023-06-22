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

public class ScrollParticularElement 
{
	@Test	
	public void scrol() throws Exception
	{
		File f = new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service = new  AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(30)).build();
		service.start();
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
	dc.setCapability(MobileCapabilityType.UDID,"GIA6IJVKLJI7FQEM");
	dc.setCapability("appPackage","io.appium.android.apis") ;
	dc.setCapability("appActivity",".ApiDemos");
	URL u = new URL("http://localhost:4723");
	AndroidDriver driver = new AndroidDriver(u, dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));  //scroll down
// scroll up
//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Custom\"))")); not working
	
//scroll up
	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
			+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" +"Custom" + "\").instance(0))")).click();
}
}
