package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    By addPant= By.className("product-lazy-image");
    By sizeSize= By.xpath(".//a[@key=\"1\"]");
    By addToCart=By.id("pd_add_to_cart");
    By goToCart=By.id("spanCart");
    By plusPant=By.xpath(".//a[@class=\"oq-up plus\"]");
    By delete1=By.xpath(".//i[@class=\"fa fa-trash-o\"]");
    By deletePant=By.xpath(".//a[@class=\"inverted-modal-button sc-delete ins-init-condition-tracking\"]");
    By productprice=By.xpath(".//span[@class=\"price\"]");
    By lastPriceInCart=By.xpath(".//span[@class=\"rd-cart-item-price mb-15\"]");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String selectProduct() {

        click(addPant);
        String priceinpage=getText(productprice,"innerHTML");
        System.out.println(priceinpage);
        click(sizeSize);
        return priceinpage;

    }
    public String setAddToCart(){

        click(addToCart);
        click(goToCart);
        String lastprice=getText(lastPriceInCart,"innerHTML");
        System.out.println(lastprice);
        click(plusPant);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(delete1);
        click(deletePant);
        return lastprice ;

    }


}
