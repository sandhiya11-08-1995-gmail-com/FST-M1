package TestActivities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;

public class Activity4 {

	AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "PixelEmulator");
		cap.setCapability("platformName", "android");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", ".activities.PeopleActivity");
	
		URL appserver = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appserver, cap);
	}
	
	@Test
	public void addContact() {
		
		driver.findElementByAccessibilityId("Create new contact").click();
		//driver.findElementById("add_contact_button").click();
		driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Aaditya");
		driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Varma");
		driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("999148292");
		
		driver.findElementById("editor_menu_save_button").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("title_gradient")));
		
		String savedText = driver.findElementById("large_title").getText();
		System.out.println("savedText: "+savedText);
		Assert.assertEquals(savedText, "Aaditya Varma");
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
