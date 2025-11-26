package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip6 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String expected="Swag Labs";
		String actual=driver.getTitle();
		if(expected.equals(actual))
			System.out.println("Actual and expected title is same");
		else
			System.out.println("Actual and expected title is not same");
		
		WebElement logo=driver.findElement(By.className("login_logo"));
		if(logo.isDisplayed())
			System.out.println("Logo is displayed on web page");
		else
			System.out.println("Logo is not displayed on web page");
		
	}

}
