package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TC_5_3_SignOut {
    WebDriver driver;

    public By signOut = By.xpath("/html/body/header/nav[1]/div[1]/div[3]/div/div/div/a[5]");

    public TC_5_3_SignOut(WebDriver driver){
        this.driver=driver;
    }

    public void signout() {
        driver.findElement(signOut).click();
    }
}

