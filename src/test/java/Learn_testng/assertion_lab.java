package Learn_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class assertion_lab {
	public void ddws() {
		String expected_result="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demowebshop.tricentis.com/");
	    
	    //checking the url
	    String actual_result = driver.getCurrentUrl();
	    SoftAssert sa =new SoftAssert();
	    sa.assertEquals(expected_result, actual_result,"It is not matching");
		
	    WebElement txt1 = driver.findElement(By.id("small-searchterms"));
	    WebElement search1 = driver.findElement(By.xpath("//input[@value='Search']"));
	    
	    //text field is enabled or not
	    if(txt1.isEnabled())
	    {
	     System.out.print("Text box search is enabled.");
	     txt1.sendKeys("bag");
	     
	    }
	    else
	    {
	     System.out.print("Text box search is not enabled.");
	    }
	    
	    //search button is enabled or not
	    if(search1.isEnabled())
	    {
	     System.out.print("search button search is enabled.");
	     search1.click();
	    }
	    else
	    {
	     System.out.print("search button search is not enabled.");
	    }
	    
		driver.close();
		sa.assertAll();
	}
}



