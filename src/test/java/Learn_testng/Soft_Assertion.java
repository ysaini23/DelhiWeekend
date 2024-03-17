package Learn_testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class Soft_Assertion {
	public void ddws() {
		String expected_result="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demowebshop.tricentis.com/");
	    String actual_result = driver.getCurrentUrl();
	    SoftAssert sa =new SoftAssert();
	    sa.assertEquals(expected_result, actual_result,"It is not matching");
		System.out.println("Script is done");
		driver.close();
		sa.assertAll();      //use this assert all method at the end of the script otherwise it will not work.
	}
}
