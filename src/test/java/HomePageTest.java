import Constants.LabelConstants;
import functions.categoryFunctions;
import functions.homeFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {

    WebDriver driver1;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver1 = new ChromeDriver();
    }

    @AfterMethod
    public void end(){
        driver1.close();
        driver1.quit();
    }

    @Test(description = "REPRO-1", alwaysRun = true)
    public void verifyHomePageIsLoading(){
        driver1.get("https://ikman.lk/");
        String AllOfSriLanka = homeFunctions.getAllOfSriLankaButtonText(driver1);
        Assert.assertEquals(AllOfSriLanka, "All of Sri Lanka");
    }

    @Test(description = "REPRO-2", alwaysRun = true)
    public void verifyHomePageContent(){
        driver1.get("https://ikman.lk/");
        Assert.assertEquals(homeFunctions.getElectronicsLabelText(driver1), LabelConstants.ELECTRONICS);
        Assert.assertEquals(homeFunctions.getPropertyLabelText(driver1), LabelConstants.PROPERTY);
        Assert.assertEquals(homeFunctions.getVehiclesLabelText(driver1), LabelConstants.VEHICLES);
        Assert.assertEquals(homeFunctions.getHomeAndGardenLabelText(driver1), LabelConstants.HOME_AND_GARDEN);
        Assert.assertEquals(homeFunctions.getServicesLabelText(driver1), LabelConstants.SERVICES);
        Assert.assertEquals(homeFunctions.getBusinessAndIndustryLabelText(driver1), LabelConstants.BUSINESS_AND_INDUSTRY);
        Assert.assertEquals(homeFunctions.getJobsLabelText(driver1), LabelConstants.JOBS);
        Assert.assertEquals(homeFunctions.getHobbyLabelText(driver1), LabelConstants.HOBBY_SPORT_AND_KIDS);
        Assert.assertEquals(homeFunctions.getAnimalsLabelText(driver1), LabelConstants.ANIMALS);
        Assert.assertEquals(homeFunctions.getFashionAndBeautyLabelText(driver1), LabelConstants.FASHION_AND_BEAUTY);
        Assert.assertEquals(homeFunctions.getEducationLabelText(driver1), LabelConstants.EDUCATION);
        Assert.assertEquals(homeFunctions.getOtherLabelText(driver1), LabelConstants.OTHER);
        Assert.assertEquals(homeFunctions.getEssentialsLabelText(driver1), LabelConstants.ESSENTIALS);
        Assert.assertEquals(homeFunctions.getAgricultureLabelText(driver1), LabelConstants.AGRICULTURE);
        Assert.assertEquals(homeFunctions.getWorkOverseasLabelText(driver1), LabelConstants.WORK_OVERSEAS);
    }

    @Test(description = "REPRO-3", alwaysRun = true)
    public void verifyBrowseByCategoryTextIsDisplayed(){
        driver1.get("https://ikman.lk/");
        Assert.assertEquals(homeFunctions.getBrowseByCategoryText(driver1), LabelConstants.BROWSE_BY_CATEGORY);
    }

    @Test(description = "REPRO-4", alwaysRun = true)
    public void verifyElectronicsPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnElectronicsButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.ELECTRONICS);
    }

    @Test(description = "REPRO-5", alwaysRun = true)
    public void verifyPropertyPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnPropertyButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.PROPERTY);
    }

    @Test(description = "REPRO-6", alwaysRun = true)
    public void verifyVehiclesPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnVehiclesButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.VEHICLES);
    }

    @Test(description = "REPRO-7", alwaysRun = true)
    public void verifyHomeAndGardenPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnHomeAndGardenButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.HOME_AND_GARDEN);
    }

    @Test(description = "REPRO-8", alwaysRun = true)
    public void verifyServicesPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnServicesButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.SERVICES);
    }

    @Test(description = "REPRO-9", alwaysRun = true)
    public void verifyBusinessAndIndustryPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnBusinessAndIndustryButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.BUSINESS_AND_INDUSTRY);
    }

    @Test(description = "REPRO-10", alwaysRun = true)
    public void verifyJobsPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnJobsButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.JOBS);
    }

    @Test(description = "REPRO-11", alwaysRun = true)
    public void verifyHobbyPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnHobbyButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.HOBBY_SPORT_AND_KIDS);
    }

    @Test(description = "REPRO-12", alwaysRun = true)
    public void verifyAnimalPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnAnimalsButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.ANIMALS);
    }

    @Test(description = "REPRO-13", alwaysRun = true)
    public void verifyFashionAndBeautyPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnFashionAndBeautyButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.FASHION_AND_BEAUTY);
    }
    @Test(description = "REPRO-14", alwaysRun = true)
    public void verifyEducationPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnEducationButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.EDUCATION);
    }

    @Test(description = "REPRO-15", alwaysRun = true)
    public void verifyOtherPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnOtherButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.OTHER);
    }

    @Test(description = "REPRO-16", alwaysRun = true)
    public void verifyEssentialsPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnEssentialsButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.ESSENTIALS);
    }

    @Test(description = "REPRO-17", alwaysRun = true)
    public void verifyAgriculturePageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnAgricultureButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.AGRICULTURE);
    }

    @Test(description = "REPRO-18", alwaysRun = true)
    public void verifyWorkOverseasPageIsLoading(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickOnWorkOverseasButton(driver1);
        Assert.assertEquals(categoryFunctions.getCategoryLabelText(driver1), LabelConstants.WORK_OVERSEAS);
    }

    @Test(description = "REPRO-19 - Verify the header", alwaysRun = true)
    public void verifyHeader(){
        driver1.get("https://ikman.lk/");
        Assert.assertTrue(homeFunctions.isMainLogoFound(driver1));
        Assert.assertEquals(homeFunctions.getAllAddsButtonText(driver1), LabelConstants.ALL_ADDS);
    }

    @Test(description = "REPRO-20 - Verify all adds are loaded when the user clicks on All Adds", alwaysRun = true)
    public void verifyClickAllAdds(){
        driver1.get("https://ikman.lk/");
        homeFunctions.clickAllAddsButton(driver1);
        Assert.assertEquals(homeFunctions.getAllAddsButton2Text(driver1), LabelConstants.ALL_ADDS);
    }

}
