package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_5_2_1_HelpCenter {


    public By helpcenter = By.xpath("/html/body/header/nav[1]/div[1]/div[3]/div/div/div/a[4]");

    WebDriver driver;
    public TC_5_2_1_HelpCenter(WebDriver driver){
        this.driver=driver;
    }

    public void helpCenter(){
        driver.findElement(helpcenter).click();
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
    }

    public void YourAccountAllClick() {
        List<WebElement> alllink = driver.findElements(By.xpath("/html/body/main/div[2]/section/div[1]/ul[1]/li"));
        for (WebElement AllLink : alllink) {
            AllLink.click();
        }
    }

    public void s_ManagementClick() {
        List<WebElement> alllink = driver.findElements(By.xpath("/html/body/main/div[2]/section/div[1]/ul[2]/li"));
        for (WebElement AllLink : alllink) {
            AllLink.click();
        }
    }

}
