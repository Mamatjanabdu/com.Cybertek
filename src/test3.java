import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/mohammedkashgari/Documents/Selenium_Dep/drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
    }
}