package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_2_1_3_Science {
    WebDriver driver;


 public By post = By.xpath("/html/body/main/div/section[1]/div[2]/div[1]/a/div[2]/h2");


 public By fb = By.cssSelector("#article-body > div > div.article-bottom > div.padding-32-bottom > div > div > span.icon.icon-facebook-circle-solid.social-icon.padding-8-right.color-white > a");
 public By tw = By.cssSelector("#article-body > div > div.article-bottom > div.padding-32-bottom > div > div > span.icon.icon-twitter-circle-solid.social-icon.padding-8-right.color-white > a");
 public By mail = By.cssSelector("#article-body > div > div.article-bottom > div.padding-32-bottom > div > div > span.icon.icon-email-circle-solid.social-icon.padding-8-right.color-white > a");
 public By ln = By.cssSelector("#article-body > div > div.article-bottom > div.padding-32-bottom > div > div > span.icon.icon-linkedin-circle-solid.social-icon.padding-8-right.color-white > a");


 public TC_2_1_3_Science(WebDriver driver){
     this.driver=driver;
 }


  public void scienceMenuClick() {
   //driver.findElement(world);
   List<WebElement> science = driver.findElements(By.xpath("/html/body/header/nav[2]/section/section[1]/ul/li"));
   for (WebElement allSubMenu : science) {
    if (allSubMenu.getText().trim().equals("Science")) {
     allSubMenu.click();
     break;
    }
   }
  }


 public void scrollDown() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,700)");
 }


 public void postClick(){
  driver.findElement(post).click();
 }


 public void scrollDown1() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,3700)");
 }


 public void socialMediaIcons() throws InterruptedException {
  List<WebElement> mediaIcons = driver.findElements(By.xpath("/html/body/div[2]/div/main/div[2]/div[1]/div[3]/div/div[6]/div[2]/div/div/span"));
  int noOfIcons = mediaIcons.size();
  String path = "(/html/body/div[2]/div/main/div[2]/div[1]/div[3]/div/div[6]/div[2]/div/div/span)";
  for (int i=1; i<noOfIcons; i++){
   String elementPath = path+"["+i+"]";
   driver.findElement(By.xpath(elementPath)).click();
  }
 }



}


