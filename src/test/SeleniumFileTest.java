import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;

public class SeleniumFileTest {
    @Test
    public void testgooglrsearch() {
        System.setProperty("webdriver.gecko.driver","./lib/geckodriver.exe");

        // WebDriver driver1 = new RemoteWebDriver("http://localhost:9515",
        // DesiredCapabilities.chrome());
        // driver1.get("http://www.google.com");

        WebDriver driver = new FirefoxDriver();

        // it will open the goggle page
        driver.get("https://opensource-demo.orangehrmlive.com");
        // we expect the title “Google “ should be present
        String Expectedtitle = "OrangeHRM";
        // it will fetch the actual title
        String Actualtitle = driver.getTitle();
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
        // it will compare actual title and expected title
        assertEquals(Actualtitle, Expectedtitle);
        // print out the result
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
    }

    @Test
    public void alwaysTrue() {
        assertTrue(true);
    }
}