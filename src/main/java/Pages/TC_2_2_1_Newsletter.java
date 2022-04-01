package Pages;
import org.openqa.selenium.*;


public class TC_2_2_1_Newsletter {
    WebDriver driver;


 public By checkbox1 = By.xpath("//input[@id='inside-newsletter']");
 public By checkbox2 = By.xpath("//input[@id='thebrief-newsletter']");
 public By checkbox3 = By.xpath("//input[@id='health-newsletter']");
 public By selectAll = By.xpath("//body/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]");

 public By FB = By.xpath("//body/div[1]/footer[1]/div[2]/span[1]/a[1]/*[1]");
 public By IG = By.xpath("//body/div[1]/footer[1]/div[2]/span[2]/a[1]/*[1]");
 public By TW = By.xpath("//body/div[1]/footer[1]/div[2]/span[3]/a[1]/*[1]");
 public By PT = By.xpath("//body/div[1]/footer[1]/div[2]/span[4]/a[1]/*[1]");


 public TC_2_2_1_Newsletter(WebDriver driver){
     this.driver=driver;
 }

 public void scrollDown3() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,3000)");
 }

//Xpath of clickable Sub menu
 public By newsletter = By.xpath("//header/nav[2]/section[1]/section[2]/ul[1]/li[1]/a[1]");

 //This function helps us to find the submenu of main menu. if main menu already click. Then, this function will be implemented to find sub menu.
 public void news(){
  JavascriptExecutor js = (JavascriptExecutor) driver;
  WebElement new1 = driver.findElement(newsletter);
  js.executeScript("arguments[0].scrollIntoView();", new1);
 }

 //Just click the sub menu Button
 public void newsclick(){
  driver.findElement(newsletter).click();
 }

 public void scrollDown() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,200)");
 }

 public void checkboxClick1() {
  driver.findElement(checkbox1).click();
 }
 public void checkboxClick2() {
  driver.findElement(checkbox2).click();
 }
 public void checkboxClick3() {
  driver.findElement(checkbox3).click();
 }
 public void selectAll() {
  driver.findElement(selectAll).click();
 }


 public void scrollDown1() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,5000)");

 }

 public void FB(){
  driver.findElement(FB).click();
 }

 public void IG(){
  driver.findElement(IG).click();
 }


 public void TW(){
  driver.findElement(TW).click();
 }

 public void PT(){
  driver.findElement(PT).click();
 }

}


