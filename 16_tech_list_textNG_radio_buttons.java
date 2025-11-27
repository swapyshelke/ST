package test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip16 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Number of radio buttons on web page is:"+radios.size());
		driver.quit();

	}

}
