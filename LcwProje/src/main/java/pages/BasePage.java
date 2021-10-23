package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.Key;
import java.util.List;


public class BasePage {

    WebDriver driver;
    WebDriverWait wait = null;
    public BasePage(WebDriver driver){
        this.driver=driver;
        this.wait= new WebDriverWait(driver,6);
    }


    public WebElement find(By locator){

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return driver.findElement(locator);

    }
    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }
    public void click(By locator){

        wait.until(ExpectedConditions.elementToBeClickable(locator));
        find(locator).click();

    }
    public void type(By locator ,String text ){
        find(locator).sendKeys(text+"\n");
    }
    public String getText(By locater, String text){

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locater));
        return find(locater).getAttribute(text);

    }


}
