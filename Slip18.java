package test2;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Slip18 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user5\\eclipse-workspace\\practical\\slips\\chromedriver.exe");
		WebDriver driver;
		ChromeOptions options=new ChromeOptions();
		HashMap<String, Object> chromePrefs=new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		String file=System.getProperty("user.dir");
		chromePrefs.put("download.default_directory", file);
		options.setExperimentalOption("prefs", chromePrefs);
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();

	}

}
