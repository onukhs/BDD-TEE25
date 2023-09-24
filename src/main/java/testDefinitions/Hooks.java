package testDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private static WebDriver driver;

    @Before
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\SDA\\TEE25\\HELLO_CUCUMBER\\src\\main\\resources\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        System.out.println("INFO : Browser is UP");
    }

    @After
    public static void shutDown(){
        driver.close();
        driver.quit();

        System.out.println("INFO: Browser is down");
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
