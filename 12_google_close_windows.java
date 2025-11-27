package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Slip12 {

	public static void main(String[] args) {
		
		int count=1;
		//@Test(invocationCount=3)
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Test executed for "+(count++)+"times");
		driver.quit();
		

	}

}
