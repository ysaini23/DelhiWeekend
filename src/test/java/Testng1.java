import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng1 {
    @Test(priority=0,invocationCount=2,threadPoolSize=3)
    public void easemyTrip() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com/");
        driver.close(); 
        Reporter.log("easemyTrip",true);
    }
    
    @Test(priority=-1)
    public void redbus() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        driver.close(); 
        Reporter.log("RedBus",true);
    }
    
    @Test(priority=1)
    public void fb() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/nopCommerce");
        driver.close(); 
        Reporter.log("fb",true);
    }
}

