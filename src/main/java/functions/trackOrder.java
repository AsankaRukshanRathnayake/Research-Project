package functions;

import pages.trackOrderPage;

public class trackOrder {
    private static trackOrderPage trackOrderPage = new trackOrderPage();

    public static String getTrackOrderLabelText(){
        return trackOrderPage.getTrackOrderLabelText();
    }

    public static void clickOnSubmit(){
        trackOrderPage.clickOnSubmit();
    }

    public static String getError1(){
        return trackOrderPage.getError1();
    }

    public static String getError2(){
        return trackOrderPage.getError2();
    }

    public static void enterOrderNumber(String orderNumber){
        trackOrderPage.enterOrderNumber(orderNumber);
    }

    public static void enterContactNumber(String contactNumber){
        trackOrderPage.enterContactNumber(contactNumber);
    }

    public static String getInvalidOrderErrorPopupText(){
        return trackOrderPage.getInvalidOrderErrorPopupText();
    }

    public static String getInstructionText(){
        return trackOrderPage.getInstructionText();
    }

    public static String getOrderNumberLabelText(){
        return trackOrderPage.getOrderNumberLabelText();
    }

    public static String getContactNumberLabelText(){
        return trackOrderPage.getIContactNumberLabelText();
    }

    public static String getOrderNumberInstructionText(){
        return trackOrderPage.getOrderNumberInstructionText();
    }

    public static boolean isKeellsLogoDisplayed(){
        return trackOrderPage.isKeellsLogoDisplayed();
    }

    public static String getSubmitButtonText(){
        return trackOrderPage.getSubmitButtonText();
    }

    public static boolean isOrderNumberFieldDisplayed(){
        return trackOrderPage.isOrderNumberFieldDisplayed();
    }

    public static boolean isContactNumberFieldDisplayed(){
        return trackOrderPage.isContactNumberFieldDisplayed();
    }
}
