package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Slip9 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("Link count:"+link.size());
		for(WebElement e:link)
			System.out.println(e.getText());
		driver.quit();

	}

}
