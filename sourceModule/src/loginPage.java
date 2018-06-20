import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class loginPage {
    public loginPage() throws MalformedURLException {
    }
    //Methods to return elements
    public MobileElement getUserLogin() {
        MobileElement userLogin = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/text_login");
        return userLogin;
    }

    public MobileElement getEmailField() {
        MobileElement userEmail = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/edit_text_email");
        return userEmail;
    }
    public MobileElement getPassword() {
        MobileElement userPassword = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/edit_text_password");
        return userPassword;
    }
    public  MobileElement getLoginButton() {
        MobileElement loginButton = (MobileElement) baseClass.driver.findElementById("com.getdoctalk.doctalk.app.patient.debug:id/button_login");
        return loginButton;
    }

    //Methds to perform action on elements
    public void userLoginClick() {
        getUserLogin().click();
    }

    public void setUserEmail(String username) {
        getEmailField().click();
        getEmailField().sendKeys(username);

    }

    public void setUserPassword(String password) {
        getPassword().click();
        getPassword().sendKeys(password);
    }

    public void clickLogin() {
        getLoginButton().click();
    }
}
