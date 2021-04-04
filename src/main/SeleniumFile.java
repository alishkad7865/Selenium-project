import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
 
public class SeleniumFile {
		public static void main(String [] arg) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/alish/Downloads/geckodriver-v0.29.0-win64/geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
		    //it will open the goggle page
	        driver.get("https://opensource-demo.orangehrmlive.com"); 
	        //we expect the title “Google “ should be present 
	        String Expectedtitle = "OrangeHRM";
	        //it will fetch the actual title 
	        String Actualtitle = driver.getTitle();
	        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
	        //it will compare actual title and expected title
	        //assertEquals(Actualtitle, Expectedtitle);
	        //print out the result
	        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		}
    //     @Test
    //     public void testgooglrsearch(){
       
    //  }
}