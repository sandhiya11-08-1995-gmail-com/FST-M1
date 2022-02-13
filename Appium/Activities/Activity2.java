package TestActivities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {

	AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "PixelEmulator");
		cap.setCapability("platformName", "android");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPakage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		URL appserver = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appserver, cap);
	}

	@Test
	public void print() {
		driver.get("https://www.training-support.net/");
		String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
		System.out.println("pageTitle : "+pageTitle);
		
		driver.findElementById("about-link").click();
		
		String newPageTitle = driver.findElementByXPath("//android.widget.TextView[@text='About Us']").getText();
	    System.out.println("Title on new page: " + newPageTitle);
	    
	    Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
