package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TC_3_2_3_SignIn {
    WebDriver driver;

    public By email = By.id("email");
    public By password = By.id("password");
    public By login = By.id("login");
    public By closePopup = By.className("animate-close");

    public TC_3_2_3_SignIn(WebDriver driver){
        this.driver=driver;
    }

    public void newemail(String text) {
        driver.findElement(email).sendKeys(text);
    }

    public void enter_password(String text) {
        driver.findElement(password).sendKeys(text);
    }

    public void login() {
        driver.findElement(login).click();
    }


}

