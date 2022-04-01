package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_2_1_1_World {
 public static WebDriver driver;

 public By menu = By.id("button-in-unless");
 public By post = By.xpath("/html[1]/body[1]/main[1]/div[1]/section[1]/div[2]/div[1]/a[1]/div[2]/h2[1]");
 public By subscribe = By.xpath("/html/body/div[3]/div[3]/div[1]/div[2]/a");
 public By digital = By.xpath("//body/main[1]/section[1]/ul[1]/li[1]/a[1]");
 public By fullName = By.xpath("/html/body/main/section/div[2]/section/form/div[1]/div[2]/div/input[1]");
 public By streetAddress = By.xpath("/html/body/main/section/div[2]/section/form/div[1]/div[3]/input[1]");
 public By streetAddress2 = By.xpath("/html/body/main/section/div[2]/section/form/div[1]/div[3]/input[2]");
 public By city = By.xpath("//body/main[1]/section[1]/div[2]/section[1]/form[1]/div[1]/div[4]/div[1]/input[1]");
 public By postalCode = By.xpath("//body/main[1]/section[1]/div[2]/section[1]/form[1]/div[1]/div[4]/div[2]/input[1]");



 public TC_2_1_1_World(WebDriver driver){
     this.driver=driver;
 }


 public void menuClick(){
     driver.findElement(menu).click();
 }


  public void worldMenuClick() {
   List<WebElement> world = driver.findElements(By.xpath("/html/body/header/nav[2]/section/section[1]/ul/li"));
   for (WebElement allSubMenu : world) {
    if (allSubMenu.getText().trim().equals("World")) {
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
 public void subscribeClick(){
  driver.findElement(subscribe).click();
 }


 public void digital(){
  driver.findElement(digital).click();
 }


 public void fullName(String text){
  driver.findElement(fullName).sendKeys(text);
 }


 public void streetAddress(String text){
  driver.findElement(streetAddress).sendKeys(text);
 }


 public void streetAddress2(String text){
  driver.findElement(streetAddress2).sendKeys(text);
 }


 public void city(String text){
  driver.findElement(city).sendKeys(text);
 }


 public void postalCode(String number){
  driver.findElement(postalCode).sendKeys(number);
 }


 public void scrollDown1() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,400)");
 }

}


