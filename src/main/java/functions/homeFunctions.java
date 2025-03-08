package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.homePage;

public class homeFunctions {
    private static homePage homePage = new homePage();

    public static boolean isHHelloPopupDisplayed(){
        return homePage.isHelloPopupPresent();
    }

    public static boolean isHelloPopupCloseButtonDisplayed(){
        return homePage.isCloseButtonPresent();
    }

    public static String getHelloPopupCloseButtonText(){
        return homePage.getHelloPopupCloseButtonText();
    }

    public static void closeHelloPopup(){
        homePage.clickOnHelloPopupCloseButton();
    }

    //--header
    public static boolean isKeellsLogoDisplayed(){
        return homePage.isKeellsLogoDisplayed();
    }

    public static String getTrackMyOrderText() {
        return homePage.getTrackMyOrderText();
    }

    public static String getStoreLocationText() {
        return homePage.getStoreLocationText();
    }

    public static String getShippingMethodText() {
        return homePage.getShippingMethodText();
    }

    public static String getSignupLoginText() {
        return homePage.getSignupLoginText();
    }

    public static String getHomeText() {
        return homePage.getHomeText();
    }

    public static String getKeellsProductsText() {
        return homePage.getKeellsProductsText();
    }

    public static String getKeellsExclusivesText() {
        return homePage.getKeellsExclusivesText();
    }

    public static String getAllPromotionsText() {
        return homePage.getAllPromotionsText();
    }

    public static String getUtilityBillPaymentText() {
        return homePage.getUtilityBillPaymentText();
    }

    public static String getCommunityText() {
        return homePage.getCommunityText();
    }

    public static String getCartText() {
        return homePage.getCartText();
    }

    public static void clickOnTrackMyOrder(){
        homePage.clickOnTrackMyOrder();
    }

    public static void clickOnStoreLocation(){
        homePage.clickOnStoreLocation();
    }

    public static void clickOnShippingMethod(){
        homePage.clickOnShippingMethod();
    }

    public static void clickOnLogin(){
        homePage.clickOnLogin();
    }

    public static void clickOnPromotions(){
        homePage.clickOnPromotions();
    }

    public static String getNexusDealsText(){
        return homePage.getNexusDealsText();
    }

    public static String getKeellsDealsText(){
        return homePage.getKeellsDealsText();
    }

    public static String getNexusDealsInactiveText(){
        return homePage.getNexusDealsInactiveText();
    }

    public static String getKeellsDealsInactiveText(){
        return homePage.getKeellsDealsInactiveText();
    }

    public static String getShopByCategoryText(){
        return homePage.getShopByCategoryText();
    }

    public static String getFeaturedProductsText(){
        return homePage.getFeaturedProductsText();
    }

    public static String getBestSellersText(){
        return homePage.getBestSellersText();
    }

    public static String getViewAllNexusDealsText(){
        return homePage.getViewAllNexusDealsText();
    }

    public static String getViewAllKeellsDealsText(){
        return homePage.getViewAllKeellsDealsText();
    }

    public static void clickNexusDeals(){
        homePage.clickNexusDeals();
    }

    public static void clickKeellsDeals(){
        homePage.clickKeellsDeals();
    }

    public static void clickAllNexusDeals(){
        homePage.clickAllNexusDeals();
    }

    public static void clickAllKeellsDeals(){
        homePage.clickAllKeellsDeals();
    }

    public static String getCategoriesText(){
        return homePage.getCategoriesText();
    }

    public static void viewCategoriesDropdown(){
        homePage.clickOnCategories();
    }

    public static String getCategoriesLabel(int departmentNo){
        return homePage.getCategoriesLabel(departmentNo);
    }

    public static void clickOnCategoriesName(int departmentNo){
        homePage.clickOnCategoryLabel(departmentNo);
    }

    public static boolean isCategoriesDropdownDisplayed(){
        return homePage.isCategoriesDropDownPresent();
    }

    public static void closeCategoryDropdown(){
        homePage.clickCloseOnCategoryDropdown();
    }

}
