import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

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
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    public void emailEnter(String text){
        type(emailLocator,text);
        click(emailgoonLocator);
    }
}
