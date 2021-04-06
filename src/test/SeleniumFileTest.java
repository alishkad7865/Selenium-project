import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs

 capabilities.setCapability("selenium_version","4.0.0-alpha-7");
         capabilities.setCapability("chrome.driver","89");
         System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","./lib/geckodriver.exe");
        driver= new FirefoxDriver();
         //driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test
    public void testgooglrsearch() {
        System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","./lib/geckodriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.getTitle();
        Expectedtitle = "OrangeHRM";
        Actualtitle = driver.getTitle();
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
        assertEquals(Actualtitle, Expectedtitle);
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
    }

    @Test
    public void loginTest(){
        System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","./lib/geckodriver.exe");
        driver= new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        WebElement username=driver.findElement(By.id("txtUsername"));
        WebElement password=driver.findElement(By.id("txtPassword"));
        WebElement login=driver.findElement(By.id("btnLogin"));
        
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        login.click();
        String actualUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        String expectedUrl= driver.getCurrentUrl();
        assertEquals(expectedUrl,actualUrl);
    }

    @Test
    public void loginTest_fail(){
        System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","./lib/geckodriver.exe");
        driver= new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        WebElement username=driver.findElement(By.id("txtUsername"));
        WebElement password=driver.findElement(By.id("txtPassword"));
        WebElement login=driver.findElement(By.id("btnLogin"));
        
        username.sendKeys("IAmAdmin");
        password.sendKeys("admin123");
        login.click();
        String actualUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        String expectedUrl= driver.getCurrentUrl();
        assertNotEquals(expectedUrl,actualUrl);
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
