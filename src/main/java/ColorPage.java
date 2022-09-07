import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ColorPage extends BasePage{
    By colorLocator= By.xpath("//label[@for='attributes_integration_colourSİYAH']");
    By blackcheckedLocator=By.xpath("//label[@for='attributes_integration_colourSİYAH']");
    public ColorPage(WebDriver driver) {
        super(driver);
    }
    public void chooseColor(){
        click(colorLocator);
    }
    public boolean isBlack() {
        //renk kontrolü
        return isDisplayed(blackcheckedLocator);
    }
}
