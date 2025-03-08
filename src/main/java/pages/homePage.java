package pages;

import functions.MainFunctions;
import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homePage {

    private static final By HELLO_POPUP = By.xpath("/html/body/div[3]/div/div/div/div");
    private static final By HELLO_POPUP_CLOSE_BUTTON = By.xpath("/html/body/div[3]/div/div/div/div/div[1]");

    //--header
    private static final By TRACK_MY_ORDER = By.xpath("/html/body/div/div/div[1]/div[1]/div/div/div/div/div[1]/div");
    private static final By STORE_LOCATION = By.xpath("/html/body/div/div/div[1]/div[1]/div/div/div/div/div[2]");
    private static final By SHIPPING_METHOD = By.xpath("/html/body/div/div/div[1]/div[1]/div/div/div/div/div[3]");
    private static final By SIGNUP_LOGIN = By.xpath("/html/body/div/div/div[1]/div[1]/div/div/div/div/div[4]");
    private static final By KEELLS_LOGO = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[1]/a/img");
    private static final By HOME = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[1]");
    private static final By KEELLS_PRODUCTS = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[2]");
    private static final By KEELLS_EXCLUSIVES = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[3]");
    private static final By ALL_PROMOTIONS = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[4]");
    private static final By UTILITY_BILL_PAYMENT = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[5]");
    private static final By COMMUNITY = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[6]");
    private static final By CART = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[8]");

    private static final By NEXUS_DEALS = By.cssSelector("#root > div > div.main-content-holder > div > div.all-container > div > div.switcher > div > div.switcher-control-nexus.switcher-control-active");
    private static final By KEELS_DEALS_INACTIVE = By.cssSelector("#root > div > div.main-content-holder > div > div.all-container > div > div.switcher > div > div.switcher-control-keells");
    private static final By KEELLS_DEALS = By.cssSelector("#root > div > div.main-content-holder > div > div.all-container > div > div.switcher > div > div.switcher-control-keells.switcher-control-active");
    private static final By NEXUS_DEALS_INACTIVE = By.cssSelector("#root > div > div.main-content-holder > div > div.all-container > div > div.switcher > div > div.switcher-control-nexus");
    private static final By VIEW_ALL_NEXUS_DEALS = By.cssSelector("#deals_view_all_nexus_btn");
    private static final By VIEW_ALL_KEELLS_DEALS = By.cssSelector("#deals_view_all_keells_btn");
    private static final By BEST_SELLERS = By.cssSelector("#root > div > div.main-content-holder > div > div:nth-child(6) > div > div > div.section-title-text > span");
    private static final By FEATURED_PRODUCTS = By.cssSelector("#root > div > div.main-content-holder > div > div:nth-child(8) > div > div > div.section-title-text > span");
    private static final By SHOP_BY_CATEGORIES = By.cssSelector("#root > div > div.main-content-holder > div > div:nth-child(10) > div > div > div.section-title-text > span");

    private static final By CATEGORIES_LABEL = By.cssSelector("#root > div > div.default-header-container > div.default-header-navbar > div:nth-child(2) > div > div > div.product-search > div.category_menu_btn_product_search");
    private static final By CATEGORIES_DROPDOWN = By.cssSelector("#category_menu_default_header > div > ul");
    private static final String CATEGORY_LABEL_SELECTOR_1 = "#dep_id_";
    private static final String SUB_CATEGROY_LABEL_SELECTOR_1 = "#sub_dep_id_";
    private static final String SUB_CATEGROY_LABEL_SELECTOR_2 = " > a:nth-child(";
    private static final String SUB_CATEGROY_LABEL_SELECTOR_3 = ") > li";
    private static final By CATEGORY_DROPDOWN_CLOSE = By.cssSelector("#category_menu_default_header > img");

    //private static final String

    //#sub_dep_id_3 > a:nth-child(2) > li
    //#sub_dep_id_3 > a:nth-child(1) > li > strong

    public boolean isHelloPopupPresent() {
        return MainFunctions.isElementDisplayed(HELLO_POPUP);
    }

    public boolean isCloseButtonPresent() {
        return MainFunctions.isElementDisplayed(HELLO_POPUP_CLOSE_BUTTON);
    }

    public String getHelloPopupCloseButtonText() {
        return MainFunctions.getTextByElement(HELLO_POPUP_CLOSE_BUTTON);
    }

    public void clickOnHelloPopupCloseButton() {
        MainFunctions.clickOnUIElement(HELLO_POPUP_CLOSE_BUTTON);
    }

    //--header
    public boolean isKeellsLogoDisplayed(){
        return MainFunctions.isElementDisplayed(KEELLS_LOGO);
    }

    public String getTrackMyOrderText() {
        return MainFunctions.getTextByElement(TRACK_MY_ORDER);
    }

    public String getStoreLocationText() {
        return MainFunctions.getTextByElement(STORE_LOCATION);
    }

    public String getShippingMethodText() {
        return MainFunctions.getTextByElement(SHIPPING_METHOD);
    }

    public String getSignupLoginText() {
        return MainFunctions.getTextByElement(SIGNUP_LOGIN);
    }

    public String getHomeText() {
        return MainFunctions.getTextByElement(HOME);
    }

    public String getKeellsProductsText() {
        return MainFunctions.getTextByElement(KEELLS_PRODUCTS);
    }

    public String getKeellsExclusivesText() {
        return MainFunctions.getTextByElement(KEELLS_EXCLUSIVES);
    }

    public String getAllPromotionsText() {
        return MainFunctions.getTextByElement(ALL_PROMOTIONS);
    }

    public String getUtilityBillPaymentText() {
        return MainFunctions.getTextByElement(UTILITY_BILL_PAYMENT);
    }

    public String getCommunityText() {
        return MainFunctions.getTextByElement(COMMUNITY);
    }

    public String getCartText() {
        return MainFunctions.getTextByElement(CART);
    }

    public void clickOnTrackMyOrder(){
        MainFunctions.clickOnUIElement(TRACK_MY_ORDER);
    }

    public void clickOnStoreLocation(){
        MainFunctions.clickOnUIElement(STORE_LOCATION);
    }

    public void clickOnShippingMethod(){
        MainFunctions.clickOnUIElement(STORE_LOCATION);
    }

    public void clickOnLogin(){
        MainFunctions.clickOnUIElement(SIGNUP_LOGIN);
    }

    public void clickOnPromotions(){
        MainFunctions.clickOnUIElement(ALL_PROMOTIONS);
    }

    public String getNexusDealsText(){
        return MainFunctions.getTextByElement(NEXUS_DEALS);
    }

    public String getKeellsDealsText(){
        return MainFunctions.getTextByElement(KEELLS_DEALS);
    }

    public String getNexusDealsInactiveText(){
        return MainFunctions.getTextByElement(NEXUS_DEALS_INACTIVE);
    }

    public String getKeellsDealsInactiveText(){
        return MainFunctions.getTextByElement(KEELS_DEALS_INACTIVE);
    }

    public String getShopByCategoryText(){
        return MainFunctions.getTextByElement(SHOP_BY_CATEGORIES);
    }

    public String getFeaturedProductsText(){
        return MainFunctions.getTextByElement(FEATURED_PRODUCTS);
    }

    public String getBestSellersText(){
        return MainFunctions.getTextByElement(BEST_SELLERS);
    }

    public String getViewAllNexusDealsText(){
        return MainFunctions.getTextByElement(VIEW_ALL_NEXUS_DEALS);
    }

    public String getViewAllKeellsDealsText(){
        return MainFunctions.getTextByElement(VIEW_ALL_KEELLS_DEALS);
    }

    public void clickNexusDeals(){
        MainFunctions.clickOnUIElement(NEXUS_DEALS_INACTIVE);
    }

    public void clickKeellsDeals(){
        MainFunctions.clickOnUIElement(KEELS_DEALS_INACTIVE);
    }

    public void clickAllNexusDeals(){
        MainFunctions.clickOnUIElement(VIEW_ALL_NEXUS_DEALS);
    }

    public void clickAllKeellsDeals(){
        MainFunctions.clickOnUIElement(VIEW_ALL_KEELLS_DEALS);
    }

    public void clickOnCategories(){
        MainFunctions.clickOnUIElement(CATEGORIES_LABEL);
    }

    public String getCategoriesText(){
        return MainFunctions.getTextByElement(CATEGORIES_LABEL);
    }

    public String getCategoriesLabel(int departmentNo){
        return MainFunctions.getTextByElement(By.cssSelector(CATEGORY_LABEL_SELECTOR_1+departmentNo));
    }

    public void clickOnCategoryLabel(int departmentNo){
        MainFunctions.clickOnUIElement(By.cssSelector(CATEGORY_LABEL_SELECTOR_1+departmentNo));
    }

    public boolean isCategoriesDropDownPresent(){
        return MainFunctions.isElementDisplayed(CATEGORIES_DROPDOWN);
    }

    public void clickCloseOnCategoryDropdown(){
        MainFunctions.clickOnUIElement(CATEGORY_DROPDOWN_CLOSE);
    }
}
