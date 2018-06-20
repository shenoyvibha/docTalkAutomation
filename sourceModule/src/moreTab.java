import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class moreTab {
    public moreTab() throws MalformedURLException {
    }
    baseClass baseClass = new baseClass();

    MobileElement patientProfileCard = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/layout_more_items_header");
    MobileElement subscriptionDetails = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/button_subscription");



    public void clickPatientProfileCard() {
        patientProfileCard.click();
    }

    public void clickSubscriptionDetails() {
        subscriptionDetails.click();
    }
}
