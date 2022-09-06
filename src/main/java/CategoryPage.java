import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage{
    By clothingaccessoryLocator= By.xpath("//a[normalize-space()='Giyim & aksesuar']");
    By womenclothingLocator=By.xpath("//a[contains(@class,'js-filter-link')][contains(text(),'Kadın İç Giyim')]");
    By kneesockLocator=By.xpath("//a[@class='js-filter-link '][contains(text(),'Dizaltı Çorap')]");
    public CategoryPage(WebDriver driver) {
        super(driver);
    }
    public  void clothingAccessory(){
        click(clothingaccessoryLocator);
    }
    public  void womenClothing(){
        click(womenclothingLocator);
    }
    public  void kneeCock(){
        click(kneesockLocator);
    }
}
