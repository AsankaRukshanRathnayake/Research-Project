package com.keells;

import Constants.LabelConstants;
import functions.MainFunctions;
import functions.homeFunctions;
import functions.promotionFunctions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static functions.MainFunctions.driver1;

public class PromotionsTest {
    @BeforeMethod
    public void setup(){
        MainFunctions.setup();
        driver1.get("https://www.keellssuper.com/");
        homeFunctions.closeHelloPopup();
        homeFunctions.clickOnPromotions();
    }

    @AfterMethod
    public void close(){
        driver1.close();
        driver1.quit();
    }

    @Test(description = "RPKE-TC-200 - Verify Promotions Page is loading")
    public void verifyPromotionsPageIsLoading(){
        Assert.assertEquals(promotionFunctions.getNexusDealsTitleText(), LabelConstants.NEXUS_DEALS);
        Assert.assertEquals(promotionFunctions.getKeellsDealsTitleText(), LabelConstants.KEELLS_DEALS);
    }

    @Test(description = "RPKE-TC-200 - Verify Content of the Promotions Page")
    public void verifyPromotionsPageContent(){
        Assert.assertEquals(promotionFunctions.getNexusDealsTitleText(), LabelConstants.NEXUS_DEALS);
        Assert.assertEquals(promotionFunctions.getKeellsDealsTitleText(), LabelConstants.KEELLS_DEALS);
        Assert.assertEquals(promotionFunctions.getAllNexusDealsButtonText(), LabelConstants.VIEW_ALL_NEXUS_DEALS);
        Assert.assertEquals(promotionFunctions.getAllKeellsDealsButtonText(), LabelConstants.VIEW_ALL_KEELLS_DEALS);
    }

    @Test(description = "RPKE-TC-200 - Verify All Keells Deals Button")
    public void verifyAllKeellsDealsButton(){
        Assert.assertEquals(promotionFunctions.getAllNexusDealsButtonText(), LabelConstants.VIEW_ALL_NEXUS_DEALS);
        promotionFunctions.clickAllNexusDealsButton();
        Assert.assertEquals(promotionFunctions.getDealsTitle2(), LabelConstants.NEXUS_DEALS);
    }

    @Test(description = "RPKE-TC-200 - Verify All Nexus Deals Button")
    public void verifyAllNexusDealsButton(){
        Assert.assertEquals(promotionFunctions.getAllKeellsDealsButtonText(), LabelConstants.VIEW_ALL_KEELLS_DEALS);
        promotionFunctions.clickAllKeellsDealsButton();
        Assert.assertEquals(promotionFunctions.getDealsTitle2(), LabelConstants.KEELLS_DEALS);
    }
}
