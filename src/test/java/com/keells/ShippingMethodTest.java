package com.keells;

import Constants.LabelConstants;
import functions.MainFunctions;
import functions.homeFunctions;
import functions.storeLocationFunctions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static functions.MainFunctions.driver1;

public class ShippingMethodTest {
    @BeforeMethod
    public void setup(){
        MainFunctions.setup();
        driver1.get("https://www.keellssuper.com/");
        homeFunctions.closeHelloPopup();
        homeFunctions.clickOnShippingMethod();
    }

    @AfterMethod
    public void close(){
        driver1.close();
        driver1.quit();
    }

    @Test(description = "RPKE-TC-114 - Verfiy Shipping Method Is Loading")
    public void verifyStoreLocationIsLoading(){
        Assert.assertTrue(storeLocationFunctions.isStoreLocationPopupDisplayed());
    }

    @Test(description = "RPKE-TC-115 - Verfiy contect of Shipping Method Popup")
    public void verfiyStoreLocationPopupContent() {
        Assert.assertEquals(storeLocationFunctions.getDeliveryTabText(), LabelConstants.DELIVERY);
        Assert.assertEquals(storeLocationFunctions.getPickupTabText(), LabelConstants.PICKUP);
        Assert.assertTrue(storeLocationFunctions.isAddressFieldPresent());
        Assert.assertEquals(storeLocationFunctions.getChangeButtonText(), LabelConstants.CHANGE);
        Assert.assertTrue(storeLocationFunctions.isCloseButtonDisplayed());
    }

    @Test(description = "RPKE-TC-116 - Verfiy Change button")
    public void verifyChangeButton(){
        Assert.assertEquals(storeLocationFunctions.getChangeButtonText(), LabelConstants.CHANGE);
        storeLocationFunctions.clickOnChange();
        Assert.assertEquals(storeLocationFunctions.getGuestLoginTitle(), LabelConstants.GUEST_LOGIN);
    }

    @Test(description = "RPKE-TC-117 - Verfiy Pickup")
    public void verifyPickup(){
        Assert.assertEquals(storeLocationFunctions.getPickupTabText(), LabelConstants.PICKUP);
        storeLocationFunctions.clickOnPickup();
        Assert.assertEquals(storeLocationFunctions.getOutletsFieldText(), LabelConstants.SELECT_OUTLETS);
        Assert.assertEquals(storeLocationFunctions.getDeliveryTabText(), LabelConstants.DELIVERY);
        Assert.assertEquals(storeLocationFunctions.getPickupTabText(), LabelConstants.PICKUP);
        Assert.assertTrue(storeLocationFunctions.isAddressFieldPresent());
        Assert.assertEquals(storeLocationFunctions.getChangeButtonText(), LabelConstants.CHANGE);
        Assert.assertTrue(storeLocationFunctions.isCloseButtonDisplayed());
    }

    @Test(description = "RPKE-TC-118 - Verfiy Store Location popup close")
    public void verifyStoreLocationPopupClose(){
        Assert.assertTrue(storeLocationFunctions.isCloseButtonDisplayed());
        storeLocationFunctions.closePopup();
    }

    @Test(description = "RPKE-TC-119 - Verfiy Store Location popup close after navigating to Pickup")
    public void verifyStoreLocationPopupCloseInPickup(){
        Assert.assertEquals(storeLocationFunctions.getPickupTabText(), LabelConstants.PICKUP);
        storeLocationFunctions.clickOnPickup();
        Assert.assertTrue(storeLocationFunctions.isCloseButtonDisplayed());
        storeLocationFunctions.closePopup();
    }
}
