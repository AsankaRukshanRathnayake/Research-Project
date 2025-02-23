import Constants.LabelConstants;
import functions.MainFunctions;
import functions.homeFunctions;
import functions.login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static functions.MainFunctions.driver1;

public class LoginTest {
    @BeforeMethod
    public void setup(){
        MainFunctions.setup();
        driver1.get("https://www.keellssuper.com/");
        homeFunctions.closeHelloPopup();
        homeFunctions.clickOnLogin();
    }

    @AfterMethod
    public void close(){
        driver1.close();
        driver1.quit();
    }

    @Test(description = "RPKE-TC-06 - verify login page is loading", alwaysRun = true)
    public void verifyLoginPageIsLoading(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
    }

    @Test(description = "RPKE-TC-07 - verify content of the login page", alwaysRun = true)
    public void verifyLoginPageContent(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        Assert.assertTrue(login.isKeellsLogoPresent());
        Assert.assertEquals(login.getEmailLabelText(), LabelConstants.EMAIL);
        Assert.assertEquals(login.getPasswordLabelText(), LabelConstants.PASSWORD);
        Assert.assertTrue(login.isEmailFieldPresent());
        Assert.assertTrue(login.isPasswordFieldPresent());
        Assert.assertEquals(login.getLoginButtonText(), LabelConstants.LOGIN);

        Assert.assertEquals(login.getMobileNumberLabelText(), LabelConstants.ENTER_MOBILE_NUMBER);
        Assert.assertTrue(login.isMobileNumberFieldPresent());
        Assert.assertEquals(login.getVerifyNumberButtonText(), LabelConstants.VERIFY_NUMBER);

        Assert.assertEquals(login.getOTPLabelText(), LabelConstants.OTP_NUMBER);
        Assert.assertTrue(login.isOTPFieldPresent());
        Assert.assertEquals(login.getSubmitButtonText(), LabelConstants.SUBMIT);
    }


    @Test(description = "RPKE-TC-08 - verify login with empty email and empty password", alwaysRun = true)
    public void verifyLoginWithEmptyEmailAndEmptyPassword(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        login.enterEmail("");
        login.enterPassword("");
        login.clickLogin();
        Assert.assertEquals(login.getEmailErrorText(), LabelConstants.EMAIL_IS_REQUIRED);
        Assert.assertEquals(login.getPasswordErrorText(), LabelConstants.PASSWORD_IS_REQUIRED);
    }

    @Test(description = "RPKE-TC-09 - verify login with an email and an empty password", alwaysRun = true)
    public void verifyLoginWithValidEmailAndEmptyPassword(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        login.enterEmail("abc@gmail.com");
        login.clickLogin();
        Assert.assertEquals(login.getPasswordErrorText(), LabelConstants.PASSWORD_IS_REQUIRED);
    }


    @Test(description = "RPKE-TC-10 - verify login with an empty email and a password", alwaysRun = true)
    public void verifyLoginWithEmptyEmailAndValidPassword(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        login.enterPassword("123456");
        login.clickLogin();
        Assert.assertEquals(login.getEmailErrorText(), LabelConstants.EMAIL_IS_REQUIRED);
    }

    @Test(description = "RPKE-TC-11 - verify login with invalid email", alwaysRun = true)
    public void verifyLoginWithInvalidEmail(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        login.enterEmail("ajdksk");
        login.clickLogin();
        Assert.assertEquals(login.getEmailErrorText(), LabelConstants.INVALID_EMAIL);
    }


    @Test(description = "RPKE-TC-12 - verify login with empty mobile number", alwaysRun = true)
    public void verifyLoginWithEmptyMobileNumber(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        login.enterMobileNumber("");
        login.clickVerifyNumber();
        Assert.assertEquals(login.getMobileNumberErrorText(), LabelConstants.MOBILE_NUMBER_IS_REQUIRED);
    }

    @Test(description = "RPKE-TC-13 - verify login with invalid mobile number", alwaysRun = true)
    public void verifyLoginWithInvalidMobileNumber(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        login.enterMobileNumber("0123456789");
        login.clickVerifyNumber();
        Assert.assertEquals(login.getMobileNumberErrorPopupText(), LabelConstants.MOBILE_NUMBER_ERROR_POPUP);
    }

    @Test(description = "RPKE-TC-14 - verify OTP Number field and submit button are disabled", alwaysRun = true)
    public void verifyOTPFieldAndSubmitButtonAreDisabled(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        Assert.assertFalse(login.isOTPFieldEnabled());
        Assert.assertFalse(login.isSubmitButtonEnabled());
    }

    @Test(description = "RPKE-TC-15 - verify forget password", alwaysRun = true)
    public void verifyForgetPasswordLink(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        login.clickOnForgotPassword();
        Assert.assertEquals(login.getResetPasswordPageLabelText(), LabelConstants.RESET_PASSWORD);
    }

    @Test(description = "RPKE-TC-16 - verify content of the reset password screen", alwaysRun = true)
    public void verifyResetPasswordPageContent(){

    }

    @Test(description = "RPKE-TC-17 - verify register button", alwaysRun = true)
    public void verifyRegisterButton(){
        Assert.assertEquals(login.getPageLabelText(), LabelConstants.LOGIN);
        login.clickOnRegister();
        Assert.assertEquals(login.getRegisterPageLabelText(), LabelConstants.CREATE_ACCOUNT);

    }

    @Test(description = "RPKE-TC-18 - verify content of the register screen", alwaysRun = true)
    public void verifyRegisterPageContent(){

    }
}
