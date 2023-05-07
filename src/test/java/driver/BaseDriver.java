package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;

    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://test.sharebus.co/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageDriver.getInstance().setDriver(driver);
    }

    @AfterSuite
    public void shutdown(){
        //driver.quit();
    }
}
