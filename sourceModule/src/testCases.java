import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class testCases {


    public testCases() throws MalformedURLException {
    }
    supportingMethods supportingMethods = new supportingMethods();
    homePage homePage = new homePage();
    subscriptionTab subscriptionTab = new subscriptionTab();
    propertiesFile propertiesFile = new propertiesFile();

    @AfterTest
    public void tearDown() {
        baseClass.driver.closeApp();
    }

    @Test(description = "Sign-in --> click on more --> click on profile of user --> signout")
    public void signInSignOut() throws MalformedURLException {

        supportingMethods.login(propertiesFile.email, propertiesFile.password);
        homePage.clickMoreButton();
        supportingMethods.signoutMethod();
    }

    @Test(description = "Sign-in --> Click on More-->Click on Subscription details"+
                        " Retrieve and print subscription details--> Signout")
    public void subscriptionPrint() throws MalformedURLException {
        supportingMethods.login(propertiesFile.email, propertiesFile.password);
        homePage.clickMoreButton();
        supportingMethods.printSubscriptionDetails();
        subscriptionTab.closeButtonClick();
        supportingMethods.signoutMethod();
    }

}
