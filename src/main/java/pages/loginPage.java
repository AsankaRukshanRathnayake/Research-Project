package pages;

import functions.MainFunctions;
import org.openqa.selenium.By;

public class loginPage {
    private static final By KEELLS_LOGO =By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/img");
    private static final By LOGIN_LABEL =By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/span[1]/b");
    private static final By REGISTER_BUTTON =By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[2]/button");
    private static final By EMAIL_LABEL =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/label");
    private static final By EMAIL_FIELD =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input");
    private static final By PASSWORD_LABEL =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/label");
    private static final By PASSWORD_FIELD =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div/input");
    private static final By LOGIN_BUTTON =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/button");
    private static final By MOBILE_NUMBER_FIELD =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/input");
    private static final By MOBILE_NUMBER_LABEL =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/label");
    private static final By VERIFY_NUMBER_BUTTON =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/button");
    private static final By OTP_NUMBER_LABEL =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/label");
    private static final By OTP_NUMBER_FIELD =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/input");
    private static final By SUBMIT_BUTTON =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/button");
    private static final By FORGET_PASSWORD_LINK =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/span[2]");

    private static final By EMAIL_ERROR = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]");
    private static final By PASSWORD_ERROR = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/span[1]");
    private static final By MOBILE_NUMBER_ERROR = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/span[1]");
    private static final By MOBILE_NUMBER_ERROR_POPUP = By.xpath("/html/body/div[3]/div/div/div/div[2]/div/p");

    private static final By RESET_PASSWORD_PAGE_LABEL = By.xpath("/html/body/div[1]/div/div[2]/div[5]/div[1]/div/span[1]");

    private static final By REGISTER_PAGE_LABEL = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div/span[1]");

    public String getPageLabelText(){
        return MainFunctions.getTextByElement(LOGIN_LABEL);
    }

    public boolean isKeellsLogoPresent(){
        return MainFunctions.isElementDisplayed(KEELLS_LOGO);
    }

    public String getRegisterButtonText(){
        return MainFunctions.getTextByElement(REGISTER_BUTTON);
    }

    public String getEmailLabelText(){
        return MainFunctions.getTextByElement(EMAIL_LABEL);
    }

    public String getPasswordLabelText(){
        return MainFunctions.getTextByElement(PASSWORD_LABEL);
    }

    public String getMobileNumberLabelText(){
        return MainFunctions.getTextByElement(MOBILE_NUMBER_LABEL);
    }

    public String getOTPLabelText(){
        return MainFunctions.getTextByElement(OTP_NUMBER_LABEL);
    }

    public String getLoginButtonText(){
        return MainFunctions.getTextByElement(LOGIN_BUTTON);
    }

    public String getVerifyNumberButtonText(){
        return MainFunctions.getTextByElement(VERIFY_NUMBER_BUTTON);
    }

    public String getSubmitButtonText(){
        return MainFunctions.getTextByElement(SUBMIT_BUTTON);
    }

    public String getForgetPasswordLinkText(){
        return MainFunctions.getTextByElement(FORGET_PASSWORD_LINK);
    }

    public boolean isEmailFieldPresent(){
        return MainFunctions.isElementDisplayed(EMAIL_FIELD);
    }

    public boolean isPasswordFieldPresent(){
        return MainFunctions.isElementDisplayed(PASSWORD_FIELD);
    }

    public boolean isMobileNumberFieldPresent(){
        return MainFunctions.isElementDisplayed(MOBILE_NUMBER_FIELD);
    }

    public boolean isOTPFieldPresent(){
        return MainFunctions.isElementDisplayed(OTP_NUMBER_FIELD);
    }

    public String getEmailErrorText(){
        return MainFunctions.getTextByElement(EMAIL_ERROR);
    }

    public String getPasswordErrorText(){
        return MainFunctions.getTextByElement(PASSWORD_ERROR);
    }

    public String getMobileNumberErrorText(){
        return MainFunctions.getTextByElement(MOBILE_NUMBER_ERROR);
    }

    public void enterEmail(String email){
        MainFunctions.sendKeys(EMAIL_FIELD, email);
    }

    public void enterPassword(String password){
        MainFunctions.sendKeys(PASSWORD_FIELD, password);
    }

    public void enterMobileNumber(String mobile){
        MainFunctions.sendKeys(MOBILE_NUMBER_FIELD, mobile);
    }

    public void clickLogin(){
        MainFunctions.clickOnUIElement(LOGIN_BUTTON);
    }

    public void clickVerifyNumber(){
        MainFunctions.clickOnUIElement(VERIFY_NUMBER_BUTTON);
    }

    public String getMobileNumberErrorPopupText(){
        return MainFunctions.getTextByElement(MOBILE_NUMBER_ERROR_POPUP);
    }

    public boolean isOTPNumberFieldEnabled(){
        return MainFunctions.isEnabled(OTP_NUMBER_FIELD);
    }

    public boolean isSubmitButtonEnabled(){
        return MainFunctions.isEnabled(SUBMIT_BUTTON);
    }

    public void clickForgetPassword(){
        MainFunctions.clickOnUIElement(FORGET_PASSWORD_LINK);
    }

    public String getResetPasswordPageLabelText(){
        return MainFunctions.getTextByElement(RESET_PASSWORD_PAGE_LABEL);
    }

    public void clickRegister(){
        MainFunctions.clickOnUIElement(REGISTER_BUTTON);
    }

    public String getRegisterPageLabelText(){
        return MainFunctions.getTextByElement(REGISTER_PAGE_LABEL);
    }

}
