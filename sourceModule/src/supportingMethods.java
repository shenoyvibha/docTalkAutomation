import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class supportingMethods {
    public supportingMethods() throws MalformedURLException {
    }
    homePage homePage = new homePage();
    baseClass baseClass = new baseClass();
    objectRepository objectRepository = new objectRepository();
    profileTab profileTab = new profileTab();
    moreTab moreTab = new moreTab();
    subscriptionTab subscriptionTab = new subscriptionTab();
    propertiesFile propertiesFile = new propertiesFile();
    loginPage loginPage = new loginPage();

    public void login(String username, String password) {
        loginPage.userLoginClick();
        loginPage.setUserEmail(username);
        loginPage.setUserPassword(password);
        loginPage.clickLogin();
    }

    public void signoutMethod() {
        moreTab.clickPatientProfileCard();
        profileTab.clickSignoutButton();
    }

    public void printSubscriptionDetails() {
        moreTab.clickSubscriptionDetails();
        System.out.println(subscriptionTab.getsubscriptionCycleLabel());
        System.out.println("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getsubscriptionCycleValue());
        System.out.println("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getsubscriptionDaysLabel());
        System.out.println("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getsubscriptionDaysValue());
        System.out.println("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getdoctorNameLabel());
        System.out.println("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getdoctorNameValue());
        System.out.println("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getspecialityLabel());
        System.out.println("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getspecialityValue());
        System.out.println("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getmonthlyFeeLabel());
        System.out.println("\t\t\t\t\t\t");
        System.out.println(subscriptionTab.getmonthlyFeeValue());
        System.out.println("\t\t\t\t\t\t");
    }
    @Test(priority = 1)
    public void signInSignOut() {
        login(propertiesFile.email,propertiesFile.password);
        homePage.clickMoreButton();
        signoutMethod();
    }

}
