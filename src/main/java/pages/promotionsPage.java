package pages;

import functions.MainFunctions;
import org.example.Main;
import org.openqa.selenium.By;

public class promotionsPage {
    private static final By NEXUS_DEALS_TITLE = By.xpath("/html/body/div/div/div[2]/div[3]/div[2]/div/div/div");
    private static final By KEELLS_DEALS_TITLE = By.xpath("/html/body/div/div/div[2]/div[3]/div[4]/div/div/div");
    private static final By ALL_NEXUS_DEALS = By.xpath("/html/body/div/div/div[2]/div[3]/div[3]/div/div/div/div[2]/div/div/button");
    private static final By ALL_KEELLS_DEALS = By.xpath("/html/body/div/div/div[2]/div[3]/div[5]/div/div/div/div[2]/div/div/button");

    private static final By DEALS_TITLE_2 = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/div/span");

    public String getNexusDealsTitleText(){
        return MainFunctions.getTextByElement(NEXUS_DEALS_TITLE);
    }

    public String getKeellsDealsTitleText(){
        return MainFunctions.getTextByElement(KEELLS_DEALS_TITLE);
    }

    public String getAllNexusDealsButtonText(){
        return MainFunctions.getTextByElement(ALL_NEXUS_DEALS);
    }

    public String getAllKeellsDealsButtonText(){
        return MainFunctions.getTextByElement(ALL_KEELLS_DEALS);
    }

    public void clickAllNexusDealsButton(){
        MainFunctions.clickOnUIElement(ALL_NEXUS_DEALS);
    }

    public void clickAllKeellsDealsButton(){
        MainFunctions.clickOnUIElement(ALL_KEELLS_DEALS);
    }

    public String getDealsTitle2(){
        return MainFunctions.getTextByElement(DEALS_TITLE_2);
    }
}
