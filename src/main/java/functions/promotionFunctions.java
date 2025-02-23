package functions;

import pages.promotionsPage;

public class promotionFunctions {
    private static promotionsPage promotionsPage = new promotionsPage();

    public static String getNexusDealsTitleText(){
        return promotionsPage.getNexusDealsTitleText();
    }

    public static String getKeellsDealsTitleText(){
        return promotionsPage.getKeellsDealsTitleText();
    }

    public static String getAllNexusDealsButtonText(){
        return promotionsPage.getAllNexusDealsButtonText();
    }

    public static String getAllKeellsDealsButtonText(){
        return promotionsPage.getAllKeellsDealsButtonText();
    }

    public static void clickAllNexusDealsButton(){
        promotionsPage.clickAllNexusDealsButton();
    }

    public static void clickAllKeellsDealsButton(){
        promotionsPage.clickAllKeellsDealsButton();
    }

    public static String getDealsTitle2(){
        return promotionsPage.getDealsTitle2();
    }
}
