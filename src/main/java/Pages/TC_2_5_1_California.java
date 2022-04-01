package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_2_5_1_California {
    WebDriver driver;

 public TC_2_5_1_California(WebDriver driver){
     this.driver=driver;
 }


 public By california = By.xpath("/html/body/header/nav[2]/section/section[5]/ul/li[2]/a");


 public void California(){
  JavascriptExecutor js = (JavascriptExecutor) driver;
  WebElement California = driver.findElement(california);
  js.executeScript("arguments[0].scrollIntoView();", California);
 }


 public void CaliforniaClick() {
  driver.findElement(california).click();
 }


 public void scrollDown1() {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,1500)");
 }


 public By toptoback = By.xpath("/html/body/ol[13]/p[7]/a");

 public void topToBack(){
  driver.findElement(toptoback).click();
 }

}


