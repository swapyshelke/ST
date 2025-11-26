package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user5\\eclipse-workspace\\practical\\slips\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://garwarecollege.mespune.in/");

		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scr, new File("C:\\Users\\user5\\OneDrive\\Desktop\\screen.png"));
		
		driver.quit();
		

	}

}
