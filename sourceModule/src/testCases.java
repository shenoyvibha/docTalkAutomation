import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class testCases {
    baseClass baseClass = new baseClass();
    supportingMethods supportingMethods = new supportingMethods();
    propertiesFile propertiesFile = new propertiesFile();
    homePage homePage = new homePage();
    moreTab moreTab = new moreTab();
    subscriptionTab subscriptionTab = new subscriptionTab();
    loginPage loginPage = new loginPage();

    public testCases() throws MalformedURLException {
    }
   @AfterMethod
    public void tearDown() {
        baseClass.driver.quit();
    }

    @Test(priority = 1)
    public void signInSignOut() {
        supportingMethods.login(propertiesFile.email,propertiesFile.password);
        homePage.clickMoreButton();
        supportingMethods.signoutMethod();
    }

    @Test(priority = 2)
    public void subscriptionPrint() {
        supportingMethods.login(propertiesFile.email, propertiesFile.password);
        homePage.clickMoreButton();
        moreTab.clickSubscriptionDetails();
        supportingMethods.printSubscriptionDetails();
        subscriptionTab.closeButtonClick();
        supportingMethods.signoutMethod();
    }

}
