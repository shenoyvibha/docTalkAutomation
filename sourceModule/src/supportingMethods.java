import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class supportingMethods {
    public supportingMethods() throws MalformedURLException {
    }

    loginPage loginPage = new loginPage();
    profileTab profileTab = new profileTab();
    moreTab moreTab = new moreTab();

    public void login(String username, String password) throws MalformedURLException {
        baseClass.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        loginPage.userLoginClick();
        loginPage.setUserEmail(username);
        loginPage.setUserPassword(password);
        loginPage.clickLogin();
    }

    public void signoutMethod() throws MalformedURLException {
        moreTab.clickPatientProfileCard();
        profileTab.clickSignoutButton();
        profileTab.clickConfirmSignout();
    }

    public void printSubscriptionDetails() throws MalformedURLException {
        moreTab moreTab = new moreTab();
        subscriptionTab subscriptionTab = new subscriptionTab();
        moreTab.clickSubscriptionDetails();
        System.out.print(subscriptionTab.getsubscriptionCycleLabel());
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getsubscriptionCycleValue());
        System.out.print(subscriptionTab.getsubscriptionDaysLabel());
        System.out.print("\t\t\t\t\t");
        System.out.println(subscriptionTab.getsubscriptionDaysValue());
        System.out.print(subscriptionTab.getdoctorNameLabel());
        System.out.print("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getdoctorNameValue());
        System.out.print(subscriptionTab.getspecialityLabel());
        System.out.print("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getspecialityValue());
        System.out.print(subscriptionTab.getmonthlyFeeLabel());
        System.out.print("\t\t\t\t\t\t");
        System.out.print(subscriptionTab.getmonthlyFeeValue());
    }


}
