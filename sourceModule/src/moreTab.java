import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class moreTab {
    public moreTab() throws MalformedURLException {
    }

    //Methods to return elements
    public MobileElement getPatientProfileCard() {
        MobileElement patientProfileCard = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/layout_more_items_header");
        return patientProfileCard;
    }

    public MobileElement getSubscriptionDetails() {
        MobileElement subscriptionDetails = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/button_subscription");
        return  subscriptionDetails;
    }

    //Methods to perform action on different elements
    public void clickPatientProfileCard() {
        getPatientProfileCard().click();
    }

    public void clickSubscriptionDetails() {
        getSubscriptionDetails().click();
    }
}
