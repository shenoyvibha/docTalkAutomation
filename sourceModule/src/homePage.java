import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class homePage {
    public homePage() throws MalformedURLException {
    }

    baseClass baseClass = new baseClass();
    MobileElement moreButton = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/menu_item_more");


    public void clickMoreButton() {
        moreButton.click();
    }
}
