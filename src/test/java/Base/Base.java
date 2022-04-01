package Base;

import Pages.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
    public WebDriver driver;
    public Homepage homepage;

    public static String signIn= "https://time.com/iframe/login";
    public static String baseurl= "https://time.com/";
    public static String SubscribeUrl= "https://time.com/subscribe/asia-holidaysale/";



    @BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homepage = new Homepage(driver);

    }

    @AfterClass
    public void down(){
        driver.quit();
    }
}
