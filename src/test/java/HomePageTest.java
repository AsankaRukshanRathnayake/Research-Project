import Constants.LabelConstants;
import functions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

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



}
