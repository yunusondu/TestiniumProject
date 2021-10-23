import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ProductsPage;

public class TestAddProduct extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;




    @Test
    @Order(1)
    public void search_product(){
        homePage =new HomePage(driver);
        homePage.searchBox().search("Pantalon");


    }
    @Test
    @Order(2)
    public void click_product() {
        productsPage=new ProductsPage(driver);
        productsPage.selectProduct();
        productsPage.setAddToCart();


    }


}
