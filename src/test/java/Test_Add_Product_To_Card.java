import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class Test_Add_Product_To_Card extends BaseTest{
    SignupPage signupPage;
    CookiesPage cookiesPage;
    CategoryPage categoryPage;
    ColorPage colorPage;
    BasketPage basketPage;


    @Test
    @Order(1)
    public void accept_Cookies(){

        cookiesPage = new CookiesPage(driver);
        cookiesPage.cookiesAccept();
        cookiesPage.refreshAccept();

    }
/*
    @Test
    @Order(2)
    public void amazon_Signup() {

        signupPage = new SignupPage(driver);
        signupPage.loginsignupEnter();
        signupPage.sigunupEnter();
        signupPage.signupPhoneEnter("(37) 432 65 34");

        signupPage.signupCodeEnter("196950");
    }*/
    @Test
    @Order(2)
    public void search_a_Category(){

        categoryPage = new CategoryPage(driver);
        categoryPage.clothingAccessory();
        categoryPage.womenClothing();
        categoryPage.kneeCock();

    }
    @Test
    @Order(3)
    public void search_a_Color(){

        colorPage = new ColorPage(driver);
        colorPage.chooseColor();
        Assertions.assertTrue(colorPage.isBlack() ,"Black not selected!");


    }
    @Test
    @Order(4)
    public void search_basket_Operations(){

        basketPage = new BasketPage(driver);
        basketPage.addtoBasket();

    }


}
