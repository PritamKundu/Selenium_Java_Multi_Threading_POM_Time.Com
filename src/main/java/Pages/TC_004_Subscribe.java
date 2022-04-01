package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_004_Subscribe {

    public By subsCribe = By.xpath("/html/body/header/nav[1]/div/div[2]/div[1]/ul/li[2]/div/a");
    public By google = By.id("sign-up-google");

    WebDriver driver;
    public TC_004_Subscribe(WebDriver driver){
        this.driver=driver;
    }

    public void subsCribe(){
        driver.findElement(subsCribe).click();
    }

}
