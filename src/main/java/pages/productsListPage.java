package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class productsListPage {
    private final By SelectLocationButton = By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/button");
    private final By SelectCategoryButton = By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[2]/div[1]/div/div/div[2]/div[2]/div/div[2]/button");
    private final By SelectLocationMenuHeader = By.xpath("/html/body/div[4]/div/div/div/div[2]/div/div/div/h4");
    private final By SelectLocationMenuCloseButton = By.xpath("/html/body/div[4]/div/div/div/div[1]/button");
    private final By AllOfSriLankaButton = By.xpath("/html/body/div[5]/div/div/div/div[2]/div/div/div/div[1]/li/button");
    private final By Districts = By.xpath("/html/body/div[5]/div/div/div/div[2]/div/div/div/div[2]/div/div");
    private String DistrictListDistrictPath1 = "/html/body/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/ul/li[";
    private String DistrictListDistrictPath2 = "]/button/div/div[1]";
    private final By SelectCategoryMenuHeader = By.xpath("//html/body/div[4]/div/div/div/div[2]/div/div/div/div");
    private final By SelectCategoryMenuCloseButton = By.xpath("/html/body/div[4]/div/div/div/div[1]/button");
    //private final By AllOfSriLankaButton = By.xpath("/html/body/div[5]/div/div/div/div[2]/div/div/div/div[1]/li/button");
    private final By Cateogories = By.xpath("/html/body/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div");
    private String CategoryListCategoryPath1 = "/html/body/div[4]/div/div/div/div[2]/div/div/div/ul/li[";
    private String CategoryListCategoryPath2 = "]/button/div/div[1]";


    private void clickOnUIElement(WebDriver driver, By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
    }

    private String getTextByElement(WebDriver driver, By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by).getText();
    }

    public String getSelectLocationButtonText(WebDriver driver){
        return getTextByElement(driver, SelectLocationButton);
    }

    public String getSelectCategoryButtonText(WebDriver driver){
        return getTextByElement(driver, SelectCategoryButton);
    }

    public void clickSelectLocationButton(WebDriver driver){
        clickOnUIElement(driver, SelectLocationButton);
    }

    public void clickSelectCategoryButton(WebDriver driver){
        clickOnUIElement(driver, SelectCategoryButton);
    }

    public String getSelectLocationMenuHeaderText(WebDriver driver){
        return getTextByElement(driver, SelectLocationMenuHeader);
    }

//    public String getSelectCategoryMenuHeaderText(WebDriver driver){
//        return getTextByElement(driver, SelectCategoryMenuHeader);
//    }

    public void clickLocationListClose(WebDriver driver){
        clickOnUIElement(driver, SelectLocationMenuCloseButton);
    }

    public String getLocationListDistricts(WebDriver driver, int number){
        return getTextByElement(driver, By.xpath(DistrictListDistrictPath1+number+DistrictListDistrictPath2));
    }

    public String getAllOfSriLankaButtonText(WebDriver driver){
        return getTextByElement(driver, AllOfSriLankaButton);
    }

    public String getDistrictsLabelText(WebDriver driver){
        return getTextByElement(driver, Districts);
    }



    public String getSelectCategoryMenuHeaderText(WebDriver driver){
        return getTextByElement(driver, SelectCategoryMenuHeader);
    }

    public void clickCategoryListClose(WebDriver driver){
        clickOnUIElement(driver, SelectCategoryMenuCloseButton);
    }

    public String getCategoryListCategories(WebDriver driver, int number){
        return getTextByElement(driver, By.xpath(CategoryListCategoryPath1+number+CategoryListCategoryPath2));
    }


}
