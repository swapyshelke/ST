package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;

public class Slip5 {
	
	//@Test(dataProvider="checkdata")
   public void TestCheck(String country,String place) {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.findElement(By.id("input")).sendKeys(country,place);
   }
			
}
