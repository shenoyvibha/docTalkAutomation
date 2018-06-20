import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class baseClass {

    public baseClass() throws MalformedURLException {
    }

    public static AndroidDriver getDriver() {
        File app = new File("/Users/vibha/apks/patient-debug.apk"); //Specify where your apk is stored
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("deviceName", ""); //Enter your device name
        capabilities.setCapability("platformversion", ""); //Enter device platform
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        AndroidDriver driver = null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;

    }

    public static AppiumDriver driver = getDriver();
}

