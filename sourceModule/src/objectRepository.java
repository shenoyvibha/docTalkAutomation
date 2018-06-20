import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class objectRepository {

    public objectRepository() throws MalformedURLException {
    }
    baseClass baseClass = new baseClass();
    propertiesFile propertiesFile = new propertiesFile();
    //com.getdoctalk.doctalk.app.patient.debug:id/button_create_account
    MobileElement userLogin = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_login");
    //Login page
    MobileElement userEmail = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/edit_text_email");
    MobileElement userPassword = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/edit_text_password");
    MobileElement loginButton = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/button_login");

    //HomePage
    MobileElement moreButton = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/menu_item_more");
    MobileElement patientProfileCard = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/layout_more_items_header");

    //Subscription
    MobileElement subscriptionDetails = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/button_subscription");

    //Subscription details
    MobileElement subscriptionCycleLabel = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_cycle_label");
    MobileElement subscriptionCycleValue = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_cycle_value");
    MobileElement subscriptionDaysLabel = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_remaining_days_label");
    MobileElement subscriptionDaysValue = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_remaining_days_value");
    MobileElement docNameLabel = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_name_label");
    MobileElement docNameValue = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_name_value");
    MobileElement specialityLabel =(MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_speciality_label");
    MobileElement specialityValue =(MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_speciality_value");
    MobileElement monthlyFeeLabel =(MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_label_fee");
    MobileElement monthlyFeeValue =(MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_fee_value");

    MobileElement closeButton = (MobileElement) baseClass.driver.findElementsByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");


    //Signout
    MobileElement signoutButton = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/button_sign_out");




}
