import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest{

    @Test
    public void setIcon(){

    }
    @Test
    @Order(1)
    public void setEmail(){
        login.setEmail("yondusoftware@gmail.com");

    }
    @Test
    @Order(2)
    public void setPassword(){
        login.setPassword("testinium2021");


    }



}
