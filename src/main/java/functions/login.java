package functions;

import org.example.Main;
import pages.loginPage;

public class login {
    private static loginPage loginPage = new loginPage();

    public static String getPageLabelText(){
        return loginPage.getPageLabelText();
    }


    public static boolean isKeellsLogoPresent(){
        return loginPage.isKeellsLogoPresent();
    }

    public static String getRegisterButtonText(){
        return loginPage.getRegisterButtonText();
    }

    public static String getEmailLabelText(){
        return loginPage.getEmailLabelText();
    }

    public static String getPasswordLabelText(){
        return loginPage.getPasswordLabelText();
    }

    public static String getMobileNumberLabelText(){
        return loginPage.getMobileNumberLabelText();
    }

    public static String getOTPLabelText(){
        return loginPage.getOTPLabelText();
    }

    public static String getLoginButtonText(){
        return loginPage.getLoginButtonText();
    }

    public static String getVerifyNumberButtonText(){
        return loginPage.getVerifyNumberButtonText();
    }

    public static String getSubmitButtonText(){
        return loginPage.getSubmitButtonText();
    }

    public static String getForgetPasswordLinkText(){
        return loginPage.getForgetPasswordLinkText();
    }

    public static boolean isEmailFieldPresent(){
        return loginPage.isEmailFieldPresent();
    }

    public static boolean isPasswordFieldPresent(){
        return loginPage.isPasswordFieldPresent();
    }

    public static boolean isMobileNumberFieldPresent(){
        return loginPage.isMobileNumberFieldPresent();
    }

    public static boolean isOTPFieldPresent(){
        return loginPage.isOTPFieldPresent();
    }

    public static String getEmailErrorText(){
        return loginPage.getEmailErrorText();
    }

    public static String getPasswordErrorText(){
        return loginPage.getPasswordErrorText();
    }

    public static String getMobileNumberErrorText(){
        return loginPage.getMobileNumberErrorText();
    }

    public static void enterEmail(String email){
        loginPage.enterEmail(email);
    }

    public static void enterPassword(String password){
        loginPage.enterPassword(password);
    }

    public static void enterMobileNumber(String mobile){
        loginPage.enterMobileNumber(mobile);
    }

    public static void clickLogin(){
        loginPage.clickLogin();
    }

    public static void clickVerifyNumber(){
        loginPage.clickVerifyNumber();
    }

    public static String getMobileNumberErrorPopupText(){
        return loginPage.getMobileNumberErrorPopupText();
    }

    public static boolean isOTPFieldEnabled(){
        return loginPage.isOTPNumberFieldEnabled();
    }

    public static boolean isSubmitButtonEnabled(){
        return loginPage.isSubmitButtonEnabled();
    }

    public static void clickOnForgotPassword(){
        loginPage.clickForgetPassword();
    }

    public static String getResetPasswordPageLabelText(){
        return loginPage.getResetPasswordPageLabelText();
    }

    public static void clickOnRegister(){
        loginPage.clickRegister();
    }

    public static String getRegisterPageLabelText(){
        return loginPage.getRegisterPageLabelText();
    }
}
