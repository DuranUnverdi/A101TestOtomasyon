import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class Test_Add_Product_To_Card extends BaseTest{
    SignupPage signupPage;
    CookiesPage cookiesPage;
    CategoryPage categoryPage;
    ColorPage colorPage;
    CartPage cartPage;
    IntermediateTransactionsPage intermediateTransactionsPage;
    AddressandShippingPage addressandShippingPage;


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
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            return;
        }
        categoryPage.kneeCock();

    }
    @Test
    @Order(3)
    public void search_a_Color() {

        colorPage = new ColorPage(driver);
        colorPage.chooseColor();
        Assertions.assertTrue(colorPage.isBlack() ,"Black not selected!");
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            return;
        }


    }
    @Test
    @Order(4)
    public void cart_Operations(){

        cartPage = new CartPage(driver);
        cartPage.addtoCart();
        cartPage.confirmCart();

    }

    @Test
    @Order(5)
    public void cart_intermediate_Transactions(){

        intermediateTransactionsPage =new IntermediateTransactionsPage(driver);
        intermediateTransactionsPage.continuewithoutMember();
        intermediateTransactionsPage.emailEnter("duranunverdi1905@gmail.com");
    }
    @Test
    @Order(6)
    public void cart_adress_Shipping(){

        addressandShippingPage =new AddressandShippingPage(driver);
        addressandShippingPage.createnewAddress();
        addressandShippingPage.addressUpdated();
        addressandShippingPage.saveAddress();
    }


}
