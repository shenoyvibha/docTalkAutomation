import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class loginPage {
    public loginPage() throws MalformedURLException {
    }
    baseClass baseClass = new baseClass();
    propertiesFile propertiesFile = new propertiesFile();

    //Main page
    MobileElement userLogin = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_login");

    MobileElement userEmail = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/edit_text_email");
    MobileElement userPassword = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/edit_text_password");
    MobileElement loginButton = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/button_login");

    public void userLoginClick() {
        userLogin.click();
    }
    public void setUserEmail(String username) {
        userEmail.click();
        userEmail.sendKeys(username);

    }
    public void setUserPassword(String password) {
        userPassword.click();
        userPassword.sendKeys(password);
    }
    public void clickLogin() {
        loginButton.click();
    }

}
