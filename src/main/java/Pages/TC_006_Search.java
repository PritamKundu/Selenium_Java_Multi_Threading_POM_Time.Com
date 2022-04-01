package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TC_006_Search {
    WebDriver driver;

    public By searchIcon = By.xpath("//header/nav[1]/div[2]/div[2]/div[3]/button[1]/span[1]/*[1]");
    public By searchBox = By.xpath("//header/nav[1]/div[2]/div[2]/div[3]/div[1]/form[1]/input[1]");
    public By postClick = By.xpath("/html/body/div[1]/div[1]/div/main/div[2]/div[2]/article[1]/div/div/a");

    public TC_006_Search(WebDriver driver){
        this.driver=driver;
    }

    public void clickIcon(){
        driver.findElement(searchIcon).click();
    }
    public void setSearchData(String text){
        driver.findElement(searchBox).sendKeys(text);
    }
    public void clickSearchButton(){
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }


    public void postClick(){
        driver.findElement(postClick).sendKeys(Keys.ENTER);
    }

}
