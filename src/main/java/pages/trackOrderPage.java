package pages;

import functions.MainFunctions;
import org.example.Main;
import org.openqa.selenium.By;

public class trackOrderPage {
    private static final By TRACK_ORDER_LABEL = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/div[1]/div/span[1]/b");
    private static final By SUBMIT_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/div[2]/div[3]/div/button");
    private static final By ERROR_1 = By.xpath("/html/body/div/div/div[2]/div[4]/div/div[2]/div[1]/div/div/span");
    private static final By ERROR_2 = By.xpath("/html/body/div/div/div[2]/div[4]/div/div[2]/div[2]/div/div/span");
    private static final By ORDER_NUMBER_FIELD = By.xpath("/html/body/div/div/div[2]/div[4]/div/div[2]/div[1]/div/div/div[1]/input");
    private static final By CONTACT_NUMBER_FIELD = By.xpath("/html/body/div/div/div[2]/div[4]/div/div[2]/div[2]/div/div/div/input");
    private static final By INVALID_ORDER_ERROR_POPUP = By.xpath("/html/body/div[3]/div/div/div/div[2]/div/p");
    private static final By KEELLS_LOGO = By.xpath("/html/body/div/div/div[2]/div[4]/div/div[1]/div/img");
    private static final By INSTRUCTIONS = By.xpath("/html/body/div/div/div[2]/div[4]/div/div[1]/div/span[2]");
    private static final By ORDER_NUMBER_LABEL = By.xpath("/html/body/div/div/div[2]/div[4]/div/div[2]/div[1]/div/div/label");
    private static final By CONTACT_NUMBER_LABEL = By.xpath("/html/body/div/div/div[2]/div[4]/div/div[2]/div[2]/div/div/label");
    private static final By ORDER_NUMBER_INSTRUCTION = By.xpath("/html/body/div/div/div[2]/div[4]/div/div[2]/div[1]/div/div/div[2]/label");


    public String getTrackOrderLabelText(){
        return MainFunctions.getTextByElement(TRACK_ORDER_LABEL);
    }

    public void clickOnSubmit(){
        MainFunctions.clickOnUIElement(SUBMIT_BUTTON);
    }

    public String getError1(){
        return MainFunctions.getTextByElement(ERROR_1);
    }

    public String getError2(){
        return MainFunctions.getTextByElement(ERROR_2);
    }

    public void enterOrderNumber(String orderNumber){
        MainFunctions.sendKeys(ORDER_NUMBER_FIELD, orderNumber);
    }

    public void enterContactNumber(String contactNumber){
        MainFunctions.sendKeys(CONTACT_NUMBER_FIELD, contactNumber);
    }

    public String getInvalidOrderErrorPopupText(){
        return MainFunctions.getTextByElement(INVALID_ORDER_ERROR_POPUP);
    }

    public String getInstructionText(){
        return MainFunctions.getTextByElement(INSTRUCTIONS);
    }

    public String getOrderNumberLabelText(){
        return MainFunctions.getTextByElement(ORDER_NUMBER_LABEL);
    }

    public String getIContactNumberLabelText(){
        return MainFunctions.getTextByElement(CONTACT_NUMBER_LABEL);
    }

    public String getOrderNumberInstructionText(){
        return MainFunctions.getTextByElement(ORDER_NUMBER_INSTRUCTION);
    }

    public boolean isKeellsLogoDisplayed(){
        return MainFunctions.isElementDisplayed(KEELLS_LOGO);
    }

    public String getSubmitButtonText(){
        return MainFunctions.getTextByElement(SUBMIT_BUTTON);
    }

    public boolean isOrderNumberFieldDisplayed(){
        return MainFunctions.isElementDisplayed(ORDER_NUMBER_FIELD);
    }

    public boolean isContactNumberFieldDisplayed(){
        return MainFunctions.isElementDisplayed(CONTACT_NUMBER_FIELD);
    }

}
