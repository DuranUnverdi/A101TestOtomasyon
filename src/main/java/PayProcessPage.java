import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PayProcessPage extends BasePage{
    public PayProcessPage(WebDriver driver){
        super(driver);
    }
    WebElement namesurnameLocator=driver.findElement(By.xpath("//div[@class='form-area js-new-creditcard-area']//input[@name='name']"));
    By aggreementLocator=By.xpath("//input[@id='agrement2']");
    By completeorderLocator=By.xpath("//span[@class='order-complete']");
    By paycheckLocator=By.xpath("//div[normalize-space()='Masterpass ile Ödeme']");
    By aggreementcloseLocator=By.xpath("//button[@class='mfp-close']");

    public void cartProcess(){
        Actions actions=new Actions(driver);
        actions.click(namesurnameLocator)
                .sendKeys("Duran Ünverdi")
                .sendKeys(Keys.TAB)
                .sendKeys("1224 **** **** 1124")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys("123")
            .perform();
    }
    public void aggrementProcess() {
        click(aggreementLocator);
    }
    public void choosecontractComplete(){

        click(completeorderLocator);
    }
    public boolean isPay() {
        //ödeme sayfası kontrolü
        return isDisplayed(paycheckLocator);
    }

}
