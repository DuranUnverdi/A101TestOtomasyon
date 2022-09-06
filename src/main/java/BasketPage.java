import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{
    By basketoprLocator1= By.xpath("//body/section[contains(@class,'js-main-wrapper')]/section[contains(@class,'page-list js-container')]/div[contains(@class,'container')]/div[contains(@class,'content')]/div[contains(@class,'row')]/div[contains(@class,'col-md-10 col-sm-9')]/div[contains(@class,'products-list')]/div[contains(@class,'row')]/ul[contains(@class,'product-list-general')]/li[1]/article[1]/div[1]/div[2]/div[2]/a[1]/strong[1]/span[1]");
    By basketoprLocator2=By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']");
    By viewcartLocator=By.xpath("//a[@class='go-to-shop']");
    public BasketPage(WebDriver driver) {
        super(driver);
    }
    public void addtoBasket(){
        click(basketoprLocator1);
        click(basketoprLocator2);
        click(viewcartLocator);
    }
}
