package TestConfig;

import com.sun.deploy.panel.AndOrRadioPropertyGroup;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;


    @BeforeSuite
    public void Prepare() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.turkishairlines.mobile");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.turkishairlines.mobile.ui.main.MainActivity");
        capabilities.setCapability("autoGrantPermissions",true);
        capabilities.setCapability("autoDissmissAlerts",true);
        URL url = new URL("http://127.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,capabilities);
    }
    /*@AfterSuite
    public void Quit()
    {
        driver.quit();
    }*/
}
