import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiesPage extends BasePage {
    By cookiesLocator= By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    By refreshLocator=By.xpath("//a[@class='logo']//img[@loading='lazy']");
    public CookiesPage(WebDriver driver) {
        super(driver);
    }
    public  void cookiesAccept(){
        click(cookiesLocator);
    }
    public  void refreshAccept(){
        click(refreshLocator);
    }


}
