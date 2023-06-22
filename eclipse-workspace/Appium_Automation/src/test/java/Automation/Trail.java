package Automation;


import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import GenericUtitity.AppiumUtility;
import GenericUtitity.DriverUtility;
import GenericUtitity.GestureUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class Trail extends AppiumUtility
{
	

	@Test
	public void test() throws Throwable
	{
		
		        DriverUtility d = new DriverUtility();
		        d.implicitwait(driver);
		         GestureUtility g = new GestureUtility();
		         driver.findElement(AppiumBy.accessibilityId("Views")).click();
		        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		        WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));
		        g.swipeparticular(driver, ele);
		        g.swipright(driver, 50, 300, 50, 900);
		       
		         
		        
		
	}
}
