package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip13 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String expected="Automation Testing Practice";
		String actual=driver.getTitle();
		
		if(expected.equals(actual))
			System.out.println("Actual and expected are same");
		else
			System.out.println("Actual and expected are not same");
		
		
		WebElement logo=driver.findElement(By.className("wikipedia-icon"));
		if(logo.isDisplayed())
			System.out.println("Logo is present on web page");
		else
			System.out.println("Logo is not present on web page");
		
		driver.findElement(By.className("wikipedia-icon")).click();
		
		WebElement search=driver.findElement(By.className("wikipedia-search-button"));
		if(search.isDisplayed())
			System.out.println("Search button is present on web page");
		else
			System.out.println("Search button is not present on web page");
		
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("Catholic Church");
		driver.findElement(By.className("wikipedia-search-button")).click();

	}

}
