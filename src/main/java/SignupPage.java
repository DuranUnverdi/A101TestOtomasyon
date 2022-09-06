import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SignupPage extends BasePage {
    By loginsignupLocator= By.xpath("//span[contains(text(),'Giriş Yap')]");
    By signupLocator=By.xpath("//a[contains(text(),'Üye Ol')]");
    By phoneLocator=By.id("phone");
    By signupEnterLocator=By.xpath("//button[@class='button block green mt-1 js-login-btn']");
    By codeLocator=By.xpath("//input[@name='code']");
    By codeEnterLocator=By.xpath("//button[@class='js-send-verification button green']");
    public SignupPage(WebDriver driver) {
        super(driver);
    }
    public void loginsignupEnter(){
        click(loginsignupLocator);
    }
    public void sigunupEnter(){
        click(signupLocator);
    }
    public void signupPhoneEnter(String text){
        type(phoneLocator,text);
        click(signupEnterLocator);
    }
    public void signupCodeEnter(String text){
        type(codeLocator,text);
        click(codeEnterLocator);
    }
}
