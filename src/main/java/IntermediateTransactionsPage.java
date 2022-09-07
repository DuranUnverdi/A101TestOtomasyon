import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IntermediateTransactionsPage extends BasePage{
    public IntermediateTransactionsPage(WebDriver driver) {
        super(driver);
    }
    By goonLocator= By.xpath("//a[@title='ÜYE OLMADAN DEVAM ET']");
    By emailLocator=By.xpath("//input[@name='user_email']");
    By emailgoonLocator=By.xpath("//button[@class='button block green']");

    public void continuewithoutMember(){
        click(goonLocator);
    }
    public void emailEnter(String text){
        type(emailLocator,text);
        click(emailgoonLocator);
    }
}
