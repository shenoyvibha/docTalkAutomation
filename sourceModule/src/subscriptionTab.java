import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class subscriptionTab {
    public subscriptionTab() throws MalformedURLException {
    }
    //Method to return elements
    public MobileElement getCloseButton() {
        MobileElement closeButton = (MobileElement) baseClass.driver.findElementByAccessibilityId("Navigate up");
        return closeButton;
    }
    public MobileElement getSubscriptioncycleLabelElement() {
        MobileElement subscriptionCycleLabel = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_cycle_label");
        return subscriptionCycleLabel;
    }
    public MobileElement subscriptionCycleValueElement() {
        MobileElement subscriptionCycleValue = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_cycle_value");
        return  subscriptionCycleValue;
    }
    public  MobileElement subscriptionDaysLabelElement() {
        MobileElement subscriptionDaysLabel = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_remaining_days_label");
        return  subscriptionDaysLabel;
    }
    public  MobileElement subscriptionDaysLabelValueElement() {
        MobileElement subscriptionDaysValue = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_remaining_days_value");
        return  subscriptionDaysValue;
    }

    public  MobileElement getDoctorNameLabelElement() {
        MobileElement docNameLabel = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_name_label");
        return  docNameLabel;
    }

    public  MobileElement getDocValueElement() {
        MobileElement docNameValue = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_name_value");
        return docNameValue;
    }
    public MobileElement getSpecialityLabelElement() {
        MobileElement specialityLabel =(MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_speciality_label");
        return specialityLabel;
    }

    public MobileElement getSpecialityValueElement() {
        MobileElement specialityValue =(MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_speciality_value");
        return specialityValue;
    }

    public MobileElement getMonthlyFeeLabelElement() {
        MobileElement monthlyFeeLabel =(MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_label_fee");
        return  monthlyFeeLabel;
    }

    public MobileElement getMonthlyfeeValueElement() {
        MobileElement monthlyFeeValue =(MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_fee_value");
        return monthlyFeeValue;
    }
    //Methods to perform actions on elements
    public void closeButtonClick() {
        getCloseButton().click();
    }
    public String getsubscriptionCycleLabel(){
        return getSubscriptioncycleLabelElement().getText();
    }
    public String getsubscriptionCycleValue(){
        return subscriptionCycleValueElement().getText();
    }
    public  String getsubscriptionDaysLabel() {
        return subscriptionDaysLabelElement().getText();
    }
    public String getsubscriptionDaysValue() {

        return subscriptionDaysLabelValueElement().getText();
    }

    public String getdoctorNameLabel() {

        return getDoctorNameLabelElement().getText();
    }
    public String getdoctorNameValue() {

        return getDocValueElement().getText();

    }
    public String getspecialityLabel() {

        return getSpecialityLabelElement().getText();
    }

    public String getspecialityValue() {

        return getSpecialityValueElement().getText();
    }

    public String getmonthlyFeeLabel() {

        return getMonthlyFeeLabelElement().getText();
    }

    public String getmonthlyFeeValue() {

        return getMonthlyfeeValueElement().getText();
    }

}
