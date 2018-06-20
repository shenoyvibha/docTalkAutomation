import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class profileTab {
    public profileTab() throws MalformedURLException {
    }
    baseClass baseClass = new baseClass();

    MobileElement signoutButton = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/button_sign_out");
    MobileElement profileBackButton = (MobileElement) baseClass.driver.findElementsByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    MobileElement confirmSignout = (MobileElement) baseClass.driver.findElementById("android:id/button1");

    public void clickSignoutButton() {
        signoutButton.click();
        confirmSignout.click();

    }
}

