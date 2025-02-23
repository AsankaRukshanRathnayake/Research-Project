package functions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainFunctions {
    public static WebDriver driver1;

    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
    }

    public static void clickOnUIElement(By by){
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver1.findElement(by).click();
    }

    public static String getTextByElement(By by){
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver1.findElement(by).getText();
    }

    public static boolean isElementDisplayed (By by){
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver1.findElement(by).isDisplayed();
    }

    public static void sendKeys(By by, String value){
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver1.findElement(by).sendKeys(value);
    }

    public static boolean isEnabled(By by){
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver1.findElement(by).isEnabled();
    }

}
