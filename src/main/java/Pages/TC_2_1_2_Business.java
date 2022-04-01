package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_2_1_2_Business {
    WebDriver driver;

 public By post = By.xpath("/html/body/main/div/section[1]/div[2]/div[1]/a/div[2]/h2");

 public TC_2_1_2_Business(WebDriver driver){
     this.driver=driver;
 }


  public void businessMenuClick() {
   List<WebElement> businees = driver.findElements(By.xpath("/html/body/header/nav[2]/section/section[1]/ul/li"));
   for (WebElement allSubMenu : businees) {
    if (allSubMenu.getText().trim().equals("Business")) {
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
  jse.executeScript("window.scrollBy(0,8000)");
 }


 public By conTact = By.xpath("/html/body/footer/nav/section[4]/ul/li[4]/a");
 public void Contact(){
  JavascriptExecutor js = (JavascriptExecutor) driver;
  WebElement contact = driver.findElement(conTact);
  js.executeScript("arguments[0].scrollIntoView();", contact);
 }


 //Just click the sub menu Button
 public void contactClick(){
  driver.findElement(conTact).click();
 }

}


