import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddressandShippingPage extends  BasePage{
    By createnewaddressLocator= By.xpath("//body/section[@class='js-main-wrapper']/section[@class='page-checkout js-page-checkout js-tab-box']/div[@class='container']/div[@class='checkout-addresses js-tab-content active']/div[@class='row']/div[@class='col-sm-9']/div[@class='checkout-delivery']/div[@class='addresses']/div[@class='list']/ul/li[@class='half']/a[1]");
    WebElement addresstitleLocator=driver.findElement(By.xpath("//input[@placeholder='Ev adresim, iş adresim vb.']"));
    By provinceLocator=By.xpath("//select[@name='city']");
    By districtLocator=By.xpath("//select[@name='township']");
    By neighbourhoodLocator=By.xpath("//select[@name='district']");
    WebElement addressLocator=driver.findElement(By.xpath("//textarea[@name='line']"));
    By saveLocator =By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");


    public  AddressandShippingPage(WebDriver driver)
    {
        super(driver);
    }
    public  void createnewAddress(){
        click(createnewaddressLocator);
    }
    public void addressUpdated(){
        Actions actions=new Actions(driver);
        actions.click(addresstitleLocator)
                .sendKeys("Ev Adresi")
                .sendKeys(Keys.TAB)
                .sendKeys("Duran")
                .sendKeys(Keys.TAB)
                .sendKeys("ünverdi")
                .sendKeys(Keys.TAB)
                .sendKeys("0 (537) 432-6534")  .perform();

        click(provinceLocator);
        Select slc=new Select(find(provinceLocator));
        slc.selectByVisibleText("İSTANBUL");
        click(districtLocator);
        Select slc2=new Select(find(districtLocator));
        slc2.selectByIndex(28);
        click(neighbourhoodLocator);
        Select slc3=new Select(find(neighbourhoodLocator));
        slc3.selectByVisibleText("AHMET YESEVİ MAH");
        actions.click(addressLocator)
                .sendKeys("Unspecified address information")
                .sendKeys(Keys.TAB)
                .sendKeys("12369")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();


    }
    public void saveAddress(){
       driver.findElement(By.xpath("//button[normalize-space()='Kaydet ve Devam Et']")).click();

    }
}












