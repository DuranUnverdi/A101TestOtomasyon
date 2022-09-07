import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    By cartoprLocator1= By.xpath("/html[1]/body[1]/section[1]/section[4]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/article[1]/div[1]/div[2]/div[2]/a[1]/strong[1]/span[1]");
    By cartoprLocator2=By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']");
    By viewcartLocator=By.xpath("//a[@class='go-to-shop']");
    By confirmcartLocator=By.xpath("//a[@class='button green checkout-button block js-checkout-button']");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void addtoCart(){
        click(cartoprLocator1);
        click(cartoprLocator2);
        click(viewcartLocator);

    }
    public void confirmCart(){
        click(confirmcartLocator);
    }
}
