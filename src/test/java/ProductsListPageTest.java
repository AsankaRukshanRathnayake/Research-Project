import Constants.LabelConstants;
import Constants.ListConstants;
import functions.homeFunctions;
import functions.productListFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;


public class ProductsListPageTest {

    WebDriver driver1;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver1 = new ChromeDriver();
        driver1.get("https://ikman.lk/");
        homeFunctions.clickAllAddsButton(driver1);
    }

    @AfterMethod
    public void end(){
        driver1.close();
        driver1.quit();
    }


    @Test(description = "REPRO-21 - Verify Contents of the Products List Page", alwaysRun = true)
    public void verifyProductListPageContents(){
        //Assert.assertEquals(homeFunctions.getAllAddsButton2Text(driver1), LabelConstants.ALL_ADDS);
        Assert.assertEquals(productListFunctions.getSelectLocationButtonText(driver1), LabelConstants.SELECT_LOCATION);
        Assert.assertEquals(productListFunctions.getSelectCategoryButtonText(driver1), LabelConstants.SELECT_CATEGORY);
    }


    @Test(description = "REPRO-22 - Verify Select Location List Is Loaded when user clicks on Location", alwaysRun = true)
    public void verifyLocationListIsLoading(){
        productListFunctions.clickSelectLocationButton(driver1);
        Assert.assertEquals(productListFunctions.getLocationListHeaderText(driver1), LabelConstants.SELECT_LOCATION_LIST_HEADER);

    }

    @Test(description = "REPRO-23 - Verify Location List is Closing when user clicks close button", alwaysRun = true)
    public void verifyCloseLocationList(){
        productListFunctions.clickSelectLocationButton(driver1);
        Assert.assertEquals(productListFunctions.getLocationListHeaderText(driver1), LabelConstants.SELECT_LOCATION_LIST_HEADER);
        productListFunctions.closeLocationList(driver1);
        Assert.assertEquals(productListFunctions.getSelectLocationButtonText(driver1), LabelConstants.SELECT_LOCATION);
        Assert.assertEquals(productListFunctions.getSelectCategoryButtonText(driver1), LabelConstants.SELECT_CATEGORY);
    }

    @Test(description = "REPRO-24 - Verify contents of the Location list", alwaysRun = true)
    public void verifyHomePageIsLoading(){
        productListFunctions.clickSelectLocationButton(driver1);
        Assert.assertEquals(productListFunctions.getLocationListHeaderText(driver1), LabelConstants.SELECT_LOCATION_LIST_HEADER);
        //Assert.assertEquals(productListFunctions.getAllOfSriLankaButtonText(driver1), LabelConstants.ALL_OF_SRI_LANKA);
        //Assert.assertEquals(productListFunctions.getDistrictsLabelText(driver1), LabelConstants.DISTRICTS);
        List<String> districts = productListFunctions.getLocationListDistricts(driver1);
        List<String> districtLabels = List.of(new String[]{ListConstants.COLOMBO, ListConstants.KANDY, ListConstants.GALLE, ListConstants.AMPARA, ListConstants.ANURADHAPURA, ListConstants.BADULLA, ListConstants.BATTICALOA,
        ListConstants.GAMPAHA, ListConstants.HAMBANTOTA, ListConstants.JAFFNA, ListConstants.KALUTARA, ListConstants.KEGALLE});
        Assert.assertEquals(districts, districtLabels);
    }

    @Test(description = "REPRO-25 - Verify Select Category List Is Loaded when user clicks on Categories", alwaysRun = true)
    public void verifyCategoryListIsLoading(){
        productListFunctions.clickSelectCategoryButton(driver1);
        Assert.assertEquals(productListFunctions.getCategoryListHeaderText(driver1), LabelConstants.SELECT_CATEGORY_LIST_HEADER);

    }

    @Test(description = "REPRO-26 - Verify Category List is Closing when user clicks close button", alwaysRun = true)
    public void verifyCloseCategoryList(){
        productListFunctions.clickSelectCategoryButton(driver1);
        Assert.assertEquals(productListFunctions.getCategoryListHeaderText(driver1), LabelConstants.SELECT_CATEGORY_LIST_HEADER);
        productListFunctions.closeCategoryList(driver1);
        Assert.assertEquals(productListFunctions.getSelectLocationButtonText(driver1), LabelConstants.SELECT_LOCATION);
        Assert.assertEquals(productListFunctions.getSelectCategoryButtonText(driver1), LabelConstants.SELECT_CATEGORY);
    }

    @Test(description = "REPRO-27 - Verify contents of the Category list", alwaysRun = true)
    public void verifyCategoryListContents(){
        productListFunctions.clickSelectCategoryButton(driver1);
        Assert.assertEquals(productListFunctions.getCategoryListHeaderText(driver1), LabelConstants.SELECT_CATEGORY_LIST_HEADER);
        //Assert.assertEquals(productListFunctions.getAllOfSriLankaButtonText(driver1), LabelConstants.ALL_OF_SRI_LANKA);
        List<String> categories = productListFunctions.getCategoryListCategories(driver1);
        List<String> categoryLabels = List.of(new String[]{LabelConstants.ELECTRONICS, LabelConstants.VEHICLES, LabelConstants.PROPERTY, LabelConstants.HOME_AND_GARDEN, LabelConstants.ANIMALS, LabelConstants.SERVICES, LabelConstants.BUSINESS_AND_INDUSTRY,
                LabelConstants.JOBS, LabelConstants.HOBBY_SPORT_AND_KIDS, LabelConstants.FASHION_AND_BEAUTY, LabelConstants.ESSENTIALS, LabelConstants.EDUCATION, LabelConstants.AGRICULTURE, LabelConstants.WORK_OVERSEAS, LabelConstants.OTHER});
        Assert.assertEquals(categories, categoryLabels);
    }/*

    @Test(description = "REPRO-23 - Verify Select Category List Is Loaded when user clicks on Category List", alwaysRun = true)
    public void verifyHomePageIsLoading(){
        driver1.get("https://ikman.lk/");
        String AllOfSriLanka = homeFunctions.getAllOfSriLankaButtonText(driver1);
        Assert.assertEquals(AllOfSriLanka, "All of Sri Lanka");
    }

    @Test(description = "REPRO-21 - Verify contents of the Category list", alwaysRun = true)
    public void verifyHomePageIsLoading(){
        driver1.get("https://ikman.lk/");
        String AllOfSriLanka = homeFunctions.getAllOfSriLankaButtonText(driver1);
        Assert.assertEquals(AllOfSriLanka, "All of Sri Lanka");
    }*/



}
