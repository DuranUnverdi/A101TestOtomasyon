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
    PayProcessPage payProcessPage;


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
    public void search_a_Category() throws InterruptedException {

        categoryPage = new CategoryPage(driver);
        categoryPage.clothingAccessory();
        Thread.sleep(2000);
        categoryPage.womenClothing();
        Thread.sleep(3000);
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
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            return;
        }
    }

    @Test
    @Order(5)
    public void cart_intermediate_Transactions(){

        intermediateTransactionsPage =new IntermediateTransactionsPage(driver);
        intermediateTransactionsPage.continuewithoutMember();
        intermediateTransactionsPage.emailEnter("duranundveardfiq1qq1905@gmail.com");
    }
    @Test
    @Order(6)
    public void cart_adress_Shipping() throws InterruptedException {

        addressandShippingPage =new AddressandShippingPage(driver);
        addressandShippingPage.createnewAddress();
        Thread.sleep(3000);
        addressandShippingPage.addressUpdated();
        Thread.sleep(2000);
        addressandShippingPage.saveAddress();



    }
    @Test
    @Order(7)
    public void cart_pay_Process() throws InterruptedException {

        payProcessPage =new PayProcessPage(driver);
        Thread.sleep(2000);
        payProcessPage.cartProcess();
        Thread.sleep(2000);
        payProcessPage.aggrementProcess();
        payProcessPage.choosecontractComplete();
        Assertions.assertTrue(payProcessPage.isPay() ,"not pay page!");


    }


}
