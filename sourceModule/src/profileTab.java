import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class profileTab {
    public profileTab() throws MalformedURLException {
    }

    //Methods to return elements
    public MobileElement getSignOutButton() {
        MobileElement signoutButton = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/button_sign_out");
        return signoutButton;
    }

    public MobileElement getConfirmSignOutButton() {
        MobileElement confirmSignout = (MobileElement) baseClass.driver.findElementById("android:id/button1");
        return confirmSignout;
    }

    //Methods to perform action on elements
    public void clickSignoutButton() {
        getSignOutButton().click();

    }
    public void clickConfirmSignout() {
        getConfirmSignOutButton().click();
    }
}

