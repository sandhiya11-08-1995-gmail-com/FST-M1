package TestActivities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	
	AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "PixelEmulator");
		cap.setCapability("platformName", "android");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", ".Calculator");
		
		URL appserver = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appserver, cap);
	
	}
	
	@Test
	public void add() {
		
		driver.findElementById("digit_6").click();
		driver.findElementByAccessibilityId("multiply").click();
		driver.findElementByXPath("//android.widget.Button[@text='7']").click();
		driver.findElementByAccessibilityId("equals").click();
		
		String result = driver.findElementById("result").getText();
		Assert.assertEquals(result, "42");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
