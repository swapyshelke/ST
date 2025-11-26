package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip15 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		driver.findElement(By.id("firstName")).sendKeys("Dipali");
		driver.findElement(By.id("lastName")).sendKeys("Kolage");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("hindichbx")).click();
		driver.findElement(By.id("email")).sendKeys("kolagedipali15@gmail.com");
		driver.findElement(By.id("password")).sendKeys("DIPALIk@16");
		driver.findElement(By.id("registerbtn")).click();

	}

}
