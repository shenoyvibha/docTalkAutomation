import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class homePage {
    public homePage() throws MalformedURLException {
    }
    //Methods to return elements
    public MobileElement getMoreButton() {
        MobileElement moreButton = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/menu_item_more");
        return moreButton;
    }

    //Methods to perform action on elements

    public void clickMoreButton() throws MalformedURLException {
        getMoreButton().click();
    }
}
