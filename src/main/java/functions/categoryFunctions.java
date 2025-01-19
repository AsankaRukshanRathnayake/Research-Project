package functions;

import org.openqa.selenium.WebDriver;
import pages.categoryPage;

public class categoryFunctions {
    public static categoryPage categoryPage = new categoryPage();

    public static String getCategoryLabelText(WebDriver driver){
        //handleAdds(driver);
        return categoryPage.getCategoryLabelText(driver);
    }

    public static void handleAdds(WebDriver driver){
        if(categoryPage.isThisIsAPaidAddFound(driver)){
            System.out.println(categoryPage.isThisIsAPaidAddFound(driver));
            categoryPage.clickOnCloseButton(driver);
        }
    }
}
