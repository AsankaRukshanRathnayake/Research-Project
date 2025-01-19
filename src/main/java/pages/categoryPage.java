package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class categoryPage {

    public static final By CATEGORY_LABEL_TEXT =By.xpath("/html/body/div[3]/div/div[1]/div[3]/div/div[2]/div[1]/div/div/div[2]/div[2]/div/div[2]/button/div[2]");

    public static final By THIS_IS_A_PAID_AD = By.xpath("/html/body/div[1]/div[2]/iframe");
    public static final By CLOSE_BUTTON = By.xpath("/html/body/div[2]/div[3]");

    public String getCategoryLabelText(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CATEGORY_LABEL_TEXT));
        WebElement button = driver.findElement(CATEGORY_LABEL_TEXT);
        return button.getText();
    }

    public boolean isThisIsAPaidAddFound(WebDriver driver){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.presenceOfElementLocated(THIS_IS_A_PAID_AD));
            return true;
        } catch (TimeoutException e) {
            return false;
        }

    }

    public void clickOnUIElement(WebDriver driver, By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
    }

    public void clickOnCloseButton(WebDriver driver){
        clickOnUIElement(driver, CLOSE_BUTTON);
    }

}
