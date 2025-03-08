package com.keells;

import Constants.LabelConstants;
import Constants.ListConstants;
import functions.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static functions.MainFunctions.driver1;

public class HomePageTest {

    @BeforeMethod
    public void setup(){
        MainFunctions.setup();
        driver1.get("https://www.keellssuper.com/");
    }

    @AfterMethod
    public void close(){
        driver1.close();
        driver1.quit();
    }

    @Test(description = "RPKE-TC-01 - Verify Hello popup is loaded", alwaysRun = true)
    public void verifyHelloPopupIsDisplayed(){
        Assert.assertTrue(homeFunctions.isHHelloPopupDisplayed());
    }

    @Test(description = "RPKE-TC-02 - Verify Hello popup Close Button is present", alwaysRun = true)
    public void verifyHelloPopupCloseButtonIsDisplayed(){
        Assert.assertTrue(homeFunctions.isHelloPopupCloseButtonDisplayed());
        Assert.assertEquals(homeFunctions.getHelloPopupCloseButtonText(), "X");
    }

    @Test(description = "RPKE-TC-03 - Verify Hello popup Close Button is working", alwaysRun = true)
    public void verifyHelloPopupCloseButtonWorking(){
        homeFunctions.closeHelloPopup();
    }

    @Test(description = "RPKE-TC-04 - Verify content of the header", alwaysRun = true)
    public void verifyHeaderContent(){
        homeFunctions.closeHelloPopup();
        Assert.assertTrue(homeFunctions.isKeellsLogoDisplayed());
        Assert.assertEquals(homeFunctions.getTrackMyOrderText(), LabelConstants.TRACK_MY_ORDER);
        Assert.assertEquals(homeFunctions.getStoreLocationText(), LabelConstants.STORE_LOCATION+"\n"+LabelConstants.DARLEY_ROAD);
        Assert.assertEquals(homeFunctions.getShippingMethodText(), LabelConstants.SHIPPING_METHOD+"\n"+LabelConstants.DELIVERY);
        Assert.assertEquals(homeFunctions.getSignupLoginText(), LabelConstants.SIGNUP_LOGIN);
        Assert.assertEquals(homeFunctions.getHomeText(), LabelConstants.HOME);
        Assert.assertEquals(homeFunctions.getKeellsProductsText(), LabelConstants.KEELLS_PRODUCTS);
        Assert.assertEquals(homeFunctions.getKeellsExclusivesText(), LabelConstants.KEELLS_EXCLUSIVES);
        Assert.assertEquals(homeFunctions.getAllPromotionsText(), LabelConstants.ALL_PROMOTIONS);
        Assert.assertEquals(homeFunctions.getUtilityBillPaymentText(), LabelConstants.UTILITY_BILL_PAYMENT);
        Assert.assertEquals(homeFunctions.getCommunityText(), LabelConstants.COMMUNITY);
        Assert.assertEquals(homeFunctions.getCartText(), LabelConstants.ZERO+"\n"+LabelConstants.ZERO_RUPEES);
    }

    @Test(description = "RPKE-TC-19 - verify topic labels in home page", alwaysRun = true)
    public void verifyHeaderLabels(){
        homeFunctions.closeHelloPopup();
        Assert.assertEquals(homeFunctions.getNexusDealsText(), LabelConstants.NEXUS_DEALS);
        Assert.assertEquals(homeFunctions.getViewAllNexusDealsText(), LabelConstants.VIEW_ALL_NEXUS_DEALS);
        Assert.assertEquals(homeFunctions.getKeellsDealsInactiveText(), LabelConstants.KEELLS_DEALS);
        homeFunctions.clickKeellsDeals();
        Assert.assertEquals(homeFunctions.getViewAllKeellsDealsText(), LabelConstants.VIEW_ALL_KEELLS_DEALS);
        Assert.assertEquals(homeFunctions.getBestSellersText(), LabelConstants.BEST_SELLERS);
        Assert.assertEquals(homeFunctions.getFeaturedProductsText(), LabelConstants.FEATURED_PRODUCTS);
        Assert.assertEquals(homeFunctions.getShopByCategoryText(), LabelConstants.SHOP_BY_CATEGORY);
    }

    @Test(description = "RPKE-TC-20 - verify click on Keells Deals change the view all promotions button", alwaysRun = true)
    public void verifyAllPromotionsButtonWhenKeellsDealsIsClicked(){
        homeFunctions.closeHelloPopup();
        Assert.assertEquals(homeFunctions.getViewAllNexusDealsText(), LabelConstants.VIEW_ALL_NEXUS_DEALS);
        homeFunctions.clickKeellsDeals();
        Assert.assertEquals(homeFunctions.getViewAllKeellsDealsText(), LabelConstants.VIEW_ALL_KEELLS_DEALS);
    }

