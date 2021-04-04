import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.net.URL;
import java.net.MalformedURLException;

public class SeleniumFileTest {
    @Test
    public void testgooglrsearch() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "77.0");
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one
        capabilities.setCapability("build", "LambdaTestSampleApp");
        capabilities.setCapability("name", "LambdaTestJavaSample");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs

 capabilities.setCapability("selenium_version","4.0.0-alpha-2");
         capabilities.setCapability("timezone","UTC+05:30");
         capabilities.setCapability("geoLocation","IN");
         capabilities.setCapability("chrome.driver","78.0");
        try {
            WebDriver driver = new RemoteWebDriver(new URL("https://www.google.com"), capabilities);
            driver.getTitle();
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
        
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.setProperty("webdriver.gecko.driver","./lib/geckodriver.exe");

        // WebDriver driver1 = new RemoteWebDriver("http://localhost:9515",DesiredCapabilities.firefox());
        // driver1.get("http://www.google.com");

        //WebDriver driver = new FirefoxDriver();
        //driver.getTitle();
        // it will open the goggle page
        // driver.get("https://opensource-demo.orangehrmlive.com");
        // // we expect the title “Google “ should be present
        // String Expectedtitle = "OrangeHRM";
        // // it will fetch the actual title
        // String Actualtitle = driver.getTitle();
        // System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
        // // it will compare actual title and expected title
        // assertEquals(Actualtitle, Expectedtitle);
        // // print out the result
        // System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
    }

    @Test
    public void alwaysTrue() {
        assertTrue(true);
    }
}