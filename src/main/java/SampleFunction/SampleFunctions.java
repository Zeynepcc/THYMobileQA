package SampleFunction;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SampleFunctions {

    public static  AppiumDriver<MobileElement> driver;

    public SampleFunctions(AppiumDriver driver)
    {
        this.driver = driver;
    }
    public WebElement findElement(By by)
    {
        untilElementLocated(by);
        return driver.findElement(by);
    }
    public void clickElement(By by) {

        untilElementClickable(by);
        driver.findElement(by).click();
    }
    public void sendKeysValue(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }
    public void selectOptionByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public String getAttribute(By by, String name) {

        return driver.findElement(by).getAttribute(name);
    }
    public void FindBySelector(String element)
    {
        driver.findElement(By.cssSelector(element));

    }
    public void FindByXPath(String element)
    {
        driver.findElement(By.xpath(element));
    }
    public List<MobileElement> getElementsByXpath(String s)
    {
        return driver.findElements(By.xpath(s));
    }
    public List<MobileElement> getElementsByID(String s)
    {
        return driver.findElements(By.id(s));
    }
    public List<MobileElement> getElementsSelector(String s)
    {
        return driver.findElements(By.cssSelector(s));
    }
    public void untilElementClickable(By by)
    {
        new WebDriverWait(driver, 30).
                until(ExpectedConditions.elementToBeClickable(by));
    }
    public void untilElementLocated(By by)
    {
        new WebDriverWait(driver, 30).
                until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void KeyBoardClick(By by)
    {
        driver.findElement(by).sendKeys(Keys.ENTER);
    }

}
