package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Slip7 {

	public static void main(String[] args) {
		
		String browserName="firefox";
		WebDriver driver;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.get("https://firebox.com/");
		}
		else {
			System.out.println("Please provide valid browser name");
		}

	}

}
