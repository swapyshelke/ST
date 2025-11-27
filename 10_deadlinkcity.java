package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;

public class Slip10 {

	public static void main(String[] args) {
		
	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("http://www.deadlinkcity.com/");

	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        System.out.println("Total Links Found: " + links.size());

	        for (WebElement element : links) {

	            String url = element.getAttribute("href");

	            if (url == null || url.isEmpty()) {
	                System.out.println("URL is empty");
	                continue;
	            }

	            try {
	                URL link = new URL(url);
	                HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
	                httpConn.setConnectTimeout(3000);
	                httpConn.connect();

	                int responseCode = httpConn.getResponseCode();

	                if (responseCode >= 400) {
	                    System.out.println(url + " --> Broken Link");
	                } else {
	                    System.out.println(url + " --> Valid Link");
	                }

	            } catch (Exception e) {
	                System.out.println(url + " --> Exception occurred");
	            }
	        }

	        driver.quit();

	}

}
