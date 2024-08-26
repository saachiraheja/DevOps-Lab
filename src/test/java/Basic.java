import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Basic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/drivers.edgedriver_win64/msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        // options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.google.com");
        driver.quit();
    }
}
