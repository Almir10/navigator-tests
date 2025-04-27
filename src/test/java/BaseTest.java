
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Dodati svoju putanju do chromedriver.exe fajla ispod

        System.setProperty("webdriver.chrome.driver", "E:\\NewDownloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        driver.get("https://www.navigator.ba");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}