import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class subscriptionTab {
    public subscriptionTab() throws MalformedURLException {
    }

    baseClass baseClass = new baseClass();

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


    public void closeButtonClick() {
        closeButton.click();
    }
    public String getsubscriptionCycleLabel(){
        return subscriptionCycleLabel.getText();
    }
    public String getsubscriptionCycleValue(){
        return subscriptionCycleValue.getText();
    }
    public  String getsubscriptionDaysLabel() {
        return subscriptionDaysLabel.getText();
    }
    public String getsubscriptionDaysValue() {
        return subscriptionDaysValue.getText();
    }

    public String getdoctorNameLabel() {
        return docNameLabel.getText();
    }
    public String getdoctorNameValue() {
        return docNameValue.getText();

    }
    public String getspecialityLabel() {
        return specialityLabel.getText();
    }

    public String getspecialityValue() {
        return specialityValue.getText();
    }

    public String getmonthlyFeeLabel() {
        return monthlyFeeLabel.getText();
    }

    public String getmonthlyFeeValue() {
        return monthlyFeeValue.getText();
    }

}
