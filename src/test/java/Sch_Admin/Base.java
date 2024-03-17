package Sch_Admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	public static WebDriver driver;
	
	
	@BeforeClass
	public void open_browser() {
		// opening browser
		ChromeOptions ch_options = new ChromeOptions();
		ch_options.addArguments("--disable-notifications");
		driver=new ChromeDriver(ch_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	}
	
	
	public void login() {
		// accessing website URL and login in
		driver.get("https://beta.leave.schedulize.co.uk/");
		if (driver != null) {
            driver.findElement(By.id("email")).sendKeys("coeandrew12@yopmail.com");
            driver.findElement(By.id("password")).sendKeys("coeandrew12@yopmail.com");
            driver.findElement(By.id("login")).click();
            {
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
 		    WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='close']")));
 		    //toast.click();
 		// Check if toast element exists before clicking
            if (toast != null) {
                toast.click();
            }
            }
            
         
        }
	}
	
	@Test
	public static void test() {
		
	}
//	@AfterClass
//	public void close_browser() {
//		//closing the browser
//		//driver.close();
//	}
	

	
}