    @Test(description = "RPKE-TC-21 - verify click on Nexus Deals change the view all promotions button", alwaysRun = true)
    public void verifyAllPromotionsButtonWhenNexusDealsIsClicked(){
        homeFunctions.closeHelloPopup();
        Assert.assertEquals(homeFunctions.getViewAllNexusDealsText(), LabelConstants.VIEW_ALL_NEXUS_DEALS);
        homeFunctions.clickKeellsDeals();
        Assert.assertEquals(homeFunctions.getViewAllKeellsDealsText(), LabelConstants.VIEW_ALL_KEELLS_DEALS);
        homeFunctions.clickNexusDeals();
        Assert.assertEquals(homeFunctions.getViewAllNexusDealsText(), LabelConstants.VIEW_ALL_NEXUS_DEALS);
    }

    @Test(description = "RPKE-TC-22 - verify view all keells deals button", alwaysRun = true)
    public void verifyViewAllKeellsDeals(){
        homeFunctions.closeHelloPopup();
        homeFunctions.clickKeellsDeals();
        Assert.assertEquals(homeFunctions.getViewAllKeellsDealsText(), LabelConstants.VIEW_ALL_KEELLS_DEALS);
        homeFunctions.clickAllKeellsDeals();
        Assert.assertEquals(promotionFunctions.getDealsTitle2(), LabelConstants.KEELLS_DEALS);
    }

    @Test(description = "RPKE-TC-23 - verify view all nexus deals button", alwaysRun = true)
    public void verifyViewAllNexusDeals(){
        homeFunctions.closeHelloPopup();
        Assert.assertEquals(homeFunctions.getViewAllNexusDealsText(), LabelConstants.VIEW_ALL_NEXUS_DEALS);
        homeFunctions.clickAllNexusDeals();
        Assert.assertEquals(promotionFunctions.getDealsTitle2(), LabelConstants.NEXUS_DEALS);
    }

    @Test(description = "RPKE-TC-24 - Verify Categories drop down is loading", alwaysRun = true)
    public void verifyCategoriesDropDownIsLoading(){
        homeFunctions.closeHelloPopup();
        Assert.assertEquals(homeFunctions.getCategoriesText(), LabelConstants.CATEGORIES);
        homeFunctions.viewCategoriesDropdown();
        Assert.assertTrue(homeFunctions.isCategoriesDropdownDisplayed());
    }

    @Test(description = "RPKE-TC-24 - Verify Categories drop down content", alwaysRun = true)
    public void verifyCategoriesDropDownContent(){
        homeFunctions.closeHelloPopup();
        homeFunctions.viewCategoriesDropdown();
        Assert.assertEquals(homeFunctions.getCategoriesLabel(16), ListConstants.VEGETABLES);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(6), ListConstants.FRUITS);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(12), ListConstants.MEAT);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(4), ListConstants.SEAFOOD);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(2), ListConstants.BEVERAGES);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(3), ListConstants.CHILLED);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(5), ListConstants.FROZEN_FOOD);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(7), ListConstants.GROCERY);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(9), ListConstants.HOUSEHOLD);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(10), ListConstants.MOBILE_AND_ACCESSORIES);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(13), ListConstants.HAMPERS_AND_VOUCHERS);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(15), ListConstants.PREPARED_FOOD);
        Assert.assertEquals(homeFunctions.getCategoriesLabel(20), ListConstants.ELECTRONIC_DEVICES);
    }

    @Test(description = "RPKE-TC-24 - Verify Categories drop down close", alwaysRun = true)
    public void verifyCloseCategoriesDropDownClose(){
        homeFunctions.closeHelloPopup();
        homeFunctions.viewCategoriesDropdown();
        Assert.assertTrue(homeFunctions.isCategoriesDropdownDisplayed());
        homeFunctions.closeCategoryDropdown();
        Assert.assertFalse(homeFunctions.isCategoriesDropdownDisplayed());
    }

    @Test(description = "RPKE-TC-24 - Verify select All Vegetables", alwaysRun = true)
    public void verifySelectAllVegetables(){
        homeFunctions.closeHelloPopup();
        homeFunctions.viewCategoriesDropdown();
        homeFunctions.clickOnCategoriesName(16);

    }

    @Test(description = "RPKE-TC-24 - Verify select Fresh Vegetables", alwaysRun = true)
    public void verifySelectFreshVegetables(){

    }



}
