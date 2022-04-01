package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_2_2_2_ShopOnTime {
    WebDriver driver;


 public By featured = By.xpath("//body/div[3]/div[2]/div[1]/div[1]/a[1]/img[1]");
 public By cover = By.xpath("//body/div[3]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/a[1]/img[1]");
 public By pricebox = By.xpath("/html/body/main/div[3]/div[1]/div[6]/a[1]/div[2]/span");

 public By printclick = By.xpath("/html/body/main/div[3]/div[8]/div/div[1]/div[1]/button");
 public By printsizeclick = By.xpath("/html/body/main/div[3]/div[8]/div/div[1]/div[3]/button[4]");

 public By canvaswrap = By.xpath("//button[@id='buttonSimpleSelectedCanvasWrap']");
 public By rolledcanvasclick = By.xpath("/html/body/main/div[3]/div[8]/div/div[2]/div/button[5]");

 public By canvastype = By.xpath("//button[@id='buttonSimpleSelectedPaper']");
 public By canvastypeclick = By.xpath("//button[@id='buttonSimplePaper_paper13cx']");

 public By framemenuclick = By.xpath("//button[@id='buttonSimpleSelectedFrame']");
 public By framecolor = By.xpath("//button[@id='buttonSimpleSelectedFrameColor']");
 public By colorclick = By.xpath("//button[@id='buttonSimpleFrameColor_Silver']");
 public By frameclick = By.xpath("/html/body/main/div[3]/div[8]/div/div[4]/div/button[1]/img");

 public By addtocurt = By.xpath("/html/body/main/div[3]/div[6]/div[1]/div[2]/button");




 public TC_2_2_2_ShopOnTime(WebDriver driver){
     this.driver=driver;
 }

 public void scrollDown1() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,300)");
 }

//Xpath of clickable Sub menu
 public By ShopTime = By.xpath("//header/nav[2]/section[1]/section[2]/ul[1]/li[5]");

 //This function helps us to find the submenu of main menu. if main menu already click. Then, this function will be implemented to find sub menu.
 public void shopTime(){
  JavascriptExecutor js = (JavascriptExecutor) driver;
  WebElement Shoptime = driver.findElement(ShopTime);
  js.executeScript("arguments[0].scrollIntoView();", Shoptime);
 }

 //Just click the sub menu Button
 public void shopthetime(){
  driver.findElement(ShopTime).click();
 }

 public void scrollDown() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,800)");
 }

 public void featuredClick() {
  driver.findElement(featured).click();
 }
 public void coverClick() {
  driver.findElement(cover).click();
 }
 public void priceboxClick() {
  driver.findElement(pricebox).click();
 }
 public void printClick() {
  driver.findElement(printclick).click();
 }

 public void printSizeClick() {
  driver.findElement(printsizeclick).click();
 }

 public void canvasWrap() {
  driver.findElement(canvaswrap).click();
 }

 public void canvasWrapClick() {
  driver.findElement(rolledcanvasclick).click();
 }

 public void canvasType() {
  driver.findElement(canvastype).click();
 }
 public void canvasTypeClick() {
  driver.findElement(canvastypeclick).click();
 }
 public void frameMenuClick() {
  driver.findElement(framemenuclick).click();
 }
 public void frameColor() {
  driver.findElement(framecolor).click();
 }
 public void frameColorClick() {
  driver.findElement(colorclick).click();
 }
 public void frameClick() {
  driver.findElement(frameclick).click();
 }
 public void addToCurt() {
  driver.findElement(addtocurt).click();
 }
}


