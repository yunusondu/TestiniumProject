package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    SearchPage searchPage;

    public HomePage(WebDriver driver) {

        super(driver);
        searchPage =new SearchPage(driver);

    }

    public SearchPage searchBox(){
        return this.searchPage;
    }

}
