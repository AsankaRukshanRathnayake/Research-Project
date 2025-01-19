package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homePage {

    public static final By ALL_OF_SRI_LANKA_BUTTON =By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div/button");

    public static final By ELECTRONICS_TEXT = By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[1]/a/div[2]/p");
    public static final By PROPERTY_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[2]/a/div[2]/p"));
    public static final By VEHICLES_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[3]/a/div[2]/p"));
    public static final By HOME_AND_GARDEN_TEXT   = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[4]/a/div[2]/p"));
    public static final By SERVICES_TEXT = By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[5]/a/div[2]/p");
    public static final By BUSINESS_AND_INDUSTRY_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[6]/a/div[2]/p"));
    public static final By JOBS_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[7]/a/div[2]/p"));
    public static final By HOBBY_SPORT_AND_HOBBY_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[8]/a/div[2]/p"));
    public static final By ANIMALS_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[9]/a/div[2]/p"));
    public static final By FASHION_AND_BEAUTY_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[10]/a/div[2]/p"));
    public static final By EDUCATION_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[11]/a/div[2]/p"));
    public static final By OTHER_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[12]/a/div[2]/p"));
    public static final By ESSENTIALS_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[13]/a/div[2]/p"));
    public static final By AGRICULTURE_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[14]/a/div[2]/p"));
    public static final By WORK_OVERSEAS_TEXT    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[15]/a/div[2]/p"));
    public static final By BROWSE_BY_CATEGORY = By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[4]/div/h2");
    public static final By ELECTRONICS_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[1]/a");
    public static final By PROPERTY_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[2]/a");
    public static final By VEHICLES_BUTTON   = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[3]/a"));
    public static final By HOME_AND_GARDEN_BUTTON   = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[4]/a"));
    public static final By SERVICES_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[5]/a");
    public static final By BUSINESS_AND_INDUSTRY_BUTTON    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[6]/a"));
    public static final By JOBS_BUTTON    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[7]/a"));
    public static final By HOBBY_SPORT_AND_HOBBY_BUTTON   = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[8]/a"));
    public static final By ANIMALS_BUTTON   = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[9]/a"));
    public static final By FASHION_AND_BEAUTY_BUTTON    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[10]/a"));
    public static final By EDUCATION_BUTTON    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[11]/a"));
    public static final By OTHER_BUTTON    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[12]/a"));
    public static final By ESSENTIALS_BUTTON    = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[13]/a"));
    public static final By AGRICULTURE_BUTTON   = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[14]/a"));
    public static final By WORK_OVERSEAS_BUTTON   = By.xpath(("/html/body/div[1]/div/div[1]/div[3]/div[4]/ul/li[15]/a"));
    public static final By MAIN_LOGO = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/nav/div/ul[1]/li[1]/div/a");
    public static final By ALL_ADDS_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/nav/div/ul[1]/li[2]/a");
    public static final By ALL_ADDS_BUTTON_2 = By.xpath("/html/body/div[2]/div/div[1]/div[2]/nav/div/ul[1]/li[2]/a");

    public String getAllOfSriLankaButtonText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ALL_OF_SRI_LANKA_BUTTON));
        WebElement button = driver.findElement(ALL_OF_SRI_LANKA_BUTTON);
        return button.getText();
    }
    public String getElectronicsLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ELECTRONICS_TEXT));
        WebElement text = driver.findElement(ELECTRONICS_TEXT);
        return text.getText();
    }
    public String getPropertyLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PROPERTY_TEXT));
        WebElement text = driver.findElement(PROPERTY_TEXT);
        return text.getText();
    }
    public String getVehiclesLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(VEHICLES_TEXT));
        WebElement text = driver.findElement(VEHICLES_TEXT);
        return text.getText();
    }
    public String getHomeAndGardenLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(HOME_AND_GARDEN_TEXT));
        WebElement text = driver.findElement(HOME_AND_GARDEN_TEXT);
        return text.getText();
    }
    public String getServicesLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SERVICES_TEXT));
        WebElement text = driver.findElement(SERVICES_TEXT);
        return text.getText();
    }
    public String getBusinessAndIndustryLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(BUSINESS_AND_INDUSTRY_TEXT));
        WebElement text = driver.findElement(BUSINESS_AND_INDUSTRY_TEXT);
        return text.getText();
    }
    public String getJobsLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(JOBS_TEXT));
        WebElement text = driver.findElement(JOBS_TEXT);
        return text.getText();
    }
    public String getHobbyLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(HOBBY_SPORT_AND_HOBBY_TEXT));
        WebElement text = driver.findElement(HOBBY_SPORT_AND_HOBBY_TEXT);
        return text.getText();
    }
    public String getAnimalsLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ANIMALS_TEXT));
        WebElement text = driver.findElement(ANIMALS_TEXT);
        return text.getText();
    }
    public String getFashionAndBeautyLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(FASHION_AND_BEAUTY_TEXT));
        WebElement text = driver.findElement(FASHION_AND_BEAUTY_TEXT);
        return text.getText();
    }
    public String getEducationLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EDUCATION_TEXT));
        WebElement text = driver.findElement(EDUCATION_TEXT);
        return text.getText();
    }
    public String getOtherLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(OTHER_TEXT));
        WebElement text = driver.findElement(OTHER_TEXT);
        return text.getText();
    }
    public String getEssentialsLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ESSENTIALS_TEXT));
        WebElement text = driver.findElement(ESSENTIALS_TEXT);
        return text.getText();
    }
    public String getAgricultureLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AGRICULTURE_TEXT));
        WebElement text = driver.findElement(AGRICULTURE_TEXT);
        return text.getText();
    }
    public String getWorkOverseasLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(WORK_OVERSEAS_TEXT));
        WebElement text = driver.findElement(WORK_OVERSEAS_TEXT);
        return text.getText();
    }
    public String getBrowseByCategoryText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(BROWSE_BY_CATEGORY));
        WebElement text = driver.findElement(BROWSE_BY_CATEGORY);
        return text.getText();
    }
    public void clickOnUIElement(WebDriver driver, By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
    }

    public void clickOnElectronicsButton(WebDriver driver){
        clickOnUIElement(driver, ELECTRONICS_BUTTON);
    }

    public void clickOnPropertyButton(WebDriver driver){
        clickOnUIElement(driver, PROPERTY_BUTTON);
    }

    public void clickOnVehiclesButton(WebDriver driver){
        clickOnUIElement(driver, VEHICLES_BUTTON);
    }

    public void clickOnHomeAndGardenButton(WebDriver driver){
        clickOnUIElement(driver, HOME_AND_GARDEN_BUTTON);
    }

    public void clickOnServicesButton(WebDriver driver){
        clickOnUIElement(driver, SERVICES_BUTTON);
    }

    public void clickOnBusinessAndIndustryButton(WebDriver driver){
        clickOnUIElement(driver, BUSINESS_AND_INDUSTRY_BUTTON);
    }

    public void clickOnJobsButton(WebDriver driver){
        clickOnUIElement(driver, JOBS_BUTTON);
    }

    public void clickOnHobbyButton(WebDriver driver){
        clickOnUIElement(driver, HOBBY_SPORT_AND_HOBBY_BUTTON);
    }

    public void clickOnAnimalsButton(WebDriver driver){
        clickOnUIElement(driver, ANIMALS_BUTTON);
    }

    public void clickOnFashionAndBeautyButton(WebDriver driver){
        clickOnUIElement(driver, FASHION_AND_BEAUTY_BUTTON);
    }

    public void clickOnEducationButton(WebDriver driver){
        clickOnUIElement(driver, EDUCATION_BUTTON);
    }

    public void clickOnOtherButton(WebDriver driver){
        clickOnUIElement(driver, OTHER_BUTTON);
    }

    public void clickOnEssentialsButton(WebDriver driver){
        clickOnUIElement(driver, ESSENTIALS_BUTTON);
    }

    public void clickOnAgricultureButton(WebDriver driver){
        clickOnUIElement(driver, AGRICULTURE_BUTTON);
    }

    public void clickOnWorkOverseasButton(WebDriver driver){
        clickOnUIElement(driver, WORK_OVERSEAS_BUTTON);
    }

    public boolean isMainLogoFound(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MAIN_LOGO));
        return driver.findElement(MAIN_LOGO).isDisplayed();
    }

    public String getTextByElement(WebDriver driver, By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by).getText();
    }

    public String getAllAddsButtonText(WebDriver driver){
        return getTextByElement(driver, ALL_ADDS_BUTTON);
    }

    public void clickAllAdds(WebDriver driver){
        clickOnUIElement(driver, ALL_ADDS_BUTTON);
    }

    public String getAllAddsButton2Text(WebDriver driver){
        return getTextByElement(driver, ALL_ADDS_BUTTON_2);
    }





}
