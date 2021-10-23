package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    By searchBoxLocator = By.id("search");
    By DahaFazlaGor =By.className("lazy-load-button");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {

        type(searchBoxLocator,text);
        click(DahaFazlaGor);

    }
}
