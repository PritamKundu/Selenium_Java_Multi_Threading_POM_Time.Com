package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_5_1_1_ManageAccount {


    public By myaccount = By.xpath("/html/body/header/nav[1]/div[1]/div[3]/div/div/button");
    public By manageaccount = By.xpath("/html/body/header/nav[1]/div[1]/div[3]/div/div/div/a[1]");
    public By subscriptionnumber = By.xpath("/html/body/div[1]/div[7]/input[1]");
    public By country = By.xpath("/html/body/div[1]/div[7]/select/option");
    public By linksubscription = By.xpath("/html/body/div[1]/div[7]/input[2]");


    WebDriver driver;


    public TC_5_1_1_ManageAccount(WebDriver driver){
        this.driver=driver;
    }


      public void myAccount(){
        driver.findElement(myaccount).click();
    }


    public void manageAccount(){
        driver.findElement(manageaccount).click();
    }


    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
    }


    public void printClick() throws InterruptedException {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@scrolling=\"no\"]"));
        Thread.sleep(2000);
        driver.switchTo().frame(iframe);
        /*driver.switchTo().frame("__cmpLocator");
        driver.switchTo().frame("__uspapiLocator");*/
        driver.findElement(By.id("link-subscription")).click();
        Thread.sleep(3000);
    }


    public void subscriptionAccount(){
        driver.findElement(subscriptionnumber).sendKeys("1234567");
    }


    public void countryFind() {
        List<WebElement> countryName = driver.findElements(country);
        for (WebElement allCountry : countryName) {
            if (allCountry.getText().trim().equals("Bangladesh")) {
                allCountry.click();
                break;
            }
        }
    }


    public void linkSubscriptionClick(){
        driver.findElement(linksubscription).click();
    }

}
