package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_2_6_SocialIcon {

    WebDriver driver;
    public TC_2_6_SocialIcon(WebDriver driver){
        this.driver=driver;
    }

    public void socialIconClick() {
        List<WebElement> allsociallink = driver.findElements(By.xpath("/html/body/header/nav[2]/section/section[6]/ul/li"));
        for (WebElement allLink : allsociallink) {
            allLink.click();
            }
        }
}
