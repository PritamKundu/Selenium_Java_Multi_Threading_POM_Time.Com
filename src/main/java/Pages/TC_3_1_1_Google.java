package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_3_1_1_Google {

    public By createone = By.xpath("/html/body/div[2]/div/h3/a");
    public By google = By.id("sign-up-google");


    WebDriver driver;
    public TC_3_1_1_Google(WebDriver driver){
        this.driver=driver;
    }


    public void craeteOne(){
        driver.findElement(createone).click();
    }


      public void Google(){
        driver.findElement(google).click();
    }

}
