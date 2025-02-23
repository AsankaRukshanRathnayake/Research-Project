package functions;

import pages.storeLocationPage;

public class storeLocationFunctions {
    private static storeLocationPage storeLocationPage = new storeLocationPage();

    public static boolean isStoreLocationPopupDisplayed(){
        return storeLocationPage.isStoreLocationPopupDisplayed();
    }

    public static String getDeliveryTabText(){
        return storeLocationPage.getDeliveryTabText();
    }

    public static String getPickupTabText(){
        return storeLocationPage.getPickupTabText();
    }

    public static String getChangeButtonText(){
        return storeLocationPage.getChangeButtonText();
    }

    public static boolean isAddressFieldPresent(){
        return storeLocationPage.isAddressFieldPresent();
    }

    public static String getGuestLoginTitle(){
        return storeLocationPage.getGuestLoginTitleText();
    }

    public static boolean isCloseButtonDisplayed(){
        return storeLocationPage.isCloseButtonDisplayed();
    }

    public static void clickOnChange(){
        storeLocationPage.clickOnChange();
    }

    public static void clickOnPickup(){
        storeLocationPage.clickOnPickup();
    }

    public static String getOutletsFieldText(){
        return storeLocationPage.getOutletsFieldText();
    }

    public static void closePopup(){
        storeLocationPage.clickOnClose();
    }
}
