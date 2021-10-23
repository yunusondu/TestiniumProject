package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    protected WebDriver driver;
    private final By email=By.id("LoginEmail");
    private final By password=By.id("Password");
    By loginButton=By.xpath(".//div[@class='dropdown cart-dropdown']");
    By lastLoginButton=By.id("loginLink");

    public LoginPage(WebDriver driver){

        super(driver);
        this.driver=driver;

    }

    public void setEmail(String emailText){

        WebElement emailSpace=driver.findElement(email);
        emailSpace.click();
        emailSpace.sendKeys(emailText);
        click(lastLoginButton);

    }
    public void setPassword(String passwordText){

        click(loginButton);
        WebElement passwordSpace=driver.findElement(password);
        passwordSpace.click();
        passwordSpace.sendKeys(passwordText);

    }




}
