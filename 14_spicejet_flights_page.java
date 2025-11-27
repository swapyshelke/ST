import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetTest {

    public static void main(String[] args) throws InterruptedException {

        // 1. Launch Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // 2. Get the URL
        driver.get("https://www.spicejet.com/");

        // Wait for page to load
        Thread.sleep(5000);

        // 3. Verify Search Flights Section
        // SpiceJet has a search button labelled "Search Flight"
        try {
            WebElement searchButton = driver.findElement(By.xpath("//div[contains(text(), 'Search Flight')]"));

            if (searchButton.isDisplayed()) {
                System.out.println("TEST PASSED: Search Flights page is visible.");
            } else {
                System.out.println("TEST FAILED: Search Flights page is NOT visible.");
            }
        } catch (Exception e) {
            System.out.println("TEST FAILED: Search Flights section not found.");
        }

        // Close browser
        driver.quit();
    }
}
