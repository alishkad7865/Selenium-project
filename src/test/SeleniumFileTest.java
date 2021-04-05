import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.net.URL;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;

public class SeleniumFileTest {
    WebDriver driver;
    String Expectedtitle = "";
    String Actualtitle="";
    
    @Before
    public void setup(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "89");
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one
        capabilities.setCapability("build", "LambdaTestSampleApp");
        capabilities.setCapability("name", "LambdaTestJavaSample");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs

 capabilities.setCapability("selenium_version","4.0.0-alpha-7");
         capabilities.setCapability("timezone","UTC+05:30");
         capabilities.setCapability("geoLocation","IN");
         capabilities.setCapability("chrome.driver","89");
         
         //driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test
    public void testgooglrsearch() {
        ChromeDriver driver= new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","./lib/geckodriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.getTitle();
        // we expect the title “Google “ should be present
        Expectedtitle = "OrangeHRM";
        // it will fetch the actual title
        Actualtitle = driver.getTitle();
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
        // it will compare actual title and expected title
        assertEquals(Actualtitle, Expectedtitle);
        // print out the result
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
    }

    @AfterClass
    public void close(){
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void alwaysTrue() {
        assertTrue(true);
    }
}