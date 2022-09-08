import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
//static oluşturulmadığı için
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {



        protected WebDriver driver;

        @BeforeAll
        public void setUp() {
            //Chrome
            WebDriverManager.chromedriver().setup();

            //driver burda null olmaktan çıkartıyoruz
            driver = new ChromeDriver();
            driver.get("https://www.a101.com.tr/");
            //Sayfa büyütüldü
            driver.manage().window().maximize();
            //Test süresi belirlendi
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));

        }

        @AfterAll
        public void tearDown() {
            //driver.quit();
            System.out.println("Test Finished");
        }
    }

