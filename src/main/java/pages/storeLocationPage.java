package pages;

import functions.MainFunctions;
import org.example.Main;
import org.openqa.selenium.By;

public class storeLocationPage {
    private static final By STORE_LOCATION_POPUP =By.xpath("/html/body/div[3]/div/div/div/div");
    private static final By DELIVERY_TAB = By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/div/button[1]");
    private static final By PICKUP_TAB = By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/div/button[2]");
    private static final By CHANGE_BUTTON = By.xpath("/html/body/div[3]/div/div/div/div/div[6]/div/button");
    private static final By ADDRESS_FIELD = By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div/div");
    private static final By OUTLETS_FIELD = By.xpath("/html/body/div[3]/div/div/div/div/div[3]/div/div/div/div[1]/div[1]");
    private static final By CLOSE_BUTTON = By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div/div");
    private static final By GUEST_LOGIN_TITLE = By.xpath("/html/body/div[3]/div/div/div/div[1]/div/h5");

    public boolean isStoreLocationPopupDisplayed(){
        return MainFunctions.isElementDisplayed(STORE_LOCATION_POPUP);
    }

    public String getDeliveryTabText(){
        return MainFunctions.getTextByElement(DELIVERY_TAB);
    }

    public String getPickupTabText(){
        return MainFunctions.getTextByElement(PICKUP_TAB);
    }

    public String getChangeButtonText(){
        return MainFunctions.getTextByElement(CHANGE_BUTTON);
    }

    public boolean isAddressFieldPresent(){
        return MainFunctions.isElementDisplayed(ADDRESS_FIELD);
    }

    public boolean isCloseButtonDisplayed(){
        return MainFunctions.isElementDisplayed(CLOSE_BUTTON);
    }

    public void clickOnChange(){
        MainFunctions.clickOnUIElement(CHANGE_BUTTON);
    }

    public String getGuestLoginTitleText(){
        return MainFunctions.getTextByElement(GUEST_LOGIN_TITLE);
    }

    public void clickOnPickup(){
        MainFunctions.clickOnUIElement(PICKUP_TAB);
    }

    public String getOutletsFieldText(){
        return MainFunctions.getTextByElement(OUTLETS_FIELD);
    }

    public void clickOnClose(){
        MainFunctions.clickOnUIElement(CLOSE_BUTTON);
    }
}
