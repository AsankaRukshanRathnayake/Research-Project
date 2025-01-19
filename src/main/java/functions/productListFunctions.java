package functions;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import pages.productsListPage;

import java.util.ArrayList;

public class productListFunctions {
    private static productsListPage page = new productsListPage();

    public static String getSelectLocationButtonText(WebDriver driver){
        return page.getSelectLocationButtonText(driver);
    }

    public static String getSelectCategoryButtonText(WebDriver driver){
        return page.getSelectCategoryButtonText(driver);
    }

    public static void clickSelectLocationButton(WebDriver driver){
        page.clickSelectLocationButton(driver);
    }

    public static void clickSelectCategoryButton(WebDriver driver){
        page.clickSelectCategoryButton(driver);
    }

    public static String getLocationListHeaderText(WebDriver driver){
        return page.getSelectLocationMenuHeaderText(driver);
    }

    public static void closeLocationList(WebDriver driver){
        page.clickLocationListClose(driver);
    }

    public static ArrayList<String> getLocationListDistricts(WebDriver driver){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=1; i<=12; i++){
            //System.out.println(page.getLocationListDistricts(driver, i));
            arrayList.add(page.getLocationListDistricts(driver, i));

        }
        return arrayList;
    }

    public static String getAllOfSriLankaButtonText(WebDriver driver){
        return page.getAllOfSriLankaButtonText(driver);
    }

    public static String getDistrictsLabelText(WebDriver driver){
        return page.getDistrictsLabelText(driver);
    }

    public static String getCategoryListHeaderText(WebDriver driver){
        return page.getSelectCategoryMenuHeaderText(driver);
    }

    public static void closeCategoryList(WebDriver driver){
        page.clickCategoryListClose(driver);
    }

    public static ArrayList<String> getCategoryListCategories(WebDriver driver){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=2; i<=16; i++){
            arrayList.add(page.getCategoryListCategories(driver, i));

        }
        return arrayList;
    }

}
